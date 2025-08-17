#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int search=15;
	for(int i=0;i<5;i++)
	{
		if(arr[i]==search)
		{
			printf("%d is Searched",search);
		}
		
	}
	
}
		