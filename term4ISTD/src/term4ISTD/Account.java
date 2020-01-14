package term4ISTD;

import java.util.Date;

public class Account {
	
	private int id;
	private static double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void setBalance(double newBalance) {
		balance = newBalance;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;
	}
	
	public double getMonthlyInterest() {
		return (getMonthlyInterestRate()/100)*getBalance();
	}
	
	public void withdraw(double withdrawAmount) {
		this.balance -= withdrawAmount;
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
