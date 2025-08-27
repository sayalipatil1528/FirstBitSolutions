#include<stdio.h>
#include<string.h>
struct Mobile
{
	int id;
	char name[10];
	int quantity;
	double price;
};
struct Mobile store();
void display(struct Mobile);
void main()
{
	struct Mobile m1,m2;
	
	m1.id=201;
	strcpy(m1.name,"Mobile");
	m1.quantity=5;
	m1.price=20000;
	
	printf("Enter Details of Mobile 2 : \n");
	m2=store();
	
	printf("Details of Mobile : \n");
	display(m1);
	display(m2);
}
struct Mobile store()
{
	struct Mobile temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%d",&temp.quantity);
	scanf("%lf",&temp.price);
	return temp;
}
void display(struct Mobile mb)
{
	printf("\nID = %d\n",mb.id);
	printf("Name = %s\n",mb.name);
	printf("Quantity = %d\n",mb.quantity);
	printf("Price =%lf\n",mb.price);
}