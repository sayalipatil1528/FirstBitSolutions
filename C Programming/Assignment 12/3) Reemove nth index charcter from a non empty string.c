#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="Firstbit";
	int index;
	printf("Enter index : ");
	scanf("%d",&index);
	int i=index;
	while(str[i]!='\0')
	{
		str[i]=str[i+1];
		i++;
	}
	printf("%s",str);
}