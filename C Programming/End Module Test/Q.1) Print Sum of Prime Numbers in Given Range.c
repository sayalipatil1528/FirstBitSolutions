#include<stdio.h>
void main()
{
	int n,sum=0;
	printf("Enter Range : ");
	scanf("%d",&n);
	for(int k=2;k<=n;k++)
	{
		int flag=0;
		for(int i=2;i<k;i++)
		{
			if(k%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			sum=sum+k;
	}
	printf("Sum of Prime Number from 1 to 5 is %d\n",sum);
	
}   
    
   