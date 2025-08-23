#include<stdio.h>
#include<string.h>
void main()
{
	char str1[10]="Hello";
	char str2[10]="Firstbit";
	strcat(str1,str2);
	printf("Concatnated String : %s",str1);
}