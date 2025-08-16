#include<stdio.h>
void getArea(int*);
void main()
{
	int r;
	printf("Enter Radius : ");
	scanf("%d",&r);
	getArea(&r); 
}
void getArea(int* x)
{
	float area=3.14*(*x)*(*x);
	printf("Area of Circle is : %f",area);
}


