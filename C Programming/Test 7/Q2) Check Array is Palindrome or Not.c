#include<stdio.h>
void is_Palindrome(int* ,int );
void main()
{
	int arr[3]={131,1781,242};
	
	is_Palindrome(arr,3);
}
void is_Palindrome(int* ptr,int size)
{
	
	for(int i=0;i<size;i++)
	{	
		int temp=ptr[i];
		int r1,rev=0;
		while(temp>0)
		{
			r1=temp%10;
			rev=rev*10+r1;
			temp=temp/10;
		}
		if(rev==ptr[i])
			printf("%d is Palindrome\n",ptr[i]);
		else
			printf("%d Not Palindrome\n",ptr[i]);
	}
}