#include<stdio.h>
void main()
{
	int units,Bill;
	printf("Enter Units : ");
	scanf("%d",&units);
	if(units>=1 && units<=50)
	{
		Bill=units*30;
		printf("Bill=%d",Bill);
	}
	else if(units>=51 && units<=150)
	{
		Bill=units*40;
		printf("Bill=%d",Bill);
	}
	else
	{
		Bill=units*50;
		printf("Bill=%d",Bill);
	}
}