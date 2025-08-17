#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			printf("Even Numbers = %d\n",arr[i]);
		}
	}
	
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2!=0)
		{
			printf("Odd Numbers = %d\n",arr[i]);
		}
	}

}
		