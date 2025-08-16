#include<stdio.h>
void Is_Palindrome(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Palindrome(&No); //function call
}
void Is_Palindrome(int* num)  //function defination
{
	
	int r1,r2,r3;
	int q1,rev;
	
	r1=*num%10;
	q1=*num/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	if(*num==rev)
	{
		printf("Palindrome Number");
	}
	else
	{
		printf("Not Palindrome Number");
	}
}

