#include<stdio.h>
#include<conio.h>
void temperature();
void main()
{
	temperature();
}//main() end here

void temperature()
{
	int C=80,F;
	F=(C*9/5)+32;
	printf("Temperature from Celcius to Fahrenheit is %d ",F);
}