#include<stdio.h>
char Is_Vowel(char); //function declaration
void main()
{
	char c;
	printf("Enter a Character : ");
	scanf("%c",&c);
	int res=Is_Vowel(c); //function call
	if(res==1)
		printf("%c is Vowel",c);
	else
		printf("%c is Constant",c);
}
char Is_Vowel(char ch)  //function defination
{
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		return 1;
	else
		return 0;
}