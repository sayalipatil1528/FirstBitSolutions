#include<stdio.h>
#include<conio.h>
void oper(); //function declaration
void main()
{
	oper();  //function call
}//main ends here
void oper()  //function defination
{
	int a=45,b=2,c;
	char op='*';
	if(op=='+')
	{
		c=a+b;
		printf("Addition=%d",c);
	}
	else
	{
		if(op=='-')
		{
			c=a-b;
			printf("Sub=%d",c);
		}
		else
		{
			if(op=='*')
			{
				c=a*b;
				printf("Mult=%d",c);
			}
			else
			{
				if(op=='/')
				{
					c=a/b;
					printf("Div=%d",c);
				}
				else
				{
					c=a%b;
					printf("Mod=%d",c);
				}
				
			}
		}
	}
}