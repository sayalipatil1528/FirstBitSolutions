#include<stdio.h>
void Search(int*,int );
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	Search(&arr[0],5);
	
}

void Search(int* ptr,int size)
{
	int search=15,found=0;
	for(int i=0;i<size;i++)
	{
		if(ptr[i]==search)
		{
			printf("Number %d is found at index %d\n",search,i);
			found=1;
		}
	}
	if(!found)
	{
		printf("Number %d is not found\n",search);
	}
}
		