#include<stdio.h>
#include<conio.h>
void main()
{
	int No=13,flag=0,i=2;
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