#include<stdio.h>
void getTotal(int*,int*,int*,int*,int*);  //function declartion
void main()
{
	int S1=65,S2=54,S3=66,S4=76,S5=56;
	
	getTotal(&S1,&S2,&S3,&S4,&S5);  //function call
	
}
void getTotal(int* a,int* b,int* c,int* d,int* e)  //function defination
{
	int Total;
	float per;
	Total=*a+*b+*c+*d+*e;
	per=Total/5.0;
	printf("Five Subjects Total Marks is %d And Percentage is %f",Total,per);
}
