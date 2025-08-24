#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter a string : ");
	scanf("%s",str);
	char search;
	printf("Enter a character to scan it in string : ");
	scanf(" %c",&search);
	int i=0,found=0;
	while(str[i]!='\0')
	{
		if(str[i]==search)
		{
			printf("Character is found %d th index\n",i);
			found=1;	
		}
		i++;	
	}
	if(!found)
		printf("Character not found\n");	
}