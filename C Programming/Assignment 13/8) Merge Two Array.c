#include<stdio.h>
#include<stdlib.h>
void MergeArray(int* ,int ,int*,int );
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={11,12,13,14,15};
	MergeArray(&arr[0],5,&brr[0],5);
}
void MergeArray(int* ptr,int size1,int* ptr2,int size2)
{
	int size3=size1+size2;
	int i;
	//int crr[size3];
	int* crr=(int*)malloc(sizeof(int)*size3);
	for(i=0;i<size1;i++)
	{
		crr[i]=ptr[i];
	}
	for(int j=0;j<size2;j++)
	{
		crr[i++]=ptr2[j];
	}
	for(int i=0;i<size3;i++)
	{
		printf("%d ",crr[i]);
	}
}
		