package lab06;
public class BankAccount {
	private double balance;
	private int idnum;
	private static int numAccounts = 0;
	public BankAccount(double abalance) {
		this.balance = abalance;
		if (abalance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		idnum = numAccounts;
		numAccounts ++;
	}
	public double getBalance() {
		return balance;
	}
	public int getIdnum() {
		return idnum;
	}
	static void reset() {
		numAccounts =0;
	}
	@Override // good habit to include
	public String toString() {
		return ("Acct. #" + idnum + " has $" + balance +  " for an account with idNum = " + idnum + " and balance = " + balance);
		// should return the string "Acct. #3 has $50.0" for an account with idNum = 3 and balance = 50
	}
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("deposits must be done with postive values");
		}
		else {
			balance = balance +amount;
		}
	}
	public double withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraws must be done with postive values");
		} else if (amount > balance) {
			throw new IllegalArgumentException("Not enough in account to deposit");
		} else {
			balance -= amount;
			return amount;
		}
	}

}
