#include<stdio.h>
void Is_Leap(int*); //function declaration
void main()
{
	int year;
	printf("Enter a Year : ");
	scanf("%d",&year);
	Is_Leap(&year); //function call
}
void Is_Leap(int* year)  //function defination
{
	
	if(*year%4==0 && *year%100!=0 || *year%400==0)
	{
		printf("Leap Year");
	}
	else
	{
		printf("Not Leap Year");
	}
}