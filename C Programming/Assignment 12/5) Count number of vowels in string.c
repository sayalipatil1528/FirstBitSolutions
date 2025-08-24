#include<stdio.h>
void main()
{
	char str[]="Firstbit Solutions";
	int i=0,count=0;
	while(str[i]!='\0')
	{
		char ch=str[i];
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
		{
			count++;
		}
		i++;
	}
	printf("Count number of vowels in string : %d",count);
	
}