#include<stdio.h>
void main()
{
	for(int i=10;i<=25;i++)
	{
		if(i%2!=0)
			printf("%d ",i);
	}
	for(int i=1;i<=15;i++)
	{
		if(i%2==0)
			printf("\n%d ",i);
	}
}