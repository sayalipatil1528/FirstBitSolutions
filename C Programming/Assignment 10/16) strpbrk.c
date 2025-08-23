#include<stdio.h>
#include<string.h>
void main()
{
	const char *s= "hello";
	const char *search="aeiou";
	char *res=strpbrk(s,search);
	if(*res!='\0')
		printf("First Vowel found : %s",res);
	else
		printf("No Vowel Found");
}