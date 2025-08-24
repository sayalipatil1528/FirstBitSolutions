#include<stdio.h>
void main()
{
	char str[30];
	printf("Enter a string : ");
	char symbol='$';
	fgets(str,sizeof(str),stdin);
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