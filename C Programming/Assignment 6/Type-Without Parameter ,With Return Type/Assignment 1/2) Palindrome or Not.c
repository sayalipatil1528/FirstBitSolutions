#include<stdio.h>
int Is_Palindrome();
void main()
{
	int res;
	res=Is_Palindrome();
	if(res==1)
		printf("Number is Palindrome");
	else
		printf("Number is Not Palindrome");
	
}
int Is_Palindrome()
{
	int num=656,r1,r2,r3;
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