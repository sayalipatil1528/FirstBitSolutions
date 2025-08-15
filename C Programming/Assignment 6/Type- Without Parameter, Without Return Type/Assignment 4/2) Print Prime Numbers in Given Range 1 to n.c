#include<stdio.h>
#include<conio.h>
void Is_Prime(); //function declaration
void main()
{
	Is_Prime(); //function call
} //main() ends here
void Is_Prime()
{
	for (int i = 2; i <= 100; i++) 
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