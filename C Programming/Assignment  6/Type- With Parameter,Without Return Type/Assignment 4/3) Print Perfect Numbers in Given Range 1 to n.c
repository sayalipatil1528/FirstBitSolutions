#include<stdio.h>
void Is_Perfect(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Perfect(No); //function call
}
void Is_Perfect(int n)	
{

	printf("Perfect numbers from 1 to %d are: \n", n);
		
	for (int i = 1; i <= n; i++) 
	{	
		int sum=0;
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