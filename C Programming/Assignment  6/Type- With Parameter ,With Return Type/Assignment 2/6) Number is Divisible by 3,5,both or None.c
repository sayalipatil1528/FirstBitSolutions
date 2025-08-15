#include<stdio.h>
int Div(int);

void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	int res=Div(No);
	if(res==1)
		printf("Divisible by Both");
	else if(res==2)
		printf("Divisible by 3 but not by 5");
	else if(res==3)
		printf("Divisible by 5 but not by 3");
	else
		printf("Divisible by None");
	
}
int Div(int Num)
{
	if(Num%3==0 && Num%5==0)
		return 1;
		
	else if(Num%3==0)
		return 2;
		
	else if(Num%5==0)
		return 3;
		
	else
	 	return 4;
		
}

				