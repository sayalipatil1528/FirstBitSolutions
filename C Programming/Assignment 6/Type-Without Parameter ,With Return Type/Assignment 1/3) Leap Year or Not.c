#include<stdio.h>
int Leap();
void main()
{
	int res;
	res=Leap();
	if(res==1)
		printf("Leap Year");
	else
		printf("Not Leap Year");
	
}
int Leap()
{
	int year=2004;
	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
		return 0;
}



