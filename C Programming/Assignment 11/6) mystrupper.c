#include<stdio.h>
#include<string.h>
char* mystrupper(char* );
void main()
{
	char str[]="hello";
	printf("Before str=%s\n",str);
	char * res=mystrupper(str);
	printf("After str=%s ",res);
	
}
char* mystrupper(char* ptr)
{
	int i=0;
	while(ptr[i]!='\0')
	{
		if(ptr[i]>='a'&&ptr[i]<='z')
		{
			ptr[i]=ptr[i]-('a'-'A');
		}
		i++;
	}
	return ptr;
}