#include<stdio.h>
void Is_Perfect(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Perfect(No); //function call
}
void Is_Perfect(int No)	
{

	int i=1,sum=0;
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