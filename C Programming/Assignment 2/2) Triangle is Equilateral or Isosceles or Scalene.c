#include<stdio.h>
#include<conio.h>
void main()
{
	int side1=12,side2=15,side3=12;
	if(side1==side2 && side2==side3)
	{
		printf("Equilateral Triangle");
	}
	else if(side1==side2 || side2==side3 || side1==side3)
	{
		printf("Isosceles Triangle");
	}
	else
	{
		printf("Scalene Triangle");
	}
}