#include<stdio.h>
#include<string.h>
char* mystrncpy(char* ,char*,int);
void main()
{
	char str1[6]="Hello";
	char str2[6];
	char* res=mystrncpy(str2,str1,3);
	printf("%s ",str2);
}
char* mystrncpy(char* s2,char* s1,int size)
{
	int i=0;
	while(i<size && s1[i]!='\0')
	{
		s2[i]=s1[i];
		i++;
	}
	//s2[i]='\0';
	return s2;
	
}