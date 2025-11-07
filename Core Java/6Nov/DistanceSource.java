import java.util.Scanner;
class Distance
{
	int km,m;

	Distance()//Default
	{
		System.out.println("Default constructor called");
		this.km=12;
		this.m=240;
	}

	Distance(int k,int mt)//Parameteried
	{
		System.out.println("Parameteried constructor called");
		this.km=k;
		this.m=mt;
	}
	void setKiloMeter(int k)
	{
		this.km=k;
	}
	void setMeter(int m)
	{
		this.m=m;
	}


	int getKiloMeter()
	{
		return this.km;
	}
	int getMeter()
	{
		return this.m;
	}

	
	void display()
	{
		System.out.println("\nKiloMeter : "+this.km);
		System.out.println("\nMeter : "+this.m);
	}
	
}//HR class ends here
class TestDistance
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter KiloMeter : ");
		int km=sc.nextInt();

		System.out.println("Enter Meter : ");
		int m=sc.nextInt();

		Distance d1=new Distance(km,m);
		d1.display();
		

	}//main ends here
}//TestDistance ends here
		
	