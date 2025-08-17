#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int max=arr[0];
	for(int i=1;i<5;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	int min=arr[0];
	for(int i=0;i<5;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	printf("Maximum Number=%d \n",max);
	printf("Minimum Number=%d ",min);
}
		