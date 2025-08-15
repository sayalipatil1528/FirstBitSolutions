#include<stdio.h>
double Price(char,double);

void main()
{
	char isstudent='y';
	double price=5000;
	double res=Price(isstudent,price);
	printf("Total price is=%lf",res);
}
double Price(char isstudent,double price)
{
	double tprice;
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
	return tprice;
	
}

				