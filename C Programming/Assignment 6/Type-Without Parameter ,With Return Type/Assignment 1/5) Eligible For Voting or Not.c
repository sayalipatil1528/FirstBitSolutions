#include<stdio.h>
int Age();
void main()
{
	int res;
	res=Age();
	if(res==1)
		printf("Eligible For Voting");
	else
		printf("Not Eligible For Voing");
	
}
int Age()
{
	int age=24;
	if(age>=18)
		return 1;
	else
		return 0;
}



