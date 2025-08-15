#include<stdio.h>
void Is_UppLow(char); //function declaration
void main()
{
	char ch;
	printf("Enter a character : ");
	scanf("%c",&ch);
	Is_UppLow(ch); //function call
}
void Is_UppLow(char ch)  //function defination
{
	if(ch>='A' && ch<='Z')
	{
		printf("%c is Uppercase",ch);
	}
	else
	{
		printf("%c is Lowercase",ch);
	}
}