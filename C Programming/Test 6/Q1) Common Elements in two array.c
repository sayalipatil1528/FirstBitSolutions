#include<stdio.h>
void main()
{
	int arr[5];
	int brr[5];
	printf("Enter Elements For Array arr : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
		printf("%d ",arr[i]);
	
	printf("\nEnter Elements For Array brr : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&brr[i]);
	}
	for(int i=0;i<5;i++)
		printf("%d ",brr[i]);
	
	printf("\nCommon Elements in arr and brr are : ");	
	for(int i=0;i<5;i++)
	{
		if(arr[i]==brr[i])
			printf("%d ",arr[i]);
		  
	}
}