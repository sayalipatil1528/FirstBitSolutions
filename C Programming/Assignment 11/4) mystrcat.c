#include<stdio.h>
#include<string.h>
char* mystrcat(char* ,char*);
void main()
{
	char str1[20]="Hello";
	char str2[]="Firstbit";
	char* res=mystrcat(str1,str2);
	printf("%s",res);
}
char* mystrcat(char* s1,char* s2)
{
	int i=strlen(s1);
	int j=0;
	while(s2[j]!='\0')
	{
		s1[i++]=s2[j++];
	}
	s1[i]='\0';
	return s1;
	
}