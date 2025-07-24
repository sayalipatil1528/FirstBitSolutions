#include<stdio.h>
#include<conio.h>
void main()
{
	int min=220,hours,remmin;
	hours=min/60;
	remmin=min%60;
	printf("Hours is %d and Remaining Minutes is %d",hours,remmin);
}