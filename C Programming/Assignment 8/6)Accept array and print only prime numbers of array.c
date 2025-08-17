#include<stdio.h>
void main()
{
	int arr[5];
	printf("Enter 5 Elements : ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int flag=0;
	for(int i=1;i<arr[i];i++)
	{
		if(arr[i]%i!=0)
		{
			printf("%d is prime \n",arr[i]);
		}
		
	}
	
}
		