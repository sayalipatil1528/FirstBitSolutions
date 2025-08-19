#include<stdio.h>
void SortArray(int* ,int);
void main()
{
	int size;
	printf("Enter size for array : ");
	scanf("%d",&size);
	
	int a[size];
	printf("Enter %d Elements : ",size);
	for(int i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
	SortArray(&a[0],size);
}
void SortArray(int* ptr,int size1)
{
	
	for(int i=0;i<size1-1;i++)
	{
		for(int j=0;j<size1-i-1;j++)
		{
			if(ptr[j]>ptr[j+1])
			{
				int temp=ptr[j];
				ptr[j]=ptr[j+1];
				ptr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<size1;i++)
	{
		printf("%d ",ptr[i]);
	}
}
		