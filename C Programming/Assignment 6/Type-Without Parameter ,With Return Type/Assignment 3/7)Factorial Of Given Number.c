#include<stdio.h>
int Fact();

void main()
{
	int res;
	res=Fact();
	printf("Factorial is =%d ",res);

	
	
}
int Fact()
{
	int No=5,i=1,Fact=1;
	while(i<=No)
	{
		Fact=Fact*i;
		i++;
	}
	return Fact;		
}

				







