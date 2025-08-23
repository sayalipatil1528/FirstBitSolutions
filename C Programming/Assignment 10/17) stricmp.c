#include<stdio.h>
#include<string.h>
void main()
{
	char *str1="Hello";
	char *str2="hello";
	char res=stricmp(str1,str2);
	if(res==0)
	{
		printf("str1 and str2 are equal ");
	}
	else if(res==1)
	{
		printf("str1 is greater");
	}
	else
	{
		printf("str2 is greater");
	}
}
