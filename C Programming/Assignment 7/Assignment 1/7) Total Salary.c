#include<stdio.h>
void Total_Salary(double*); //function declaration
void main()
{
	double salary;
	printf("Enter Salary : ");
	scanf("%lf",&salary);
	Total_Salary(&salary); //function call
}
void Total_Salary(double* salary)  //function defination
{

	double da,ta,hra,tsalary;
	
	if(*salary<=5000)
	{
		da=*salary*0.10;
		ta=*salary*0.20;
		hra=*salary*0.25;	
	}
	else
	{
		da=*salary*0.15;
		ta=*salary*0.25;
		hra=*salary*0.30;
	}
	tsalary=*salary+da+ta+hra;
	printf("Total Salary=%lf",tsalary);
}