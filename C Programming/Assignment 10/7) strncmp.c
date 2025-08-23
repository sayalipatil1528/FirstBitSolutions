#include<stdio.h>
#include<string.h>
void main()
{
	char str1[]="Hello";
	char str2[]="HelFirstbit";
	int res=strncmp(str1,str2,4);
	if(res==0)
		printf("str1 and str2 is same");
	else if(res>0)
		printf("str1 is greater");
	else
		printf("str1 is smaller");
}