package assignment07;

public abstract class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			throw new IllegalArgumentException("Balance is negative.");
		}

	}

	public abstract void monthlyAdjustment();

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Cant deposit negative number or amount 0");
		} else {
			balance += amount;
		}

	}

	public double withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Cant withdraw negative number or amount 0");
		} else if (amount > balance) {
			throw new IllegalArgumentException("not enough $ to deposit");
		} else {
			balance -= amount;
			return amount;
		}
	}

	@Override // good habit to include
	public String toString() {
		return String.format("Acct. has $%.2f", balance);
	}

}
