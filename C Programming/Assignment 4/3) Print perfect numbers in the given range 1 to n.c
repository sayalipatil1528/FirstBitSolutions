#include<stdio.h>
#include<conio.h>
void main()
{
	int no,sum;
	
	printf("Enter a no : ");
	scanf("%d",&no);
	
	printf("Perfect numbers from 1 to %d are: \n", no);
	
	for (int i = 1; i <= no; i++) 
	{
        sum=0;
        for (int j = 1;j < i ; j++) 
		{
            if (i % j == 0) 
			{
			   sum=sum+j;
            }
        }
        if (sum==i) {
            printf("%d ", i);
        }
    }	
	
}