#include<stdio.h>
#include<stdlib.h>
void AddArray(int* ,int ,int* );
void main()
{
	int arr[5];
	int brr[5];
	printf("Enter 5 Elements For arr Array : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter 5 Elements For brr Array : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&brr[i]);
	}
	AddArray(&arr[0],5,&brr[0]);
}
void AddArray(int* ptr,int size,int* ptr2)
{
	//int crr[5];
	int* crr=(int*)malloc(sizeof(int)*size);
	for(int i=0;i<size;i++)
	{
		crr[i]=ptr[i]+ptr2[i];	
	}
	for(int i=0;i<size;i++)
	{
		printf("%d ",crr[i]);
	}
}
		