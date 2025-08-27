#include<stdio.h>
typedef struct Complex
{
	int real,img;
}Complex;
Complex store();
Complex addComplex(Complex ,Complex );
void display(Complex );
void main()
{
	Complex c1,c2,c3;
	printf("Enter Value for Complex 1 : \n");
	c1=store();
	printf("Enter Value for Complex 2 : \n");
	c2=store();
	
	c3=addComplex(c1,c2);
	
	printf("Details of Complex  : \n");
	display (c1);
	display(c2);
	display(c3);
}
Complex store()
{
	Complex temp;
	scanf("%d",&temp.real);
	scanf("%d",&temp.img);
	return temp;
}
Complex addComplex(Complex x,Complex y)
{
	Complex temp;
	temp.real=x.real+y.real;
	temp.img=x.img+y.img;
	return temp;
}
void display(Complex c)
{
	printf("%d + %d i\n",c.real,c.img);
}