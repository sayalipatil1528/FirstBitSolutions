#include<stdio.h>
double T_Salary(double); //function declaration
void main()
{
	double salary;
	printf("Enter Salary : ");
	scanf("%lf",&salary);
	double res=T_Salary(salary); //function call
	printf("Total Salary=%lf",res);
	
}
double T_Salary(double sal)  //function defination
{
	
	double da,ta,hra,tsalary;
	
	if(sal<=5000)
	{
		da=sal*0.10;
		ta=sal*0.20;
		hra=sal*0.25;	
	}
	else
	{
		da=sal*0.15;
		ta=sal*0.25;
		hra=sal*0.30;
	}
	tsalary=sal+da+ta+hra;
	return tsalary;
}