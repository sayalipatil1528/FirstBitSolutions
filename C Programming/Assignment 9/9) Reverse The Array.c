#include<stdio.h>
void ReverseArray(int* ,int);
void main()
{
	int arr[10];
	printf("Enter 10 Elements : ");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	ReverseArray(&arr[0],10);
}
void ReverseArray(int* ptr,int size)
{
	
	for(int i=size-1;i>=0;i--)
	{
		printf("%d ",ptr[i]);
	}
}
		