#include<stdio.h>
void Is_Vowel(char*); //function declaration
void main()
{
	char ch;;
	printf("Enter a character : ");
	scanf("%c",&ch);
	Is_Vowel(&ch); //function call
}
void Is_Vowel(char* ch)  //function defination
{
	if(*ch=='a'||*ch=='e'||*ch=='i'||*ch=='o'||*ch=='u'||*ch=='A'||*ch=='E'||*ch=='I'||*ch=='O'||*ch=='U')
	{
		printf("%c is vowel",*ch);
	}
	else
	{
		printf("%c is constant",*ch);
	}
}