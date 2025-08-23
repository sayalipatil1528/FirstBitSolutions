#include<stdio.h>
void sell_Price(double,double);
void main()
{
	double cost_price;
	double discount=15;
	printf("Enter Cost Price of Book :");
	scanf("%lf",&cost_price);
	sell_Price(cost_price,discount);
	
	
	
}
void sell_Price(double c_price,double disc)
{
	double discount=(c_price*disc)/100;
	double Selling_Price=c_price-discount;
	printf("Selling Price of book is %lf ",Selling_Price);
}