#include<stdio.h>
#include<conio.h>
void main()
{
	char ch='a';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		printf("%c is vowel",ch);
	}
	else
	{
		printf("%c is constant",ch);
	}
}