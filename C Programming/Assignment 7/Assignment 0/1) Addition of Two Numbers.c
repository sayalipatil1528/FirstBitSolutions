#include<stdio.h>
void add(int*,int*);
void main()
{
	int a,b;
	printf("Enter Number : ");
	scanf("%d%d",&a,&b);
	add(&a,&b); 
}
void add(int* x,int* y)
{
	int c=*x+*y;
	printf("Addiion %d and %d is %d",*x,*y,c);
}


