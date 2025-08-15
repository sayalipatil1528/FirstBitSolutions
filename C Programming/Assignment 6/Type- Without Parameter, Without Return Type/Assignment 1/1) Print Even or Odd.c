#include<stdio.h>
#include<conio.h>
void EvenOdd(); //function declaration
void main()
{
	EvenOdd();  //function call
}//main ends here
void EvenOdd()
{
	int No=18;
	if(No%2==0)
	{
		printf("%d is Even Number",No);
	}
	else
	{
		printf("%d is Odd Number");
	}
}
