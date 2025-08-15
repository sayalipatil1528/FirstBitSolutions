#include<stdio.h>
void add(int,int); //function declaration
void main()
{
	int a,b;
	printf("Enter Number : ");
	scanf("%d%d",&a,&b);
	add(a,b); //function call
}
void add(int x,int y)  //function defination
{
	
	int c=x+y;
	printf("Addition of %d and %d is %d",x,y,c);
}