#include<stdio.h>
int Is_Armstrong());

void main()
{
	int res;
	res=Is_Armstrong();
	if(res==1)
	 	printf("Armstrong Number");
	else
		printf("Not Armstrong Number");
	
	
}
int Is_Armstrong()
{
	int n=153,rem,temp,sum=0;
	temp=n;
	while(temp>0)
	{
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	if(n==sum)
		return 1;
	else                                                                       
		return 0;
		
}

				







