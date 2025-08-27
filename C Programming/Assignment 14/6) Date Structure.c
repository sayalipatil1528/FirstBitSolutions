#include<stdio.h>
#include<string.h>
struct Date
{
	int date;
	char month[10];
	int year;
};
struct Date store();
void display(struct Date);
void main()
{
	struct Date d1,d2;
	
	d1.date=28;
	strcpy(d1.month,"July");
	d1.year=2025;

	printf("Enter Details of Date 2 : \n");
	d2=store();
	
	printf("Details of Date : \n");
	display(d1);
	display(d2);
}
struct Date store()
{
	struct Date temp;
	scanf("%d",&temp.date);
	scanf("%s",temp.month);
	scanf("%d",&temp.year);
	return temp;
}
void display(struct Date dt)
{
	printf("\n%d : %s :%d\n",dt.date,dt.month,dt.year);
}