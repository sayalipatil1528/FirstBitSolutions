#include<stdio.h>
#include<string.h>
char* mystrrchr(char*,char);
void main()
{
	char str[]="firstbit";
	char* res=mystrrchr(str,'t');
	if(*res!='\0')
		printf("Character found %d index",res-str);
	else
		printf("Character not found");
		
}
char* mystrrchr(char *ptr,char ch)
{
	int len=strlen(ptr);
	int i=len-1;
	while(ptr[i]!='\0')
	{
		if(ptr[i]==ch)
			return &ptr[i];
			
		i--;	
	}
	return '\0';
}