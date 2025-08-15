#include<stdio.h>
double Salary();
void main()
{
	double res;
	res=Salary();
	
	printf("Total Salary=%lf",res);

}
double Salary()
{
	double salary=8000;
	double da,ta,hra,tsalary;
	
	if(salary<=5000)
	{
		da=salary*0.10;
		ta=salary*0.20;
		hra=salary*0.25;
		
		tsalary=salary+da+ta+hra;
		return tsalary;
	}
	
	else
	{
		da=salary*0.15;
		ta=salary*0.25;
		hra=salary*0.30;
		
		tsalary=salary+da+ta+hra;
		return tsalary;
	}
	
}



