#include<stdio.h>
void main()
{
	int start,end;
	
	printf("Enter Start And End : ");
	scanf("%d%d",&start,&end);
	
	for(int i=start;i<=end;i++)
	{
		printf("\n%d : ",i);
		for(int j=1;j<=i;j++)
		{
			
			if(i%j==0)
			{
				printf("%d ",j);
			}
		}
	}
}