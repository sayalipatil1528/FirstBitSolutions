#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	char result[20];
	printf("Enter a String : ");
	scanf("%s",str);
	
	int i=0,j=0;
	for(i=0;str[i]!='\0';i++)
	{
		if(i%2==0)
		{
			result[j]=str[i];
			j++;
		}
	}
	printf("After removing character of odd index is %s",result);
}