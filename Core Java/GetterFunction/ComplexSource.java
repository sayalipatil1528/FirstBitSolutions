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

	int getReal()
	{
		return this.real;
	}
	int getImaginary()
	{
		return this.imaginary;
	}


	void display()
	{
		System.out.println("\n"+this.real+"+"+this.imaginary);
	}
}//Complex class ends here
class TestComplex
{
	public static void main(String[]args)
	{
		Complex c1,c2;
		c1=new Complex();
		c2=new Complex();

		c1.setReal(12);
		c1.setImaginary(5);

		c2.setReal(15);
		c2.setImaginary(4);

		//System.out.println(c1.real+"+"+c1.imaginary);

		if(c1.getReal()>c2.getReal())
		{
			System.out.println("c1 is big");
		}
		else
		{
			System.out.println("c2 is big");
		}

		c1.display();
		c2.display();
	}//main ends here
}//TestComplex ends here