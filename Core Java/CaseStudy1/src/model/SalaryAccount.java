package model;

import java.time.LocalDate;
import java.time.Period;


public class SalaryAccount extends Account
{
	final double minBalance=10000;
	LocalDate lastTransactionDate;
	final int freezePeriodMonth=2;
	boolean isFrozen;
	
	public SalaryAccount(String accountnumber, String holdername, double balance, LocalDate creationdate,Transaction[] dailytxn, int count, LocalDate lastTransactionDate, boolean isFrozen)
	{
		super(accountnumber, holdername, balance, creationdate, dailytxn, count);
		this.lastTransactionDate = lastTransactionDate;
		this.isFrozen = false;
	}
	
	public void checkAccountStatus()
	{
		Period diff = Period.between(lastTransactionDate, LocalDate.now());
        int months = diff.getMonths();
		if(months>=freezePeriodMonth)
			freezeAccount();
	}

	private void freezeAccount() 
	{
		isFrozen=true;
		notifyAccountHolder();
		
	}
	 
	private void unFreezeAccount() 
	{
		isFrozen=false;
		System.out.println("Salary Account "+accountnumber+ "is now active..");
	}
	
	
	private void notifyAccountHolder()
	{
		if(isFrozen)
		{
			System.out.println("Notification for "+holdername+"Your Account : "+accountnumber+"is not active");
		}
		
		else
		{
			System.out.println("your salary account active again.Thank You!");
		}
	}
	
	
	public void deposit(double amount,Transaction t) 
	{
		checkAccountStatus();
		
		if(isFrozen && amount<minBalance)
		{
			System.out.println("Account is frozen.. Deposit atleast "+minBalance+"to unfreeze");
			return;
		}
		
		balance=balance+amount;
		lastTransactionDate=LocalDate.now();
		addTransaction(t);
		
		if(balance>=minBalance && isFrozen)
		{
			unFreezeAccount();
		}
		
		System.out.println("Deposited "+amount+"successfully");
	}
	
	
	public void withdraw(double amount,Transaction t)
	{
		checkAccountStatus();
		
		 if(isFrozen)
		 {
			 System.out.println("Withdrawal not allowed.Account is frozen!");
			 return;
		 }
		 
		 if(balance-amount<minBalance)
		 {
			 System.out.println("can't withdraw!");
			 return;
		 }
		 
		 balance=balance-amount;
		 lastTransactionDate=LocalDate.now();
		 addTransaction(t);
		 System.out.println("Withdraw : "+amount);
	 }

	public void calculateInterest()
	{
		double interestRate=0.04;
		if(balance>=minBalance)
		{
			double interest=balance*interestRate;
			balance=balance+interest;
			System.out.println("Interest added : "+interest);
		}
		else
		{
			System.out.println("No interest..");
		}
	}
	
	
	public String getTransactionDetails()
	{
		return super.getTransactionDetails()+"Minimum Balance : "+minBalance+"\nLast Transaction Date : "+lastTransactionDate+"\nAccount Frozen : "+isFrozen;
	}

}//SalaryAccount class ends here

