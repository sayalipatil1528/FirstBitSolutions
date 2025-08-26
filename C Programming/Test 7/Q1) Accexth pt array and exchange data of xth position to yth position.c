#include<stdio.h>
void swap(int* ,int ,int );
void main()
{
	int arr[10]={11,12,13,14,15,16,17,18,19,20};
	int x,y;
	printf("Enter xth position : ");
	scanf("%d",&x);
	printf("Enter yth position : ");
	scanf("%d",&y);
	
	swap(arr,x,y);
	
	
}
void swap(int* arr,int x,int y)
{
	int temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
	
	for(int i=0;i<10;i++)
	{
		printf("%d ",arr[i]);
	}	
}