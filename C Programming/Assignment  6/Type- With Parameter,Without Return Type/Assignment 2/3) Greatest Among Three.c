#include<stdio.h>
void Greatest(int,int,int); //function declaration
void main()
{
	int a,b,c;
	printf("Enter a ,b and c : ");
	scanf("%d%d%d",&a,&b,&c);
	Greatest(a,b,c); //function call
}
void Greatest(int x,int y,int z)  //function defination
{

	if(x>y)
	{
		if(x>z)
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
		if(y>z)
		{
			printf("b is greater than c");
		}
		else
		{
			printf("c is greater than b");
		}
	}
			
}