#include<stdio.h>
int Add();
int Sub();
int Mult();
int Div();
int Mod();
void main()
{
	int res;
	res=Add();
	printf("Add=%d \n",res);
	
	res=Sub();
	printf("Sub=%d \n",res);
	
	res=Mult();
	printf("Mult=%d \n",res);
	
	res=Div();
	printf("Div=%d \n",res);
	
	res=Mod();
	printf("Mod=%d \n",res);
	
	
	
}
int Add()
{
	int a=45,b=2,c;
	c=a+b;
	return c;
}
int Sub()
{
	int a=45,b=2,c;
	c=a-b;
	return c;
}
int Mult()
{
	int a=45,b=2,c;
	c=a*b;
	return c;
}
int Div()
{
	int a=45,b=2,c;
	c=a/b;
	return c;
}
int Mod()
{
	int a=45,b=2,c;
	c=a%b;
	return c;
}
				