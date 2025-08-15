#include<stdio.h>
int Fact(int);

void main()
{
	int Num;
	printf("Enter a Number : ");
	scanf("%d",&Num);
	int res=Fact(Num);
	printf("Factorial is =%d ",res);

}
int Fact(int No)
{
	int i=1,Fact=1;
	while(i<=No)
	{
		Fact=Fact*i;
		i++;
	}
	return Fact;		
}

				







