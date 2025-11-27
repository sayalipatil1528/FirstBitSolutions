package model;

import java.time.LocalDate;

public class LoanAccount extends Account
{
	double loanAmount;
	double interestRate;
	LocalDate loanStartDate;
	int tenureMonths;
	
	
	public LoanAccount(String accountnumber, String holdername, double balance, LocalDate creationdate,Transaction[] dailytxn, int count, double loanAmount, double interestRate, LocalDate loanStartDate,
			int tenureMonths) 
	{
		super(accountnumber, holdername, balance, creationdate, dailytxn, count);
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanStartDate = loanStartDate;
		this.tenureMonths = tenureMonths;
	}

	double getOutstandingAmount()
	{
		return loanAmount;
	}
	
	public void RepayLoan(double amount,Transaction t)
	{
		if(amount<=0)
		{
			System.out.println("Invalid repaymen amount");
			return;
		}
		
		if(loanAmount<=0)
		{
			System.out.println("Loan is already fully repaid..");
			return;
		}
		
		if(amount>balance)
		{
			System.out.println("Please deposit first..");
			return;
		}
		
		balance=balance-amount;
		loanAmount=loanAmount-amount;
		addTransaction(t);
		System.out.println("Payment done ...");
		
		if(loanAmount<=0)
		{
			loanAmount=0;
			System.out.println("Congratulations Loan fully repaid..");
		}
		
		else
		{
			System.out.println("Remaining Loan Amount : "+loanAmount);
		}
	}
	
	public void calculateInterest() 
	{
		if(loanAmount>0)
		{
			double monthlyRate=interestRate/12/100;
			double interest=loanAmount*monthlyRate;
			loanAmount=loanAmount+interest;
		}
		
	}
	
	public String getTransactionDetails()
	{
		return super.getTransactionDetails()+"\nLoan Amount Left : "+loanAmount+"\nInterest Rate : "+interestRate+"\nTenure(Months) : "+tenureMonths;
	}
	
}//LoanAccount class ends here
