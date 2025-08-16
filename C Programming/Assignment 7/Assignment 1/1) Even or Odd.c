#include<stdio.h>
void EvenOdd(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	EvenOdd(&No); //function call
}
void EvenOdd(int* x)  //function defination
{
	
	if(*x%2==0)
	{
		printf("%d is Even Number",*x);
	}
	else
	{
		printf("%d is Odd Number",*x);
	}
}

