#include<stdio.h>
void Square(int*);
void Cube(int*);
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Square(&No);  //function call
	Cube(&No);
}
void Square(int* x)  //function defination
{
	int Square;
	Square=(*x)*(*x);
	printf("Square of %d is %d \n",*x,Square);
}
void Cube(int* y)
{
	int Cube;
	Cube=(*y)*(*y)*(*y);
	printf ("Cube of %d is %d",*y,Cube);
}