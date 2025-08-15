#include<stdio.h>
char Vowel();
void main()
{
	int res;
	res=Vowel();
	if(res==1)
		printf("Character is Vowel");
	else
		printf("Character is Constant");
	
}
char Vowel()
{
	char ch='a';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		return 1;
	else
		return 0;
}



