#include<stdio.h>
#include<conio.h>
void marks();  // function declaration
void main()
{
	marks();  //function call
}//main() ends here
void marks()
{
	int S1=65,S2=54,S3=66,S4=76,S5=56,Total;
	float per;
	Total=S1+S2+S3+S4+S5;
	per=Total/5.0;
	printf("Five Subjects Total Marks is %d And Percentage is %f",Total,per);
}

