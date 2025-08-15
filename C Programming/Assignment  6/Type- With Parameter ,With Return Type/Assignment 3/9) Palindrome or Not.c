#include<stdio.h>
int Is_Palindrome(int);

void main()
{
	int Num;
	printf("Enter a Number : ");
	scanf("%d",&Num);
	int res=Is_Palindrome(Num);
	if(res==1)
	 	printf("Palindrome Number");
	else
		printf("Not Palindrome Number");
	
	
}
int Is_Palindrome(int No)
{
	int r1,rev=0,temp;
	temp=No;
	while(temp!=0)
	{
		r1=temp%10;
		rev=rev*10+r1;
		temp=temp/10;
	}
	if(No==rev)
		return 1;
	else                                                                       
		return 0;
		
}

				







