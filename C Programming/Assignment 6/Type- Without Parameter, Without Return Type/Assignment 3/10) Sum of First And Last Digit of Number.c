#include<stdio.h>
#include<conio.h>
void Sum_Digit(); //function declaration
void main()
{
	Sum_Digit(); //function call
} //main() ends here
void Sum_Digit()//function defination
{
	int Num=12345,ld,rem,sum;
	ld=Num%10;
	while(Num>0)
	{
		rem=Num%10;
		Num=Num/10;
	}
	sum=ld+rem;
	printf("%d",sum);
}