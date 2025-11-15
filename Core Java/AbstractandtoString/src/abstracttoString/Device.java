package abstracttoString;

abstract class Device
{

	String brand;
	int power;
	
	Device() {
		brand="abc";
		power=56;
	}

	Device(String brand, int power)
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
	
	abstract void operate();
	
	
	public String toString()
	{
		return "\nBrand : "+this.brand+"\nPower : "+this.power;
	}
//	void display()
//	{
//		System.out.println("\nBrand is : "+this.brand);
//		System.out.println("Power is : "+this.power);
//	}
	
}//class Device ends here

class Fan extends Device
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
	
	void operate()
	{
		System.out.println("Fan is rotating\n");
	}
	
	public String toString()
	{
		return super.toString()+"\nSpeed level : "+this.speedlevel+"\nType : "+this.type;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("Speed Level : "+this.speedlevel);
//		System.out.println("Type : "+this.type);
//	}
	
	
}//Fan class ends here

class AC extends Device
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
	
	void operate()
	{
		System.out.println("AC makes room cool\n");
	}
	
	public String toString()
	{
		return super.toString()+"\nTon Capacity is : "+this.toncapacity;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("TonCapacity is "+this.toncapacity);
//	}
	
}//class AC ends here

class Fridge extends Device
{
	int capacityLiters;
	
	Fridge() {
		super();
		capacityLiters=20;
	}
	
	

	Fridge(String brand, int power, int capacityLiters) {
		super(brand,power);
		this.capacityLiters = capacityLiters;
	}

	int getCapacityLiters() {
		return capacityLiters;
	}

	void setCapacityLiters(int capacityLiters) {
		this.capacityLiters = capacityLiters;
	}
	
	void operate()
	{
		System.out.println("Fridge keeping food items cold and fresh\n");
	}
	
	
	public String toString()
	{
		return super.toString()+"\nCapacity liters : "+this.capacityLiters;
	}
	
	
//	void display()
//	{
//		super.display();
//		System.out.println("Capacity liters : "+this.capacityLiters);
//	}
}//class Fridge ends here

class TestDevice
{
	public static void main(String[]args)
	{
		Device d1;//generic reference
//		d1=new Device("Samsung",56);
//		d1.display();
//		d1.operate();
		
		d1=new Fan("Havells", 75, 5, "Ceiling Fan");//upcasting
		//d1.display();
		System.out.println(d1);
		d1.operate();
		
		d1=new AC("Samsung", 1500, 1.5);//upcasting
		//d1.display();
		System.out.println(d1);
		d1.operate();
		
		d1=new Fridge("LG", 800, 350);//upcasting
		//d1.display();
		System.out.println(d1);
		d1.operate();
	}
}//class TestDevice ends here



