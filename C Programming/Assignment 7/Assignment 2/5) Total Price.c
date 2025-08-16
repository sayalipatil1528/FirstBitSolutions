#include<stdio.h>
void TotalPrice(char*,double*); //function declaration
void main()
{
	char isstudent='y';
	double price;
	printf("Enter price : ");
	scanf("%lf",&price);
	TotalPrice(&isstudent,&price); //function call
}
void TotalPrice(char* isstudent,double* price)  //function defination
{

	double tprice;
	if(*isstudent=='y')
	{
		if(*price>500)
		{
			tprice=*price-(*price*0.20);
		}
		else
		{
			tprice=*price-(*price*0.10);
		}
	}
	else
	{
		if(*price>600)
		{
			tprice=*price-(*price*0.15);
		}
		else
		{
			tprice=*price;
		}
	}
	printf("Total price is=%2lf",tprice);
}