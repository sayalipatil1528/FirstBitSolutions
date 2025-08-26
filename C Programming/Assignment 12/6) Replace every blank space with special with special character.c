#include<stdio.h>
void main()
{
	char str[30];
	printf("Enter a string : ");
	char symbol='$';
	gets(str);
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==' ')
		{
			str[i]=symbol;
		}
		i++;
	}
	printf("%s",str);
}