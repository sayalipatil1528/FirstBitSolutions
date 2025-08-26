#include<stdio.h>
#include<stdlib.h>
void Alternate(int*,int );
void main()
{
	//int arr[10];
	int* arr=(int*)malloc(sizeof(int)*10);
	printf("Enter 10 Elements : ");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	Alternate(&arr[0],10);
}
void Alternate(int* ptr,int size)
{
	for(int i=0;i<size;i=i+2)
	{
		printf("%d ",ptr[i]);
	}
}
		