#include<stdio.h>
#include<conio.h>
void main()
{
	int No=121,r1,rev=0,temp;
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