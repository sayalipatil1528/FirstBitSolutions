#include<stdio.h>
#include<string.h>
void main()
{
	char str1[10]="Hello";
	char str2[10];
	strncpy(str2,str1,3);
	printf("str1=%s,str2=%s",str1,str2);
}