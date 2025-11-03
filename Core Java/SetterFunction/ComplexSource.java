class Complex
{
	int real,imaginary;
	void setReal(int r)
	{
		this.real=r;
	}
	void setImaginary(int i)
	{
		this.imaginary=i;
	}
}//Complex class ends here
class TestComplex
{
	public static void main(String[]args)
	{
		Complex c1;
		c1=new Complex();
		c1.setReal(12);
		c1.setImaginary(5);
		System.out.println(c1.real+"+"+c1.imaginary);
	}//main ends here
}//TestComplex ends here