#include<stdio.h>
void Avg(int,int,int,int,int);  //function declartion
void main()
{
	int N1,N2,N3,N4,N5;
	printf("Enter Five Numbers : ");
	scanf("%d%d%d%d%d",&N1,&N2,&N3,&N4,&N5);
	Avg(N1,N2,N3,N4,N5);  //function call
}
void Avg(int p,int q,int r,int s,int t)  //function defination
{
	int Total;
	float Avg;
	Total=p+q+r+s+t;
	Avg=Total/5.0;
	printf("Average of Five numbers are : %f",Avg);
}