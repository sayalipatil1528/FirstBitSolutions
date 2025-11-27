package model;

import java.util.Date;

public class Transaction 
{
	String transactionId;
	Date transactionDate;
	String transactionType; //deposit,withdraw
	double amount;
	double balanceAfter;
	
	public Transaction(String transactionId, Date transactionDate, String transactionType, double amount,
			double balanceAfter) 
	{
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
		this.balanceAfter = balanceAfter;
	}
	
	 String getTransactionDetails()
	{
		return "Transaction Id : \n"+transactionId+"Transaction Date : \n"+this.transactionDate+"Transaction Type : \n"+transactionType+"Amount : \n"+amount+"Balance after transaction : \n";
		
	}

}//Transaction class ends here
