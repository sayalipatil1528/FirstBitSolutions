import java.util.Scanner;
class BankAccount
{
	int accNumber;
	String HolderName;
	double currentBalance;
	static double interestRate;

	static 
	{
		interestRate=12.5;
	}

	BankAccount()//Default
	{
		System.out.println("Default constructor called");
		this.accNumber=3;
		this.HolderName="Harsh";
		this.currentBalance=4000;
		
	}

	BankAccount(int i,String n,double c)//Parameterized
	{
		System.out.println("Parameterized constructor called");
		this.accNumber=i;
		this.HolderName=n;
		this.currentBalance=c;
		//this.interestRate=r;
		
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
	static void setInterestRate(double ir)
	{
		interestRate=ir;
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
		/*Scanner sc=new Scanner(System.in);
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
		BankAccount b2=new BankAccount(ano,name,bal,rate);
		BankAccount b3=new BankAccount(ano,name,bal,rate); */

		
		BankAccount b1=new BankAccount(1234,"Pratiksha",2000);
		b1.display();

		BankAccount b2=new BankAccount(8239,"Amit",6785);
		b2.display();

		BankAccount b3=new BankAccount(007,"Gabber",1);
		b3.display();

		BankAccount.setInterestRate(7.8);
		//b1.setInterestRate(12);
		//b2.setInterestRate(13);
		//b3.setInterestRate(14);
		b1.display();
		b2.display();
		b3.display();

	
	}//main ends here
}//TestBankAccount class ends here
		
		