#include<stdio.h>
#include<conio.h>
void main()
{
	int No1=10,No2=20,Temp;
	Temp=No1;
	No1=No2;
	No2=Temp;
	printf("After Swaping No1=%d and No2=%d",No1,No2);
}