#include<stdio.h>
int Triangle();

void main()
{
	int res;
	res=Triangle();
	if(res==1)
		printf("Equilateral Traingle");
	
	else if(res==2)
		printf("Isosceles Traingle");
	else
		printf("Scalene Traingle");
	
	
}
int Triangle()
{
	int side1=12,side2=13,side3=12;
	
	if(side1==side2 && side2==side3)
		return 1;
		
	else if(side1==side2 || side2==side3 || side1==side3)
		return 2;
	else
		return 3;
}
				