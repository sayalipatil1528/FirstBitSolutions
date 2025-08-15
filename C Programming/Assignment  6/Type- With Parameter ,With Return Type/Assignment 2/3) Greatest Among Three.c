#include<stdio.h>
int Greatest(int,int,int); //function declaration
void main()
{
	int a,b,c;
	printf("Enter a,b and c : ");
	scanf("%d%d%d",&a,&b,&c);
	int res=Greatest(a,b,c); //function call
	if(res==1)
		printf("a is greater");
	else if(res==2)
		printf("b is greater");
	else
		printf("c is greater");
}
int Greatest(int x,int y,int z)  //function defination
{
	if(x>y && x>z)
		return 1;
		
	else if(y>x && y>z)
		return 2;
		
	else
		return 3;
}
