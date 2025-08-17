#include<stdio.h>
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={11,12,13,14,15};
	int crr[5+5],i;
	for(i=0;i<5;i++)
	{
		crr[i]=arr[i];
	}
	for(int j=0;j<5;j++)
	{
		crr[i++]=brr[j];
	}
	for(int i=0;i<10;i++)
	{
		printf("%d ",crr[i]);
	}
}