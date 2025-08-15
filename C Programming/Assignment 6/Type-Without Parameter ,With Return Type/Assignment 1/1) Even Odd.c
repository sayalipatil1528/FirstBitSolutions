#include<stdio.h>
int EvenOdd();
void main()
{
	int res;
	res=EvenOdd();
	if(res==1)
		printf("Number is Even");
	else
		printf("Number is Odd");
}
int EvenOdd()
{
	int No=18;
	if(No%2==0)
		return 1;
	else
		return 0;
}