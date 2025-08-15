#include<stdio.h>
#include<conio.h>
void Is_Perfect(); //function declaration
void main()
{
	Is_Perfect(); //function call
} //main() ends here
void Is_Perfect()
{
	int sum=0;
		
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