#include<stdio.h>
#include<string.h>
struct Employee
{
	int id;
	char name[10];
	double salary;
};
struct Employee storeEmployee();
void displayEmployee(struct Employee);
void main()
{
	struct Employee e1,e2;
	
	e1.id=100;
	strcpy(e1.name,"abc");
	e1.salary=50000;
	
	printf("Enter Details of Employee 2 : \n");
	e2=storeEmployee();
	
	printf("Details of Employee : \n");
	displayEmployee(e1);
	displayEmployee(e2);
}
struct Employee storeEmployee()
{
	struct Employee temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%lf",&temp.salary);
	return temp;
}
void displayEmployee(struct Employee emp)
{
	printf("\nID = %d\n",emp.id);
	printf("Name = %s\n",emp.name);
	printf("Salary = %lf\n",emp.salary);
}