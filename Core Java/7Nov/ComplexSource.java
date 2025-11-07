class Complex
{
	int real,imaginary;

	Complex()//Default
	{
		System.out.println("Default Consrtuctor called");
		this.real=21;
		this.imaginary=4;
	}

	Complex(int r,int i)//Parameterized
	{
		System.out.println("Parameterized Consrtuctor called");
		this.real=r;
		this.imaginary=i;
	}

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
		Complex arr[]=new Complex[3];
		arr[0]=new Complex();
		arr[1]=new Complex(10,7);
		arr[2]=new Complex();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			arr[i].display();
		}

		Complex c1,c2,c3,c4;
		c1=new Complex();
		c2=new Complex();
		c3=new Complex();
		c4=new Complex(14,6);

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
		c3.display();
		c4.display();
	}//main ends here
}//TestComplex ends here