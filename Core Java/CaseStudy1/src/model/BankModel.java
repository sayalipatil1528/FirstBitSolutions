package model;


public class BankModel 
{
	static final int max_acc=200;
	Account[] accounts;
	public int accountCounter;

		
	BankModel() 
	{
		accounts=new Account[max_acc];
		accountCounter=0;
		
	}


	public Account[] getAllAccounts() 
	{
		return accounts;
	}


	public Account getAccountByNumber(String accountNumber)
	{
		for(int i=0;i<accountCounter;i++)
		{
			if(accounts[i].getAccountNumber().equals(accountNumber))
			{
				return accounts[i];
				
			}
		}
		return null;
	}
	
	
	public boolean addAccount(Account account)
	{
		if(accountCounter>=max_acc)
		{
			return false;
		}
		accounts[accountCounter++]=account;
		return true;
	}
	
	
	public boolean deleteAccount(int index) 
	{
		if(index < 0 || index >=accountCounter)
		{
			return false;
		}
		
		for(int i=index;i<accountCounter-1;i++)
		{
			accounts[i]=accounts[i+1];
		}
		
		accounts[accountCounter-1]=null;
		accountCounter--;
		return true;
	}
	
	
	public Account searchAccount(int index)
	{
		if(index<0 || index>=accountCounter)
		{
			return null;
		}
		return accounts[index];
	}
	
	public void calculateDailyInterest()
	{
		for(int i=0;i<accountCounter;i++)
		{
			if(accounts[i]!=null)
			{
				accounts[i].calculateInterest();
			}
		}
	}
	
	
	public Report generateEndOfDayReport()
	{
		Report report=new Report();
		report.setAccountsCreated(accountCounter);
		
		
		for(int i=0;i<accountCounter;i++)
		{
			if(accounts[i]!=null)
			{
				Transaction[] transactions=  accounts[i].getTransactions();
				int tCount=accounts[i].getTransactionCount();
				
				for(int t=0;t<tCount;t++)
				{
					report.addTransaction(transactions[t]);
				}
			}
		}
		return report;
		
	}

}//BankModel class ends here


