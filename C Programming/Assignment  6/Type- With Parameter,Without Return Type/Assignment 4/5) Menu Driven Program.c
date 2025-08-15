#include<stdio.h>
void Is_EvenOdd(int); //function declaration
void Is_Prime(int);
void Is_Palindrome(int);
void Is_NumCheck(int);
void Reverse(int);
void Find_Sum(int);
void main()
{
	int exit=1;
	while(exit==1)
	{
		int No;
		
		printf("Enter a Number : ");
		scanf("%d",&No);
		
		int choice;
		printf("Enter a Choice : ");
		scanf("%d",&choice);
		if(choice==1)
		{
			Is_EvenOdd(No); //function call
		}
		else if(choice==2)
		{
			Is_Prime(No);
		}
		else if(choice==3)
		{
			Is_Palindrome(No);
		}
		else if(choice==4)
		{
			Is_NumCheck(No);
		}
		else if(choice==5)
		{
			Reverse(No);
		}
		else if(choice==6)
		{
			Find_Sum(No);	
		}
		else
		{
			exit=0;
		}
	}
}
void Is_EvenOdd(int n)	
{
	if(n%2==0)
	{
		printf("%d is Even Number \n",n);
	}
	else
	{
		printf("%d is Odd Number\n",n);
	}	
}

void Is_Prime(int n)	
{
	int flag=0;
	int temp=n;
	for(int i=2;i<=temp/2;i++)
	{
		if(temp%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)	
	{
		printf("%d is prime number\n",n);
	}
	else
	{
		printf("%d is not prime number\n",n);
	}
}

void Is_Palindrome(int n)	
{
	int r1,rev=0,temp;
	temp=n;
	while(temp!=0)
	{
		r1=temp%10;
		rev=rev*10+r1;
		temp=temp/10;
	}
	if(n==rev)
	{
		printf("%d is Palindrome Number\n",n);
	}
	else
	{
		printf("%d is Not Palindrome Number\n",n);
	}
}

void Is_NumCheck(int n)	
{
	if(n>0)
	{
		printf("%d is Positive Number\n",n);
	}
	else if(n<0)
	{
		printf("%d is Negative Number\n",n);
	}
	else
	{
		printf("Zero\n");
	}
}

void Reverse(int n)	
{
	int r1,r2,r3;
	int temp=n;
	int q1,rev;
	
	r1=temp%10;
	q1=temp/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	printf("Reverse of %d is %d\n",n,rev);
}

void Find_Sum(int n)	
{
	int temp=n;
	int r1,sum=0;
	while(temp>0)
	{
		r1=temp%10;
		sum=sum+r1;
		temp=temp/10;
	}
	printf("Sum of Digits = %d\n",sum);
}