#include<stdio.h>
void time(int*);
void main()
{
	int min;
	printf("Enter Minutes : ");
	scanf("%d",&min);
	time(&min);  //function call
	
}
void time(int* min)  //function defination
{
	int hours,remmin;
	hours=*min/60;
	remmin=*min%60;
	printf("Hours is %d and Remaining Minutes is %d",hours,remmin);
}