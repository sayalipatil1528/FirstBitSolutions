#include<stdio.h>
void deposit(double ,double );
void withdraw(double ,double );
void main()
{
	double balance=5000,amount;
	int choice;
	
	printf("Initial Balance in account : %lf\n",balance);
	
	printf("Enter the amount : ");
	scanf("%lf",&amount);
	
	printf("Choose an Option : ");
	printf("1.Deposit\n");
	printf("2.Withdraw\n");
	
	
	printf("Enter a choice: ");
	scanf("%d",&choice);
	
	if(choice==1)
	{
		deposit(balance,amount);
	}
	else if(choice==2)
	{
		withdraw(balance,amount);
	}
	else
	{
		printf("Invalid Choice");
	}
	
	
}
void deposit(double balance,double amount)
{
	balance=balance+amount;
	printf("Updated balance in accout is %lf",balance);
}
void withdraw(double balance,double amount)
{
	if(balance<3000)
	{
		printf("Can't withdraw the amount. Balance is not sufficient.'");
	}
	else
	{
		balance=balance-amount;
		printf("Updated balance in account is %lf",balance);
	}
}