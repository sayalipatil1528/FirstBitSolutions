#include<stdio.h>
#include<conio.h>
void add();  //function declaration
void main()
{
	add(); //function call
	
}//main() end here
void add()  //function defination
{
	int a=20,b=30,c;
	c=a+b;
	printf("Addition of %d and %d is %d",a,b,c);
}