#include<stdio.h>
#include<conio.h>
void Sum_num(); //function declaration
void main()
{
	Sum_num(); //function call
} //main() ends here
void Sum_num()//function defination
{
	int No=1,sum=0;
	while(No<=5)
	{
		sum=sum+No;
		No++;
	}
	printf("%d",sum);
	
}