#include<stdio.h>
#include<conio.h>
void main()
{
	int exit=1;
	while(exit==1)
	{

		int no;
		printf("\nEnter a Number : \n");
		scanf("%d",&no);
		
		printf("Enter 1 ----> Number is even or odd. \n");
		printf("Enter 2 ----> Number is prime or not.\n");
		printf("Enter 3 ----> Number is pallindrome or not.\n");
		printf("Enter 4 ----> Number is positive, negative or zero.\n");
		printf("Enter 5 ----> To reverse a number.\n");
		printf("Enter 6 ----> To find sum of digits.\n");
		
		int choice;
		scanf("%d",&choice);
		
		if(choice==1)
		{
			
				
			if(no%2==0)
			{
				printf("%d is Even Number",no);
			}
			else
			{
				printf("%d is Odd Number",no);
			}
			
		}
		else if(choice==2)
		{
			int flag=0;
			int temp=no;
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
				printf("%d is prime number",no);
			}
			else
			{
				printf("%d is not prime number",no);
			}
		}
		else if(choice==3)
		{
			int r1,rev=0,temp;
			temp=no;
			while(temp!=0)
			{
				r1=temp%10;
				rev=rev*10+r1;
				temp=temp/10;
			}
			if(no==rev)
			{
				printf("%d is Palindrome Number",no);
			}
			else
			{
				printf("%d is Not Palindrome Number",no);
			}
		}
		else if(choice==4)
		{
			if(no>0)
			{
				printf("%d is Positive Number",no);
			}
			else if(no<0)
			{
				printf("%d is Negative Number",no);
			}
			else
			{
				printf("Zero");
			}
		}
		else if(choice==5)
		{
			int r1,r2,r3;
			int temp=no;
			int q1,rev;
			
			r1=temp%10;
			q1=temp/10;
			r2=q1%10;
			r3=q1/10;
			
			rev=r1*100+r2*10+r3;
			
			printf("Reverse of %d is %d",no,rev);
		}
		else if(choice==6)
		{
			int temp=no;
			int r1,sum=0;
			while(temp>0)
			{
				r1=temp%10;
				sum=sum+r1;
				temp=temp/10;
			}
			printf("Sum of Digits = %d",sum);
		}
		else
		{
			exit= 0;
		}
	}
	
}