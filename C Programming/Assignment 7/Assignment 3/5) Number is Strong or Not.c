#include<stdio.h>
void Is_Strong(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Strong(&No); //function call
}
void Is_Strong(int* No)	
{

	int rem,sum=0;
	int temp=*No;
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
	if(*No==sum)
	{
		printf("Strong Number");
	}
	else
	{
		printf("Not Strong Number");
	}
}