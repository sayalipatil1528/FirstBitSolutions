import java.util.Scanner;
class Car
{
	String model,brand,colour;
	double price;
	int fuelcapacity;

	Car() //Default
	{
		System.out.println("Default Constructor called");
		this.model="Corolla";
		this.brand="Toyota";
		this.colour="Red";
		this.price=130000;
		this.fuelcapacity=67;
	}

	Car(String m,String b,String c,double p,int f) //Parameterized
	{
		System.out.println("Parameterized Constructor called");
		this.model=m;
		this.brand=b;
		this.colour=c;
		this.price=p;
		this.fuelcapacity=f;
	}
	void setModel(String m)
	{
		this.model=m;
	}
	void setBrand(String b)
	{
		this.brand=b;
	}
	void setColour(String c)
	{
		this.colour=c;
	}
	void setPrice(double p)
	{
		this.price=p;
	}
	void setFuelCapacity(int fc)
	{
		this.fuelcapacity=fc;
	}


	String getModel()
	{
		return this.model;
	}
	String getBrand()
	{
		return this.brand;
	}
	String getColour()
	{
		return this.colour;
	}
	Double getPrice()
	{
		return this.price;
	}
	int getFuelCapacity()
	{
		return this.fuelcapacity;
	}


	void display()
	{
		System.out.println("\nModel : "+this.model);
		System.out.println("Brand : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Colour : "+this.colour);
		System.out.println("Fuel Capacity : "+this.fuelcapacity);
	}
}//Car class ends here
class TestCar
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Model : ");
		String model=sc.nextLine();

		System.out.println("Enter Brand : ");
		String brand=sc.nextLine();

		System.out.println("Enter Colour : ");
		String colour=sc.nextLine();


		System.out.println("Enter Fuel Capacity : ");
		int capacity=sc.nextInt();

		System.out.println("Enter Price : ");
		double price=sc.nextDouble();

		Car c1=new Car(model,brand,colour,price,capacity);
		c1.display();
		
	}//main ends here
}//TestCar class ends here
