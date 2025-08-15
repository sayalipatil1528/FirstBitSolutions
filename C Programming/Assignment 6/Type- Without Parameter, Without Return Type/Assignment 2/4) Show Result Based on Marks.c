#include<stdio.h>
#include<conio.h>
void Result(); //function declaration
void main()
{
	Result(); //function call
} //main() ends here
void Result()//function defination
{
	int marks=87;
	if(marks>75)
	{
		printf("Distinction");
	}
	else
	{
		if(marks>65)
		{
			printf("First Class");
		}
		else
		{
			if(marks>55)
			{
				printf("Second Class");
			}
			else
			{
				if(marks>=40)
				{
					printf("Pass Class");
				}
				else
				{
					printf("Fail");
				}
			}
		}
	}
	
}