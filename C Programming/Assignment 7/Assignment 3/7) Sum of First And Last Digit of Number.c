#include<stdio.h>
void Is_Sum(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Sum(&No); //function call
}
void Is_Sum(int* Num)	
{

	int ld,rem,sum;
	ld=*Num%10;
	while(*Num>0)
	{
		rem=*Num%10;
		*Num=*Num/10;
	}
	sum=ld+rem;
	printf("%d",sum);
}