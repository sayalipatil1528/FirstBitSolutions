#include<stdio.h>
#include<conio.h>
void Palindrome(); //function declaration
void main()
{
	Palindrome();  //function call
}//main ends here
void Palindrome()  //function defination
{
	int num=656,r1,r2,r3;
	int q1,rev;
	
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	if(num==rev)
	{
		printf("Palindrome Number");
	}
	else
	{
		printf("Not Palindrome Number");
	}
}