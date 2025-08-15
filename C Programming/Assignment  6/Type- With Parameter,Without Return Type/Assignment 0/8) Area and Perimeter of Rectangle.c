#include<stdio.h>
void getarea(int,int);  //function declartion
void getperi(int,int);
void main()
{
	int len,bre;
	printf("Enter length and breadth : ");
	scanf("%d%d",&len,&bre);
	getarea(len,bre);  //function call
	getperi(len,bre);
	
}
void getarea(int len,int bre)  //function defination
{
	int area=len*bre;
	printf("Area of reactangle is %d \n",area);
}
void getperi(int len,int bre)  //function defination
{
	int peri=2*(len+bre);
	printf("Perimeter of reactangle is %d",peri);
}
