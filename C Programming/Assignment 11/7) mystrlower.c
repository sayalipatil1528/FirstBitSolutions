#include<stdio.h>
#include<string.h>
char* mystrlower(char* );
void main()
{
	char str[]="HELLO";
	printf("Before str=%s\n",str);
	char * res=mystrlower(str);
	printf("After str=%s",res);
	
}
char* mystrlower(char* ptr)
{
	int i=0;
	while(ptr[i]!='\0')
	{
		if(ptr[i]>='A'&&ptr[i]<='Z')
		{
			ptr[i]=ptr[i]+('a'-'A');
		}
		i++;
	}
	return ptr;
}