#include<stdio.h>
#include<stdlib.h>
void min(int* ,int);
void max(int* ,int);
void main()
{
	//int arr[5];
	int* arr=(int*)malloc(sizeof(int)*5);
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	min(arr,5);
	max(arr,5);
	
}

void min(int* ptr,int size)
{
	int min=*ptr;
	for(int i=1;i<size;i++)
	{
		if(ptr[i]<min)
		{
			min=ptr[i];
		}
	}
	printf("Minimum Number=%d\n",min);
}

void max(int* ptr,int size)
{
	int max=*ptr;
	for(int i=1;i<size;i++)
	{
		if(ptr[i]>max)
		{
			max=ptr[i];
		}
	}
	printf("Maximum Number=%d \n",max);
}
		