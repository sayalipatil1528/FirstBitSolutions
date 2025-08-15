#include<stdio.h>
int Vote(int); //function declaration
void main()
{
	int age;
	printf("Enter age : ");
	scanf("%d",&age);
	int res=Vote(age); //function call
	if(res==1)
		printf("%d is Eligible For Voting",age);
	else
		printf("%d is Not Eligible For Voting",age);
}
int Vote(int age)  //function defination
{
	
	if(age>=18)
		return 1;
	else
		return 0;
}