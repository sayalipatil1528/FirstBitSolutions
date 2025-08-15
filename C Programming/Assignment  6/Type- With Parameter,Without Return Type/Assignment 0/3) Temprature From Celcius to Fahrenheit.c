#include<stdio.h>
void temp(int);  //function declartion
void main()
{
	int c;
	printf("Enter Temperature : ");
	scanf("%d",&c);
	temp(c);  //function call
}
void temp(int c)  //function defination
{
	int F=(c*9/5)+32;
	printf("Temperature from Celcius to Fahrenheit is %d ",F);
	
}