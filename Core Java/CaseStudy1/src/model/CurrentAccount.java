package model;

import java.time.LocalDate;

public class CurrentAccount extends Account
{
	double overdraftlimit;
	double overdraftused;
	
	public CurrentAccount(String accountnumber, String holdername, double balance, LocalDate creationdate,Transaction[] dailytxn, int count, double overdraftlimit, double overdraftused) 
	{
		super(accountnumber, holdername, balance, creationdate, dailytxn, count);
		this.overdraftlimit = overdraftlimit;
		this.overdraftused = overdraftused;
	}


	public void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}
	
	double getAvailableBalance()
	{
		return balance+(overdraftlimit-overdraftused);
		
	}
	
	
	public void withdraw(double amount,Transaction t)
	{
		
		 if(amount<=0)
		 {
			 System.out.println("Invalid amount..");
			 return;
		 }
		 
		 if(amount<=balance)
		 {
			 balance=balance-amount;
			 addTransaction(t);
			 System.out.println("Withdraw : "+amount);
		 }
	}
	
	
	public void calculateInterest() 
	{
		System.out.println("No interest applicable for current account..");	
	}
	
	public String getTransactionDetails()
	{
		return super.getTransactionDetails()+"\nOverDraftLimit : "+overdraftlimit+"\nOverDraftUsed : "+overdraftused+"\nAvailable Balance : "+getAvailableBalance();
	}

}//CurrentAccount class ends here
