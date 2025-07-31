#include<stdio.h>
#include<conio.h>
void main()
{
	int n=153,rem,temp,sum=0;
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