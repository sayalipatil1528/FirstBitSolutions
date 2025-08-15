#include<stdio.h>
void getArea(int);  //function declaration
void main()
{
	int r;
	printf("Enter Radius : ");
	scanf("%d",&r);
	getArea(r); //function call
}
void getArea(int r)  //function defination
{
	float area=3.14*r*r;
	printf("Area of Circle is : %f",area);
}