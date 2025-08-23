#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	printf("Enter a String : ");
	scanf("%s",str);
	int len=strlen(str);
	printf("Length of %s is %d",str,len);
}