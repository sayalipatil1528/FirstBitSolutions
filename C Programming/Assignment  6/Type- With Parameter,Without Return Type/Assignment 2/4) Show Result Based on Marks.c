#include<stdio.h>
void Marks(int); //function declaration
void main()
{
	int mark;
	printf("Enter mark : ");
	scanf("%d",&mark);
	Marks(mark); //function call
}
void Marks(int mark)  //function defination
{

	if(mark>75)
	{
		printf("Distinction");
	}
	else if(mark>65)
	{
		printf("First Class");
	}
	else if(mark>55)
	{
		printf("Second Class");
	}
	else if(mark>=40)
	{
		printf("Pass Class");
	}
	else
	{
		printf("Fail");
	}
}