package In;

public class Vehicle {
	String brand;
	String model;
	double price;
	double mileage;
	
	Vehicle()//default
	{
		brand="xyz";
		model="abc";
		price=120000;
		mileage=35;
	}

	public Vehicle(String brand, String model, double price, double mileage)
	{
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mileage = mileage;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	double getMileage() {
		return mileage;
	}

	void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	void display()
	{
		System.out.println("\nBrand is : "+this.brand);
		System.out.println("Model is : "+this.model);
		System.out.println("Price is : "+this.price);
		System.out.println("Mileage is : "+this.mileage);
	}
	

}// Vehicle class ends here

class Car extends Vehicle
{
	int noofdoors;
	String fueltype;
	
	Car()//default
	{
		super();
		this.noofdoors=4;
		this.fueltype="xyz";
	}
	
	Car(String brand, String model, double price, double mileage, int noofdoors, String fueltype) 
	{
		super(brand,model,price,mileage);
		this.noofdoors = noofdoors;
		this.fueltype = fueltype;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getNoofdoors() {
		return noofdoors;
	}

	void setNoofdoors(int noofdoors) {
		this.noofdoors = noofdoors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of doors : "+this.noofdoors);
		System.out.println("Fuel Type is : "+this.fueltype);
	}
	
	
}//Car class ends here

class Bus extends Vehicle
{
	
	String bustype;
	int passengercapacity;
	
	Bus()
	{
		super();
		bustype="abc";
		passengercapacity=40;
	}
	
	Bus(String brand, String model, double price, double mileage, String bustype, int passengercapacity) 
	{
		super(brand,model,price,mileage);

		this.bustype = bustype;
		this.passengercapacity = passengercapacity;
	}

	String getBustype() {
		return bustype;
	}

	void setBustype(String bustype) {
		this.bustype = bustype;
	}

	int getPassengercapacity() {
		return passengercapacity;
	}

	void setPassengercapacity(int passengercapacity) {
		this.passengercapacity = passengercapacity;
	}
	
	void display()
	{
		super.display();
		System.out.println("Bus type : "+this.bustype);
		System.out.println("Passenger Capacity is : "+this.passengercapacity);
	}
	
}//Bus class ends here

class Bike extends Vehicle
{
	
	String biketype;
	
	Bike()
	{
		super();
		biketype="abc";
	}
	
	Bike(String brand, String model, double price, double mileage, String biketype) 
	{
		super(brand,model,price,mileage);
		this.biketype = biketype;
	}

	String getBiketype() {
		return biketype;
	}

	void setBiketype(String biketype) {
		this.biketype = biketype;
	}
	
	void display()
	{
		super.display();
		System.out.println("Bike Type : "+this.biketype);
	}
	
	
}//Bike class ends here

class TestVehicle
{
	public static void main(String[]args){
		
		Vehicle v1=new Vehicle();
		v1.display();
		
		Car c1=new Car("Maruti Suzuki","Swift",2300000,22.3,4,"Petrol");
		c1.display();
		
		Bus b1=new Bus();
		b1.display();
		
		Bike bk1=new Bike("Hero","Splender",76000,23.5,"Commuter");
		bk1.display();
	}
}