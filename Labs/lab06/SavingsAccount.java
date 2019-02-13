package lab06;
public class SavingsAccount extends BankAccount {
	private double rate;
	public SavingsAccount(double balance, double arate) {
		super(balance);
		if (rate <=0) {
			throw new IllegalArgumentException("Rate can not be negative");
		}
		else {
			this.rate = arate;
		}
	}

	@Override
	public void deposit(double amount){
		if (amount <= 0) {
			throw new IllegalArgumentException("deposits must be done with postive values");
		}
		else {
			super.deposit(rate * amount);
		}

	}


	public double getRate() {
		return rate;
	}
	
	@Override
	public String toString() {
		return super.toString() + " @ " + rate + "%";
	}
}
