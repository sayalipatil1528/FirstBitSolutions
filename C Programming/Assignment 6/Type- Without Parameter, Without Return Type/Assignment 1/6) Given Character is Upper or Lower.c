#include<stdio.h>
#include<conio.h>
void UppLow(); //function declaration
void main()
{
	UppLow();  //function call
}//main ends here
void UppLow()  //function defination
{
	char ch='S';
	if(ch>='A' && ch<='Z')
	{
		printf("%c is Uppercase",ch);
	}
	else
	{
		printf("%c is Lowercase",ch);
	}
}