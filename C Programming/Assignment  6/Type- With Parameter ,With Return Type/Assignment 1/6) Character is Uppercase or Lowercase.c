#include<stdio.h>
char Upp_Low(char); //function declaration
void main()
{
	char c;
	printf("Enter character : ");
	scanf("%c",&c);
	int res=Upp_Low(c); //function call
	if(res==1)
		printf("%c is Uppercase",c);
	else
		printf("%c is Lowercase",c);
}
char Upp_Low(char ch)  //function defination
{
	if(ch>='A' && ch<='Z')
		return 1;
	else
		return 0;
}