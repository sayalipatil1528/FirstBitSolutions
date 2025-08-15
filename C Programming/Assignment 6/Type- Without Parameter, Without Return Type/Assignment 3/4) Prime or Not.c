#include<stdio.h>
#include<conio.h>
void Is_Prime(); //function declaration
void main()
{
	Is_Prime(); //function call
} //main() ends here
void Is_Prime()//function defination
{
	int No=13,flag=0,i=2;
	while(i<=No/2)
	{
		if(No%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag==0)
	{
		printf("%d is prime",No);
	}
	else                                                                       
	{
		printf("%d is not prime",No);
	}
	
}