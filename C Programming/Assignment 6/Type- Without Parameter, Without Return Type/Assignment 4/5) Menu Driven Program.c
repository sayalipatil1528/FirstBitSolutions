#include<stdio.h>
#include<conio.h>
void EvenOdd(); //function declaration
void  Is_Prime();
void Is_Palindrome();
void NumCheck();
void Reverse();
void sum();
void main()
{
	EvenOdd(); //function call
	Is_Prime();
	Is_Palindrome();
	NumCheck();
	Reverse();
	sum();
	
} //main() ends here
void EvenOdd()
{
	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
	if(no%2==0)
	{
		printf("%d is Even Number \n",no);
	}
	else
	{
		printf("%d is Odd Number \n",no);
	}	
		
}
 void Is_Prime()
 {
 	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
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
		printf("%d is prime number \n",no);
	}
	else
	{
		printf("%d is not prime number \n",no);
	}
 }
 
 void Is_Palindrome()
 {
 	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
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
		printf("%d is Palindrome Number \n",no);
	}
	else
	{
		printf("%d is Not Palindrome Number \n",no);
	}
 }
 
 void NumCheck()
 {
 	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
	if(no>0)
	{
		printf("%d is Positive Number \n",no);
	}
	else if(no<0)
	{
		printf("%d is Negative Number \n",no);
	}
	else
	{
		printf("Zero");
	}
 }
 
 void Reverse()
 {
 	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
	int r1,r2,r3;
	int temp=no;
	int q1,rev;
	
	r1=temp%10;
	q1=temp/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	printf("Reverse of %d is %d \n",no,rev);
 }
 
 void sum()
 {
 	int no;
	printf("Enter a Number : \n");
	scanf("%d",&no);
	
	int temp=no;
	int r1,sum=0;
	while(temp>0)
	{
		r1=temp%10;
		sum=sum+r1;
		temp=temp/10;
	}
	printf("Sum of Digits = %d \n",sum);
 }