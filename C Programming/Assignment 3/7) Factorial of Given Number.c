#include<stdio.h>
#include<conio.h>
void main()
{
	int No=5,i=1,fact=1;
	while(i<=No)
	{
		fact=fact*i;
		i++;
	}
	printf("Factorial of %d is %d",No,fact);
}