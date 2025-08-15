#include<stdio.h>
#include<conio.h>
void Is_Strong(); //function declaration
void main()
{
	Is_Strong(); //function call
} //main() ends here
void Is_Strong()
{
	for(int k=1;k<=1000;k++)
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