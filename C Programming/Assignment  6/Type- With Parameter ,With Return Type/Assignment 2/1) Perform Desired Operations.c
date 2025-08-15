#include<stdio.h>
int Add(int,int);
int Sub(int,int);
int Mult(int,int);
int Div(int,int);
int Mod(int,int);
void main()
{
	int res;
	int x,y;
	printf("Enter x and y : ");
	scanf("%d%d",&x,&y);
	res=Add(x,y);
	printf("Add=%d \n",res);
	
	res=Sub(x,y);
	printf("Sub=%d \n",res);
	
	res=Mult(x,y);
	printf("Mult=%d \n",res);
	
	res=Div(x,y);
	printf("Div=%d \n",res);
	
	res=Mod(x,y);
	printf("Mod=%d \n",res);

}
int Add(int a,int b)
{
	int c=a+b;
	return c;
}
int Sub(int a,int b)
{
	int c=a-b;
	return c;
}
int Mult(int a,int b)
{
	int c=a*b;
	return c;
}
int Div(int a,int b)
{
	int c=a/b;
	return c;
}
int Mod(int a,int b)
{
	int c=a%b;
	return c;
}
				