#include<stdio.h>
#include<conio.h>
void totalSalary(); //function declaration
void main()
{
	totalSalary();  //function call
}//main ends here
void totalSalary()  //function defination
{
	double salary=8000;
	double da,ta,hra,tsalary;
	
	if(salary<=5000)
	{
		da=salary*0.10;
		ta=salary*0.20;
		hra=salary*0.25;	
	}
	else
	{
		da=salary*0.15;
		ta=salary*0.25;
		hra=salary*0.30;
	}
	tsalary=salary+da+ta+hra;
	printf("Total Salary=%lf",tsalary);
}