#include<stdio.h>
void Is_Strong(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Strong(No); //function call
}
void Is_Strong(int n)	
{

	for(int k=1;k<=n;k++)
	{

	    int no=k;
	    
	    int sum=0,rem;
	    while(no>0)
	    {
	    	int fact=1;
	    	rem=no%10;  
	            
            for (int i = 1; i <= rem; i++) 
			{
                fact=fact*i;
            }
            sum =sum+ fact;
            no =no/ 10;
	    }
        if (sum == k) 
		{
	        printf("%d \n", k);
	    }   
	}	
}