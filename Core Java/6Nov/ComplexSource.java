import java.util.Scanner;
jclass Complex
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
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Real : ");
		int real=sc.nextInt();

		System.out.println("Enter Imaginary : ");
		int img=sc.nextInt();

		Complex c1=new Complex(real,img);
		c1.display();
		
	}//main ends here
}//TestComplex ends here