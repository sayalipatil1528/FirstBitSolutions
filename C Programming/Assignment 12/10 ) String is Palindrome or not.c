#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="madam";
	int i=0,isPalindrome=1;
	int len=strlen(str);
	for(i=0;i<len;i++)
	{
		if(str[i]!=str[len-i-1])
		{
			isPalindrome=0;
			break;
		}
		
	}
	if(isPalindrome)
		printf("%s is palindrome",str);
	else
		printf("%s is not palindrome",str);
	
}