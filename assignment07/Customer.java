package assignment07;

public class Customer {

	private String name;
	private int idNum;
	private BankAccount mySavings; 
	private BankAccount myChecking;

	public Customer(String nm, int id, SavingsAccount savings, CheckingAccount checking) {
		super();
		this.name = nm;
		this.idNum = id;
		this.mySavings = savings; 
		this.myChecking = checking; 
	}

	public BankAccount getMySavings() {
		return (SavingsAccount)mySavings;
	}

	public BankAccount getMyChecking() {
		return (CheckingAccount)myChecking;
	}

	public String getName() {
		return name;
	}

	public int getIdNum() {
		return idNum;
	}

	public double getMySavingsBalance() {
		if (mySavings == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			return mySavings.getBalance();
		}
	}

	public double getMyCheckingBalance() {
		if (myChecking == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			return myChecking.getBalance();
		}
	}

	public void monthlyAdjustment() {
		if (mySavings == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			mySavings.monthlyAdjustment();
		}
		if (myChecking == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			myChecking.monthlyAdjustment();
		}
	}

	public boolean hasSavingsAccount() {
		if (mySavings == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			return true;
		}
	}

	public boolean hasCheckingAccount() {
		if (myChecking == null) {
			throw new UnsupportedOperationException("Can not be null");
		} else {
			return true;
		}
	}

	public void depositSavings(double amount) {
		if (mySavings != null) {
			mySavings.deposit(amount);
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}

	public void depositChecking(double amount) {
		if (myChecking != null) {
			myChecking.deposit(amount);
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}
	
	public double withdrawSavings(double amount) {
		if (mySavings != null) {
			return mySavings.withdraw(amount);
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}
	
	public double writeCheck(double amount) {
		if (myChecking != null) {
			return ((CheckingAccount) myChecking).writeCheck(amount);
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}

	int getWithdrawCount() {
		if (myChecking != null) {
			return ((CheckingAccount) myChecking).getWithdrawCount();
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}
	
	int getNextCheckNum() {
		if (myChecking != null) {
			return ((CheckingAccount) myChecking).getNextCheckNum();
		} else {
			throw new UnsupportedOperationException("Can not be null");
		}
	}
	
	
	@Override
	public String toString() {
		System.out.println();
		return String.format("Customer id:" + getIdNum() + ", " + getName() + "\t" + "Savings Account: %.2f" + "\t" 
				+ "Checking Account: %.2f", getMySavingsBalance(), getMySavingsBalance());
	}
	
	
	
	
}