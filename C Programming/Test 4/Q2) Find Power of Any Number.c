#include<stdio.h>
void main()
{
	int b,e,power=1;
	printf("Enter Base And Exponent : ");
	scanf("%d%d",&b,&e);
	
	for(int i=1;i<=e;i++)
	{
		power=power*b;
	}
	
	printf("Power of %d^%d is %d ",b,e,power);
}