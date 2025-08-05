#include<stdio.h>
#include<conio.h>
void main()
{
	
		int sum=0;
		//printf("Enter a no : ");
		//scanf("%d",&no);
		
		//printf("Perfect numbers from 1 to %d are: \n", no);
		
		for (int i = 1; i <= 1000; i++) 
		{	
			sum=0;
	        for (int j = 1;j < i ; j++) 
			{
	            if (i % j == 0) 
				{
				   sum=sum+j;
	            }
	        }
	        
	        if (sum==i)
			{ 
				printf("%d is Perfect Number \n",i);
			}
		}
}	