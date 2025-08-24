#include<stdio.h>
#include<string.h>
char* mystrncat(char* ,char*,int);
void main()
{
	char str1[20]="Hello";
	char str2[]="Firstbit";
	char* res=mystrncat(str1,str2,4);
	printf("Concatenated String is %s",res);
}
char* mystrncat(char* s1,char* s2,int len)
{
	int i=strlen(s1);
	int j=0;
	while(s2[j]!='\0' && j<len)
	{
			s1[i++]=s2[j++];
	}
	s1[i]='\0';
	return s1;
	
}