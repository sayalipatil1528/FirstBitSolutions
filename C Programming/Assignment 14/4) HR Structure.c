#include<stdio.h>
#include<string.h>
struct HR
{
	int id;
	char name[20];
	double salary;
	double commision;
};
struct HR store();
void display(struct HR );
void main()
{
	struct HR h1,h2;
	
	h1.id=101;
	strcpy(h1.name,"abc");
	h1.salary=7500;
	h1.commision=5000;
	
	printf("Enter Details of HR 2 : \n");
	h2=store();
	
	printf("Details of HR : \n");
	display(h1);
	display(h2);
	
}
struct HR store()
{
	struct HR temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%lf",&temp.salary);
	scanf("%lf",&temp.commision);
	return temp;
}
void display(struct HR h)
{
	printf("\nID = %d\n",h.id);
	printf("Name = %s\n",h.name);
	printf("Salary = %lf\n",h.salary);
	printf("Commision = %lf\n",h.commision);
}
