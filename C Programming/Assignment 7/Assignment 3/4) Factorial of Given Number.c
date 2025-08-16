#include<stdio.h>
void Fact(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Fact(&No); //function call
}
void Fact(int* No)	
{

	int i=1,fact=1;
	while(i<=*No)
	{
		fact=fact*i;
		i++;
	}
	printf("Factorial of %d is %d",*No,fact);
}