#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Even : ");
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			printf("%d ",arr[i]);
		}
	}
	
	printf("\nOdd : ");
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2!=0)
		{
			printf("%d ",arr[i]);
		}
	}

}
		