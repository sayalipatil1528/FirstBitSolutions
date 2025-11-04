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
		Car c1,c2,c3,c4;
		c1=new Car();
		c2=new Car();
		c3=new Car();
		c4=new Car("Model 3","Tesla","Black",1230000,78);

		c1.setModel("Celerio");
		c1.setBrand("Maruti Suzuki");
		c1.setPrice(1200000);
		c1.setColour("White");
		c1.setFuelCapacity(58);

		c2.setModel("Thar");
		c2.setBrand("Mahindra");
		c2.setPrice(1300000);
		c2.setColour("Black");
		c2.setFuelCapacity(54);

		//System.out.println("Model : "+c1.model+"\nBrand : "+c1.brand+"\nPrice : "+c1.price+"\nColour : "+c1.colour+"\nFuel Capacity : "+c1.fuelcapacity);

		if(c1.getFuelCapacity()>c2.getFuelCapacity())
		{
			System.out.println("c1 has high fuel capacity");
		}
		else
		{
			System.out.println("c2 has high fuel capacity");
		}

		c1.display();
		c2.display();
		c3.display();
		c4.display();

	}//main ends here
}//TestCar class ends here
