#include<stdio.h>
int Is_Sum();

void main()
{
	int res;
	res=Is_Sum();
	
	printf("Sum=%d",res);
	
	
}
int Is_Sum()
{
	int Num=12345,ld,rem,sum;
	ld=Num%10;
	while(Num>0)
	{
		rem=Num%10;
		Num=Num/10;
	}
	sum=ld+rem;
		return sum;
		
}

				







