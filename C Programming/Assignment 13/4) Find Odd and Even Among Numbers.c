#include<stdio.h>
#include<stdlib.h>
void Even(int*,int );
void Odd(int*,int );
void main()
{
	//int arr[5];
	int* arr=(int*)malloc(sizeof(int)*5);
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	Even(&arr[0],5);
	Odd(&arr[0],5);
}
void Even(int* ptr,int size)
{
	printf("Even : ");
	for(int i=0;i<size;i++)
	{
		if(ptr[i]%2==0)
		{
			printf("%d ",ptr[i]);
		}
	}
}

void Odd(int* ptr,int size)
{
	printf("\nOdd : ");
	for(int i=0;i<size;i++)
	{
		if(ptr[i]%2!=0)
		{
			printf("%d ",ptr[i]);
		}
	}
}
		