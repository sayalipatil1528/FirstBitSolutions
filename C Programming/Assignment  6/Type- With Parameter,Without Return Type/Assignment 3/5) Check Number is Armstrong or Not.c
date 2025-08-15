#include<stdio.h>
void Is_Armstrong(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Armstrong(No); //function call
}
void Is_Armstrong(int n)	
{

	int rem,temp,sum=0;
	temp=n;
	while(temp>0)
	{
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	if(n==sum)
	{
		printf("%d is Armstrong Number",n);
	}
	else
	{
		printf("%d is Not Armstrong Number",n);
	}
}