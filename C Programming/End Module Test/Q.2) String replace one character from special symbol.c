#include<stdio.h>
#include<string.h>
void main()
{
	char str[6],ch;
	printf("Enter a string : ");
	scanf("%s",str);
	
	printf("Enter character to replace : ");
	scanf(" %c",&ch);
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==ch)
		{
			str[i]='$';
		}
		i++;
	}
	printf("After Replacing String is %s",str);
}