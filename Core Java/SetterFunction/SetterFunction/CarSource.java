class Car
{
	String model,brand,colour;
	double price;
	int fuelcapacity;
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
}//Car class ends here
class TestCar
{
	public static void main(String[]args)
	{
		Car c1;
		c1=new Car();
		c1.setModel("Celerio");
		c1.setBrand("Maruti Suzuki");
		c1.setPrice(1200000);
		c1.setColour("White");
		c1.setFuelCapacity(58);
		System.out.println("Model : "+c1.model+"\nBrand : "+c1.brand+"\nPrice : "+c1.price+"\nColour : "+c1.colour+"\nFuel Capacity : "+c1.fuelcapacity);
	}//main ends here
}//TestCar class ends here
