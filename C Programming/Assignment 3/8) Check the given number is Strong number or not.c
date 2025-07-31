#include<stdio.h>
#include<conio.h>
void main()
{
	int No=145,rem,sum=0;
	int temp=No;
	while(temp>0)
	{
		rem=temp%10;
		int fact=1,i=1;
		while(i<=rem)
		{
			fact=fact*i;
		    
		    i++;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(No==sum)
	{
		printf("Strong Number");
	}
	else
	{
		printf("Not Strong Number");
	}
}