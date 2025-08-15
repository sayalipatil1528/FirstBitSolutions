#include<stdio.h>
void Is_Prime(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Prime(No); //function call
}
void Is_Prime(int No)	
{

	int flag=0,i=2;
	while(i<=No/2)
	{
		if(No%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag==0)
	{
		printf("%d is prime",No);
	}
	else                                                                       
	{
		printf("%d is not prime",No);
	}
}