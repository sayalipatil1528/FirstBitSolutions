#include<stdio.h>
void sum(int*,int );
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	sum(&arr[0],5);
}
void sum(int* ptr,int size)
{
	int Sum=0;
	for(int i=0;i<size;i++)
	{
		Sum=Sum+ptr[i];
	}

	printf("Sum of all numbers = %d ",Sum);
}
		