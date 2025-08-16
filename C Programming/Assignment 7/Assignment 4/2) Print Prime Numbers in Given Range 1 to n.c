#include<stdio.h>
void Is_Prime(int*); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Prime(&No); //function call
}
void Is_Prime(int* n)	
{

	printf("Prime numbers from 1 to %d are: \n", *n);
	
	for (int i = 2; i <= *n; i++) 
	{
        int cnt = 1; 
        
        for (int j = 2;j <= i/2 ; j++) 
		{
            if (i % j == 0) 
			{
                cnt=0; 
                break;   
            }
        }
        if (cnt == 1) 
		{
	        printf("%d is prime number \n", i);
	    }
    }	
}