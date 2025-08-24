#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
	char str[]="abcde";
	int len=mystrlen(str);
	printf("Length is : %d",len);
}
int mystrlen(char *ptr)
{
	int i=0;
	while(ptr[i]!='\0')
	{
		i++;
	}
	return i;
}