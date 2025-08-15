#include<stdio.h>
#include<conio.h>
void Table(); //function declaration
void main()
{
	Table(); //function call
} //main() ends here
void Table()//function defination
{
	int no=5,i=1;
	while(i<=10)
	{
		printf("%d ",no*i);
		i++;
	}
	
}