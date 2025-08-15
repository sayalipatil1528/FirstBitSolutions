#include<stdio.h>
void Is_Palindrome(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Palindrome(No); //function call
}
void Is_Palindrome(int No)	
{

	int r1,rev=0,temp;
	temp=No;
	while(temp!=0)
	{
		r1=temp%10;
		rev=rev*10+r1;
		temp=temp/10;
	}
	if(No==rev)
	{
		printf("Palindrome Number");
	}
	else
	{
		printf("Not Palindrome Number");
	}
}