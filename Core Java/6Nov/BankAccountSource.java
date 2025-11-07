import java.util.Scanner;
class BankAccount
{
	int accNumber;
	String HolderName;
	double currentBalance;
	double interestRate;

	
	BankAccount()//Default
	{
		System.out.println("Default constructor called");
		this.accNumber=3;
		this.HolderName="Harsh";
		this.currentBalance=4000;
		this.interestRate=9;
	}

	BankAccount(int i,String n,double c,double r)//Parameterized
	{
		System.out.println("Parameterized constructor called");
		this.accNumber=i;
		this.HolderName=n;
		this.currentBalance=c;
		this.interestRate=r;
	}
		
	//Setters
	void setAccNumber(int accno)
	{
		this.accNumber=accno;
	}
	void setHolderName(String nm)
	{
		this.HolderName=nm;
	}
	void setCurrentNBalance(double curbal)
	{
		this.currentBalance=curbal;
	}
	void setInterestRate(double ir)
	{
		this.interestRate=ir;
	}

	
	//Getters
	int getAccNumber()
	{
		return this.accNumber;
	}
	String getHolderName()
	{
		return this.HolderName;
	}
	double getCurrentBalance()
	{
		return this.currentBalance;
	}
	double getInterestRate()
	{
		return this.interestRate;
	}

	//display
	void display()
	{
		System.out.println("\nAccNumber : "+accNumber);
		System.out.println("HolderName : "+HolderName);
		System.out.println("CurrentBalance : "+currentBalance);
		System.out.println("InterestRate : "+interestRate);
	}
}//BankAccount class ends here

class TestBankAccount
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account Number : ");
		int ano=sc.nextInt();
		
		sc.nextLine();


		System.out.println("Enter holder name : ");
		String name=sc.nextLine();

		System.out.println("Enter current balance : ");
		double bal=sc.nextDouble();
	
		System.out.println("Enter interest rate : ");
		double rate=sc.nextDouble();

		BankAccount b1=new BankAccount(ano,name,bal,rate);
		b1.display();

	
	}//main ends here
}//TestBankAccount class ends here
		
		