#include<stdio.h>
#include<string.h>
void main()
{
	char str1[10],str2[10];
	printf("Enter String 1 and String 2 : ");
	scanf("%s%s",str1,str2);
	
	int len1=0,len2=0;
	while(str1[len1]!='\0')
	{
		len1++;
	}
	while(str2[len2]!='\0')
	{
		len2++;
	}
	if(len1>len2)
	{
		printf("Larger string is: %s",str1);
    } 
	else if (len2 > len1) 
	{
        printf("Larger string is: %s",str2);
    } 
	else 
	{
        printf("Both strings are of equal length.\n");
    }
	
}