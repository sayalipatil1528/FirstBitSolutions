#include<stdio.h>
#include<string.h>
struct Admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
};
struct Admin store();
void display(struct Admin );
void main()
{
	struct Admin a1,a2;
	
	a1.id=101;
	strcpy(a1.name,"abc");
	a1.salary=7500;
	a1.allowance=5000;
	
	printf("Enter Details of Admin 2 : ");
	a2=store();
	
	printf("Details of Admin : \n");
	display(a1);
	display (a2);
	
}
struct Admin store()
{
	struct Admin temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%lf",&temp.salary);
	scanf("%lf",&temp.allowance);
	return temp;
}
void display(struct Admin ad)
{
	printf("\nID = %d\n",ad.id);
	printf("Name = %s\n",ad.name);
	printf("Salary = %lf\n",ad.salary);
	printf("Allowance = %lf\n",ad.allowance);
}
