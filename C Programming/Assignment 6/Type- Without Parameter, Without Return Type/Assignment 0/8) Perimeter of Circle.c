#include<stdio.h>
#include<conio.h>
void percir();//function declaration
void main()
{
	percir();//function call
}//main() end here
void percir()
{
	int length=10,width=5,perimeter;
	perimeter=2*(length*width);
	printf("Perimeter of reactangle is %d",perimeter);
}