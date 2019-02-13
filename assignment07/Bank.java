package assignment07;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String bankName;
	private int nextAccNum = 10001;
	List<Customer> customers = new ArrayList<>();
	private double baseRate;
	private int baseCheckLimit;
	private double checkFee;

	public Bank(String abankName) {
		this.bankName = abankName;
	}

	public double getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(double baseRate) {
		if (baseRate < 0) {
			this.baseRate = baseRate;
		} else {
			throw new IllegalArgumentException("Base rate must be a postive number.");
		}
	}

	public int getBaseCheckLimit() {
		return baseCheckLimit;
	}

	public void setBaseCheckLimit(int baseCheckLimit) {
		if (baseCheckLimit < 0) {
			this.baseCheckLimit = baseCheckLimit;
		} else {
			throw new IllegalArgumentException("Base check must be a positive number.");
		}
	}

	public double getCheckFee() {
		return checkFee;
	}

	public void setCheckFee(double checkFee) {
		if (checkFee < 0) {
			this.checkFee = checkFee;
		} else {
			throw new IllegalArgumentException("Check fee must be a positive number.");
		}
	}

	public void doMonthlyAdjustment() {
		for(int i = 0; i < customers.size(); i++) {
			customers.get(i).monthlyAdjustment();
		}
	}
	
	void reset() {
		nextAccNum = 10001;
		customers.clear();
	}

	public void addCustomer(String name, double savingsInit, double checkingInit) {
		if (savingsInit >= 100) {
			new SavingsAccount(savingsInit, baseRate);
		}
		if (checkingInit >= 100) {
			new CheckingAccount(checkingInit, baseCheckLimit);
		}

		
		customers.add(new Customer(name, nextAccNum, new SavingsAccount(savingsInit, baseRate),
				new CheckingAccount(checkingInit, baseCheckLimit)));
		
		
		((CheckingAccount) customers.get(customers.size()).getMyChecking()).setCheckFee(getCheckFee());

		
		nextAccNum++;
	}
	
	public Customer getCustomer(int accId) {
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getIdNum() == accId) {
				return customers.get(i);
			}
		}
		return null;
	}
	
	public void report() {
		for(int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).toString());
		}
	}
	
	
	
	

}