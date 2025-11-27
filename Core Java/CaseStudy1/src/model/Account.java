package model;
import java.time.LocalDate;


public abstract class Account
{
	String accountnumber;
	String holdername;
	double balance;
	LocalDate creationdate;
	Transaction []dailytxn;
	
	int count;
	
	static final int max_transaction=200;
	
	public Account(String accountnumber, String holdername, double balance, LocalDate creationdate, Transaction[] dailytxn,
			int count) 
	{
		this.accountnumber = accountnumber;
		this.holdername = holdername;
		this.balance = balance;
		this.creationdate = creationdate;
		this.dailytxn = new Transaction[max_transaction];
		this.count = 0;
	}

	
	void addTransaction(Transaction t)
	{
		if(count<max_transaction)
		{
			dailytxn[count++]=t;
		}
		else
		{
			System.out.println("Transaction limit reached..");
		}
	}

	public String getAccountNumber()
	{
		return accountnumber;
	}


	public double getBalance() 
	{
		return balance;
	}


	public void deposit(double amount,Transaction t) 
	{
		balance=balance+amount;
		addTransaction(t);
	}
	
	
	public void withdraw(double amount,Transaction t)
	{
		 if(balance>=amount)
		 {
			 balance=balance-amount;
			 addTransaction(t);
			 
		 }
		 else
		 {
			 System.out.println("Insufficient Balance!");
		 }
		 
	}
	
	
	public abstract void calculateInterest();
	
	
	public Transaction[] getTransactions() 
	{
		return dailytxn;
	}
	
	
	public String getTransactionDetails()
	{
		return "Account Number : \n"+this.accountnumber+"Account Holder Name : \n"+this.holdername+"Balance : \n"+this.balance+"Account created on : \n"+this.creationdate+"\n";
	}


	public int getTransactionCount() 
	{
		
		return count;
	}


	public String getHolderName() {
		
		return holdername;
	}
	
}//Account class ends here
