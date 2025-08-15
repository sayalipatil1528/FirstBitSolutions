#include<stdio.h>
#include<conio.h>
void vote(); //function declaration
void main()
{
	vote();  //function call
}//main ends here
void vote()  //function defination
{
	int age=24;
	if(age>=18)
	{
		printf("Person is eligible for voiting");
	}
	else
	{
		printf("Person is not eligible for voting");
	}
}