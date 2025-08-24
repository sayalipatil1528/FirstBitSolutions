#include<stdio.h>
#include<string.h>
int mystrncmp(char* ,char* ,int);
void main()
{
	char str1[]="apply";
	char str2[]="application";
	int res=mystrncmp(str1,str2,3);
	printf("%d",res);
}
int mystrncmp(char* str1,char* str2,int n)
{
	int i=0;
	while(i<n)
	{
		if(str1[i]!=str2[i])
		{
			if(str1[i]>str2[i])
				return 1;
			else
				return -1;
			
		}
		i++;
	}
	return 0;
	
}