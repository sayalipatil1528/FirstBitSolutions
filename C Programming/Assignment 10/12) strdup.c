#include<stdio.h>
#include<string.h>
void main()
{
	char s[]="Hello";
	char *res=strdup(s);
	printf("Duplicate String : %s ",res);
}                                                           