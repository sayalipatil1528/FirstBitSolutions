#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter a string : ");
	scanf("%s",str);
	char temp;
	int len=strlen(str);
	temp=str[0];
	str[0]=str[len-1];
	str[len-1]=temp;
	
	printf("Modified String : %s",str);
}