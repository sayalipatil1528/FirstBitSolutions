#include<stdio.h>
void main()
{
	int no;
	printf("Enter a Number : ");
	scanf("%d",&no);
	if(no>0)
	{
		printf("%d is Positive",no);
	}
	else if(no<0)
	{
		printf("%d is Negative",no);
	}
	else
	{
		printf("Neutral or Zero");
	}
}