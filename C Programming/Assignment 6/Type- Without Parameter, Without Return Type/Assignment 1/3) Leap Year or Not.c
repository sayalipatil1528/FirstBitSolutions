#include<stdio.h>
#include<conio.h>
void leap(); //function declaration
void main()
{
	leap();  //function call
}//main ends here
void leap()  //function defination
{
	int year=2004;
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		printf("Leap Year");
	}
	else
	{
		printf("Not Leap Year");
	}
}