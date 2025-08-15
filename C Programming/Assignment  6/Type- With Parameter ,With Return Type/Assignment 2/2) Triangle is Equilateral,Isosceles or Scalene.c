#include<stdio.h>
int Triangle(int,int,int); //function declaration
void main()
{
	int side1,side2,side3;
	printf("Enter Side1,Side2 and Side3 : ");
	scanf("%d%d%d",&side1,&side2,&side3);
	int res=Triangle(side1,side2,side3); //function call
	if(res==1)
		printf("Equilateral Triangle");
	else if(res==2)
		printf("Isosceles Triangle");
	else
		printf("Scalene Triangle");
}
int Triangle(int x,int y,int z)  //function defination
{
	if(x==y && y==z)
		return 1;
	
	else if(x==y || y==z || x==z)
		return 2;
	
	else
		return 3;
	}
