#include<stdio.h>
#include<conio.h>
void main()
{
	int n=4,d=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			printf("%d ",d);
			d++;
		}
		printf("\n");
	}
}