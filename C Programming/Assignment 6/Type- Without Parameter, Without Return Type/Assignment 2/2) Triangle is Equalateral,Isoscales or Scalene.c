#include<stdio.h>
#include<conio.h>
void triangle(); //function declaration
void main()
{
	Triangle();  //function call
}//main ends here
void Triangle()  //function defination
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