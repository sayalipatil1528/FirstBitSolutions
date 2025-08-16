#include<stdio.h>
void voteage(int*); //function declaration
void main()
{
	int age;
	printf("Enter age : ");
	scanf("%d",&age);
	voteage(&age); //function call
}
void voteage(int* age)  //function defination
{
	if(*age>=18)
	{
		printf("Person is eligible for voiting");
	}
	else
	{
		printf("Person is not eligible for voting");
	}
}