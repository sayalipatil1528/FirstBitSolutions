#include<stdio.h>
struct Distance
{
	int feet;
	int inch;
};
struct Distance store();
void display(struct Distance);
void main()
{
	struct Distance d1,d2;
	
	d1.feet=2;
	d1.inch=24;
	
	printf("Enter Details of Distance : \n");
	d2=store();
	
	printf("Details of Distance : \n");
	display(d1);
	display(d2);
}
struct Distance store()
{
	struct Distance temp;
	scanf("%d",&temp.feet);
	scanf("%d",&temp.inch);
	return temp;
}
void display(struct Distance d)
{
	printf("\nFeet = %d\n",d.feet);
	printf("Inch = %d\n",d.inch);
}