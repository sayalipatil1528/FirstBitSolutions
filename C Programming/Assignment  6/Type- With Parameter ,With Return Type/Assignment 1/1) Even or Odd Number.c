#include<stdio.h>
int EvenOdd(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	int res=EvenOdd(No); //function call
	if(res==1)
		printf("%d is Even Number",No);
	else
		printf("%d is Odd Number",No);
}
int EvenOdd(int x)  //function defination
{
	
	if(x%2==0)
		return 1;
	else
		return 0;
}