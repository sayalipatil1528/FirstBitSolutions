#include<stdio.h>
int Is_Perfect(int);

void main()
{
	int Num;
	printf("Enter a Number : ");
	scanf("%d",&Num);
	int res=Is_Perfect(Num);
	if(res==1)
	 	printf("Perfect Number");
	else
		printf("Not Perfect Number");
	
	
}
int Is_Perfect(int No)
{
	int i=1,sum=0;
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

				







