#include<stdio.h>
int Is_Palindrome(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	int res=Is_Palindrome(No); //function call
	if(res==1)
		printf("%d is Palindrome Number",No);
	else
		printf("%d is Not Palindrome Number",No);
}
int Is_Palindrome(int num)  //function defination
{
	int r1,r2,r3;
	int q1,rev;
	
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	if(num==rev)
		return 1;
	else
		return 0;
}