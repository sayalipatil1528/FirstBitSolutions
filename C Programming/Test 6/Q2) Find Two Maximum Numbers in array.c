#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("\n%d ",arr[i]);
	}
	int max1=arr[0],max2=arr[1];
	for(int i=1;i<5;i++)
	{
		if(arr[i]>max1)
			max1=arr[i];
			
		else if(arr[i]>max2 )
			max2=arr[i];
		}
			            
		
	printf("\nFirst max=%d\nSecond max=%d ",max1,max2);
}