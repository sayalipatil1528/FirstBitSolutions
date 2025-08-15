#include<stdio.h>
#include<conio.h>
void AreaTri(); //function declaration
void main()
{
	AreaTri();  //function call
} //main() ends here
void AreaTri() //function defination
{
	int base=10,height=5,area;
	area=0.5*base*height;
	printf("Area Of Triangle is %d",area);
}