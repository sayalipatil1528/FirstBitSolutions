#include<stdio.h>
#include<conio.h>
void time();  //function declaration
void main()
{
	time();//function call
}
void time()//function Defination
{
	int min=220,hours,remmin;
	hours=min/60;
	remmin=min%60;
	printf("Hours is %d and Remaining Minutes is %d",hours,remmin);
}
