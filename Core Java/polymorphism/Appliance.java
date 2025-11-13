package polymorphism;

class Appliance {
	String brand;
	int power;
	
	Appliance() {
		brand="abc";
		power=56;
	}

	Appliance(String brand, int power)
	{
		this.brand = brand;
		this.power = power;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getPower() {
		return power;
	}

	void setPower(int power) {
		this.power = power;
	}
	
	void display()
	{
		System.out.println("\nBrand is : "+this.brand);
		System.out.println("Power is : "+this.power);
	}
	
	

}//class Appliance ends here

class Fan extends Appliance
{
	int speedlevel;
	String type;
	
	Fan()
	{
		super();
		speedlevel=57;
		type="abc";
	}

	Fan(String brand, int power, int speedlevel, String type) 
	{
		super(brand,power);
		this.speedlevel = speedlevel;
		this.type = type;
	}

	int getSpeedlevel() {
		return speedlevel;
	}

	void setSpeedlevel(int speedlevel) {
		this.speedlevel = speedlevel;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	void display()
	{
		super.display();
		System.out.println("Speed Level : "+this.speedlevel);
		System.out.println("Type : "+this.type);
	}
	
	
}//Fan class ends here

class AC extends Appliance
{
	
	double toncapacity;
	
	AC()
	{
		super();
		toncapacity=26;
	}

	AC(String brand, int power, double toncapacity)
	{
		super(brand,power);
		this.toncapacity = toncapacity;
	}

	double getToncapacity() {
		return toncapacity;
	}

	void setToncapacity(double toncapacity) {
		this.toncapacity = toncapacity;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("TonCapacity is "+this.toncapacity);
	}
	
}//class AC ends here

class Fridge extends Appliance
{
	int capacityLiters;
	
	Fridge() {
		super();
		capacityLiters=20;
	}
	
	

	public Fridge(String brand, int power, int capacityLiters) {
		super(brand,power);
		this.capacityLiters = capacityLiters;
	}




	int getCapacityLiters() {
		return capacityLiters;
	}

	void setCapacityLiters(int capacityLiters) {
		this.capacityLiters = capacityLiters;
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity liters : "+this.capacityLiters);
	}
}//class Fridge ends here

class TestAppliance
{
	public static void main(String[]args)
	{
		Appliance a1;//generic reference
		a1=new Appliance();
		a1.display();
		
		a1=new Fan("abc",27,45,"xyz");//upcasting
		a1.display();
		
		a1=new AC();//upcasting
		a1.display();
		
		a1=new Fridge();//upcasting
		a1.display();
	}
}//class TestAppliance ends here

