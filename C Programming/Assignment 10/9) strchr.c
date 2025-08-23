#include<stdio.h>
#include<string.h>
void main()
{
	char s[]="Hello World";
	char *res=strchr(s,'o');
	if(res!='\0')
		printf("Character is found at : %ld index",res-s);
	else
		printf("Character not found");
}