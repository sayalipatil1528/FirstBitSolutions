#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="application";
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]=='a')
		{
			str[i]='$';
		}
		i++;
	}
	printf("%s",str);
}