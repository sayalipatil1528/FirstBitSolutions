#include<stdio.h>
#include<conio.h>
void Total_Price(); //function declaration
void main()
{
	Total_Price(); //function call
} //main() ends here
void Total_Price()//function defination
{
	char isstudent='y';
	double price=5000,tprice;
	if(isstudent=='y')
	{
		if(price>500)
		{
			tprice=price-price*0.20;
		}
		else
		{
			tprice=price-price*0.10;
		}
	}
	else
	{
		if(price>600)
		{
			tprice=price-price*0.15;
		}
		else
		{
			tprice=price;
		}
	}
	printf("Total price is=%2lf",tprice);
	
}