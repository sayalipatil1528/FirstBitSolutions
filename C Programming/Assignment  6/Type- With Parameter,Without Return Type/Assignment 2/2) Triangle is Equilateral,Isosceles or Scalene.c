#include<stdio.h>
void triangle(int,int,int); //function declaration
void main()
{
	int a,b,c;
	printf("Enter a ,b and c : ");
	scanf("%d%d%d",&a,&b,&c);
	triangle(a,b,c); //function call
}
void triangle(int side1,int side2,int side3)  //function defination
{

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