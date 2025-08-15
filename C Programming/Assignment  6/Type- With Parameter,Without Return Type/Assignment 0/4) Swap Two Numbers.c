#include<stdio.h>
void swap(int,int);  //function declartion
void main()
{
	int No1,No2,Temp;
	printf("Enter Two Numbers : ");
	scanf("%d%d",&No1,&No2);
	swap(No1,No2);  //function call
}
void swap(int x,int y)  //function defination
{
	
	int Temp=x;
	x=y;
	y=Temp;
	printf("After Swaping No1=%d and No2=%d",x,y);
}