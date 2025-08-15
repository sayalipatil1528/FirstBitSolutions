#include<stdio.h>
char UppLower();
void main()
{
	int res;
	res=UppLower();
	if(res==1)
		printf("Character is UpperCase");
	else
		printf("Character is LowerCase");
	
}
char UppLower()
{
	char ch='S';
	if(ch>='A' && ch<='Z')
		return 1;
	else
		return 0;
}



