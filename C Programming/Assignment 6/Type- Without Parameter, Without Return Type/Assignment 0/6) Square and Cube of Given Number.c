#include<stdio.h>
#include<conio.h>
void square();//function declaration
void cube();
void main()
{
	square();//function call
	cube();//function call
	
}//main() end here

void square()  //function defination
{
	int No=5,Square;
	Square=No*No;
	printf("Square of %d is %d \n",No,Square);

}
void cube()//function defination
{
	int No=5,Cube;
	Cube=No*No*No;
	printf("Cube of %d is %d",No,Cube);
}
