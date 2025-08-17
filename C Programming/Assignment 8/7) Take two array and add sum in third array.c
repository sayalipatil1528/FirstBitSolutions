#include<stdio.h>
void main()
{
	int arr[5];
	int brr[5];
	int crr[5];
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
	for(int i=0;i<5;i++)
	{
		crr[i]=arr[i]+brr[i];	
	}
	for(int i=0;i<5;i++)
	{
		printf("%d ",crr[i]);
	}
	
}