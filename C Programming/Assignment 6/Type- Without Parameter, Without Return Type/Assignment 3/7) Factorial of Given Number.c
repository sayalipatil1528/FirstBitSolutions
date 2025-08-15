#include<stdio.h>
#include<conio.h>
void Fact(); //function declaration
void main()
{
	Fact(); //function call
} //main() ends here
void Fact()//function defination
{
	int No=5,i=1,fact=1;
	while(i<=No)
	{
		fact=fact*i;
		i++;
	}
	printf("Factorial of %d is %d",No,fact);

}