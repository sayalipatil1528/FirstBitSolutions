#include<stdio.h>
int Is_Sum(int);

void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	int res=Is_Sum(No);
	
	printf("Sum=%d",res);
	
	
}
int Is_Sum(int Num)
{
	int ld,rem,sum;
	ld=Num%10;
	while(Num>0)
	{
		rem=Num%10;
		Num=Num/10;
	}
	sum=ld+rem;
		return sum;
		
}

				







