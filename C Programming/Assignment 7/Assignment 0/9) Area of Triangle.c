#include<stdio.h>
void getarea(int*,int*);  //function declartion
void main()
{
	int base,height;
	printf("Enter base and height : ");
	scanf("%d%d",&base,&height);
	getarea(&base,&height);  //function call
	
}
void getarea(int* a,int* b)  //function defination
{
	int area=0.5*(*a)*(*b);
	printf("Area Of Triangle is %d",area);
}