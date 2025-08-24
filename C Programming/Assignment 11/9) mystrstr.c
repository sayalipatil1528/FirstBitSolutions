#include<stdio.h>
#include<string.h>
char* mystrstr(char* ,char* );
void main()
{
	char str[]="Hello World";
	char* res=mystrstr(str,"World");
	if(*res!='\0')
	{
		printf("Found at %dth index",res-str);
	}
	else
	{
		printf("Not Found");
	}
	
}
char* mystrstr(char* ptr,char* word)
{
	int len1=strlen(ptr);
	int len2=strlen(word);
	for(int i=0;i<=len1-len2;i++)
	{
		int j = 0;
        while(j < len2 && ptr[i + j] == word[j])
        {
            j++;
        }

        if(j == len2)
        {
            return &ptr[i]; 
		}
	}	
	return '\0';
}