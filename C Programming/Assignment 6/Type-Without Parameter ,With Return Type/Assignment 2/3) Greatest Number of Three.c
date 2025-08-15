#include<stdio.h>
int GreatestNum();

void main()
{
	int res;
	res=GreatestNum();
	if(res==1)
		printf("a is greater");
	else if(res==2)
		printf("b is greater");
	else
		printf("c is greater");
	
}
int GreatestNum()
{
	int a=20,b=35,c=27;
	
	if(a>b && a>c)
		return 1;
		
	else if(b>a && b>c)
		return 2;
		
	else
		return 3;
}
				