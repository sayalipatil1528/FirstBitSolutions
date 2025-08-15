#include<stdio.h>
#include<conio.h>
void swap(); //function declaration
void main()
{
	swap();//function call
	
}// main() end here

void swap()  //fun defination
{
	int No1=10,No2=20,Temp;
	Temp=No1;
	No1=No2;
	No2=Temp;
	printf("After Swaping No1=%d and No2=%d",No1,No2);
}
