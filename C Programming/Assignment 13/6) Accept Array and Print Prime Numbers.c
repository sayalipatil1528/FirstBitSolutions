#include<stdio.h>
#include<stdlib.h>
void Prime(int*,int );
void main()
{
	//int arr[10];
	int* arr=(int*)malloc(sizeof(int)*10);
	printf("Enter 10 Elements : ");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	Prime(&arr[0],10);
}
void Prime(int* ptr,int size)
{
	printf("Prime numbers in array are : \n");
	
	for(int i=0;i<size;i++)
	{
		int flag=1;  
		int num=ptr[i];
		if(num<2)
		{
			flag=0;
		}
		else
		{
			for(int j=2;j*j<=num;j++)
			{     
				if(num%j==0)
				{
					flag=0;
					break;
				}	      
			}	
		}
			
		if(flag)
			printf("%d is prime\n",num);
	}
	        
}
		