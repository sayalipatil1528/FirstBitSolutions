#include<stdio.h>
#include<conio.h>
void Num(); //function declaration
void main()
{
	Num(); //function call
} //main() ends here
void Num()//function defination
{
	int i=1;
	while(i<=10)
	{
		printf("%d ",i);
		i++;
	}
	
}