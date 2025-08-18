#include<stdio.h>
void main()
{
	int arr[5];
	int found=0;
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int search=15;
	for(int i=0;i<5;i++)
	{
		if(arr[i]==search)
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
		