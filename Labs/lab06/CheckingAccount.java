package lab06;
public class CheckingAccount extends BankAccount {
	private int withdrawLimit;
	private int withdrawCount = 0;
	
	public CheckingAccount(double balance, int limit) {
		super(balance);
		if (limit < 1) {
			throw new IllegalArgumentException("The withdraw limit must be postive");
		}
		else {this.withdrawLimit = limit;}
	}

	public int getWithdrawLimit() {
		return withdrawLimit;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}
	@Override
	public String toString() {
		return super.toString() + "(" + withdrawCount + "/" + withdrawLimit + ")";
	}
	@Override
	public double withdraw(double amount) {
		if (withdrawCount < withdrawLimit) {
			withdrawCount = withdrawCount + 1;
			return super.withdraw(amount);
		}
		else if (withdrawCount >= withdrawLimit) {
			return 0;
		}
		return 0;
	}
}
