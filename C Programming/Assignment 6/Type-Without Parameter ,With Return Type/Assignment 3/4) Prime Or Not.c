#include<stdio.h>
int Is_Prime();

void main()
{
	int res;
	res=Is_Prime();
	if(res==1)
	 	printf("Prime Number");
	else
		printf("Not Prime Number");
	
	
}
int Is_Prime()
{
	int No=13,flag=0,i=2;
	while(i<=No/2)
	{
		if(No%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag==0)
		return 1;
	else                                                                       
		return 0;
		
}

				







