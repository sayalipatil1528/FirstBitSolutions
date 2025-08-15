#include<stdio.h>
#include<conio.h>
void AreaCircle();  //function declaration
void main()
{
	AreaCircle();//function call
	
}//main() end here
void AreaCircle()    //function defination
{
	int r=2;
	float pi=3.14,area;
	area=pi*r*r;
	printf("Area of circle is %f",area);
}