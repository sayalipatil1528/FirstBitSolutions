#include<stdio.h>
int Is_Leap(int); //function declaration
void main()
{
	int Year;
	printf("Enter a Year : ");
	scanf("%d",&Year);
	int res=Is_Leap(Year); //function call
	if(res==1)
		printf("%d is Leap Year",Year);
	else
		printf("%d is Not Leap Year",Year);
}
int Is_Leap(int year)  //function defination
{
	
	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
		return 0;
}