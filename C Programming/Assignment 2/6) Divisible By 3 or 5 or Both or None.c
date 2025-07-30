#include<stdio.h>
#include<conio.h>
void main()
{
	int Num=4;
	if(Num%3==0 && Num%5==0)
	{
		printf("Divisible by Both");
	}
	else
	{
		if(Num%3==0)
		{
			printf("Divisible by 3 but not by 5");
		}
		else
		{
			if(Num%5==0)
			{
				printf("Divisible by 5 but not by 3");
			}
			else
			{
				printf("Divisible by none");
			}
		}
	}
}