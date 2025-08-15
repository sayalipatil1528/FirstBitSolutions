#include<stdio.h>
#include<conio.h>
void percheck(); //function declaration
void main()
{
	percheck(); //function call
} //main() ends here
void percheck()//function defination
{
	int age=26;
	if(age<=12)
	{
		printf("Person is Child");
	}
	else
	{
		if(age>12 && age<=19)
		{
			printf("Person is Teenager");
		}
		else
		{
			if(age>=20 && age<=59)
			{
				printf("Person is Adult");
			}
			else
			{
				printf("Person is Senior");
			}
		}
	}
	
}