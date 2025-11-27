package model;

import java.time.LocalDate;

public class SavingsAccount extends Account
{
	final double minBalance=10000;
	double interestRate=0.03;
	
	public SavingsAccount(String accountnumber, String holdername, double balance, LocalDate creationdate,Transaction[] dailytxn, int count, double interestRate) 
	{
		super(accountnumber, holdername, balance, creationdate, dailytxn, count);
		this.interestRate = interestRate;
	}


	public void calculateInterest()
	{
		if(balance>=minBalance)
		{
			double interest=balance*interestRate;
			balance=balance+interest;
			System.out.println("Interest added : "+interest);
		}
		else
		{
			System.out.println("No interest added..");
		}
	}
	
	
	public void  withdraw(double amount,Transaction t)
	{
		if(amount<=0)
		{
			System.out.println("Invalid amount..");
			return;
		}
		 if((balance-amount)>=minBalance)
		 {
			 balance=balance-amount;
			 addTransaction(t);
			 System.out.println("Withdrawal successful..");
		 }
		 else
		 {
			 System.out.println("Can't withdraw amount..");
		 }
	}
	
	
	public String getTransactionDetails()
	{
		return super.getTransactionDetails()+"\nInterest Rate : "+interestRate;
	}

}//SavingsAccount class ends here
