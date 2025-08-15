#include<stdio.h>
void oper(int,int); //function declaration
void main()
{
	int a,b;
	printf("Enter a and b : ");
	scanf("%d%d",&a,&b);
	oper(a,b); //function call
}
void oper(int x,int y)  //function defination
{

	int c;
	char op='*';
	if(op=='+')
	{
		c=x+y;
		printf("Addition=%d",c);
	}
	else if(op=='-')
	{
		c=x-y;
		printf("Sub=%d",c);
	}
	else if(op=='*')
	{
		c=x*y;
		printf("Mult=%d",c);
	}
	else if(op=='/')
		{
			c=x/y;
			printf("Div=%d",c);
		}
	else
	{
		c=x%y;
		printf("Mod=%d",c);
	}
			
}