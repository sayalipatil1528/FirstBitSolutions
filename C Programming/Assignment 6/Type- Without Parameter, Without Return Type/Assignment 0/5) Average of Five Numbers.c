#include<stdio.h>
#include<conio.h>
void Avg(); //function declaration
void main()
{
	Avg();  //function call
}//main() end here
void Avg() //function defination
{
	int N1=10,N2=15,N3=7,N4=22,N5=20,Total;
	float Avg;
	Total=N1+N2+N3+N4+N5;
	Avg=Total/5.0;
	printf("Average of Five numbers are : %f",Avg);
}