#include<stdio.h>
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
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
}