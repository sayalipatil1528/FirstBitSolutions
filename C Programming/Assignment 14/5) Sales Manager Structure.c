#include<stdio.h>
#include<string.h>
struct SalesManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	double target;
};
struct SalesManager store();
void display(struct SalesManager);
void main()
{
	struct SalesManager s1,s2;
	
	s1.id=101;
	strcpy(s1.name,"abc");
	s1.salary=7500;
	s1.incentive=4000;
	s1.target=500;
	
	printf("Enter Details of SaleManager 2 : \n");
	s2=store();
	
	printf("Details of SalesManager : \n");
	display(s1);
	display(s2);
	
}
struct SalesManager store()
{
	struct SalesManager temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%lf",&temp.salary);
	scanf("%lf",&temp.incentive);
	scanf("%lf",&temp.target);
	return temp;
}
void display(struct SalesManager sm)
{
	printf("\nID = %d\n",sm.id);
	printf("Name = %s\n",sm.name);
	printf("Salary = %lf\n",sm.salary);
	printf("Incentive = %lf\n",sm.incentive);
	printf("Target = %lf\n",sm.target);
}
