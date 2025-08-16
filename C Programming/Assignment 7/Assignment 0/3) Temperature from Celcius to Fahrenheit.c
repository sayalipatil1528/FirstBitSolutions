#include<stdio.h>
void temp(int*);
void main()
{
	int c;
	printf("Enter Temperature : ");
	scanf("%d",&c);
	temp(&c);  //function call
}
void temp(int* cel)  //function defination
{
	int F=(*cel*9/5)+32;
	printf("Temperature from Celcius to Fahrenheit is %d ",F);
	
}
