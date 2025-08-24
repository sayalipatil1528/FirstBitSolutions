#include<stdio.h>
#include<string.h>
//#include<stdlib.h>
char* mystrrev(char*,int );
void main()
{
	char str[5]="hello";
	char*res=mystrrev(str,5);
	printf("Reverse of string is %s",res);
}
char* mystrrev(char* ptr,int size)
{
	char temp[size];
	//char* temp=(char*)malloc(sizeof(char)*size);
	for(int i=0,j=size-1;i<size;i++,j--)
	{
		temp[i]=ptr[j];
	}
	//printf("%s",temp);
	return temp;
}