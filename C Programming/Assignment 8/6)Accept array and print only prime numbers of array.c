
#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : \n");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Prime numbers in array are : \n");
	
	for(int i=0;i<5;i++)
	{
		int flag=1;  
		int num=arr[i];
		if(num<2)
		{
			flag=0;
		}
		else
		{
			for(int j=2;j*j<=num;j++)
			{     
				if(num%j==0)
				{
					flag=0;
					break;
				}	      
			}	
		}
			
		if(flag)
			printf("%d is prime\n",num);
	}
	        
}
	        
		