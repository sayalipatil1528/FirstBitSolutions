#include<stdio.h>
#include<string.h>
#include<ctype.h>
void main()
{
	char str[30];
	printf("Enter a string : ");
	gets(str);
	int i=0,word_count=0;
	int inword=0;
	
	while(str[i]!='\0')
	{
		if(isspace(str[i]))
		{
			inword=0;
		}
		else if(inword==0)
		{
			inword=1;
			word_count++;
		}
		i++;
	}
	printf("Count of words in string is : %d ",word_count);
}