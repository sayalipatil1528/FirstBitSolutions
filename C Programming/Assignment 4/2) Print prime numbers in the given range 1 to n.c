#include<stdio.h>
#include<conio.h>
void main()
{
	int no,cnt,i,j;
	
	printf("Enter a no : ");
	scanf("%d",&no);
	
	printf("Prime numbers from 1 to %d are: \n", n);
	
	for (i = 2; i <= n; i++) 
	{
        cnt = 0; 
        
        for (j = 2;j <= i / 2; j++) 
		{
            if (i % j == 0) 
			{
                cnt++; 
                break;   
            }
        }

        
        if (cnt == 0) {
            printf("%d ", i);
        }
    }	
	
}