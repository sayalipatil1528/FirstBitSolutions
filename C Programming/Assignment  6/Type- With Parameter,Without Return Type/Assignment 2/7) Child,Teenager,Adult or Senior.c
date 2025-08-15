#include<stdio.h>
void CheckAge(int); //function declaration
void main()
{
	int age;
	printf("Enter age : ");
	scanf("%d",&age);
	CheckAge(age); //function call
}
void CheckAge(int age)  //function defination
{
	if(age<=12)
	{
		printf("Person is Child");
	}
	else if(age>12 && age<=19)
	{
		printf("Person is Teenager");
	}
	else if(age>=20 && age<=59)
	{
		printf("Person is Adult");
	}
	else
	{
		printf("Person is Senior");
	}
}