#include<stdio.h>
#include<string.h>
char* mystrchr(char*,char);
void main()
{
	char str[]="firstbit";
	char* res=mystrchr(str,'t');
	if(*res!='\0')
		printf("Character found %dth index",res-str);
	else
		printf("Character not found");
		
}
char* mystrchr(char *ptr,char ch)
{
	int i=0;
	while(ptr[i]!='\0')
	{
		if(ptr[i]==ch)
			return &ptr[i];
			
		i++;	
	}
	return '\0';
}