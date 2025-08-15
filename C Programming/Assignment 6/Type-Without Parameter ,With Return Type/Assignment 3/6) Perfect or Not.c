#include<stdio.h>
int Is_Perfect();

void main()
{
	int res;
	res=Is_Perfect();
	if(res==1)
	 	printf("Perfect Number");
	else
		printf("Not Perfect Number");
	
	
}
int Is_Perfect()
{
	int No=28,i=1,sum=0;
	while(i<No)
	{
		if(No%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(No==sum)
		return 1;
	else                                                                       
		return 0;
		
}

				







