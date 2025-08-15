#include<stdio.h>
#include<conio.h>
void Num(); //function declaration
void main()
{
	Num(); //function call
} //main() ends here
void Num()//function defination
{
	int a=20,b=35,c=27;
	if(a>b)
	{
		if(a>c)
		{
			printf("a is greater than c");
		}
		else
		{
			printf("c is greater than a");
		}
	}
	else
	{
		if(b>c)
		{
			printf("b is greater than c");
		}
		else
		{
			printf("c is greater than b");
		}
	}
	
}