#include<stdio.h>
#include<conio.h>
void main()
{
	int No=28,i=1,sum=0;
	while(i<No)
	{
		if(No%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(No==sum)
	{
		printf("%d is Perfect Number",No);
	}
	else
	{
		printf("%d is Not Perfect Number",No);
	}
}