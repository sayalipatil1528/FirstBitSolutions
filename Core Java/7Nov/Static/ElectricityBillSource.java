class ElectricityBill
{
	int custId;
	String name;
	int unitConsumed;
	static double RatePerUnit = 5.5;

	ElectricityBill() //default constructor
	{
		this.custId = 1;
		this.name = "Amol";
		this.unitConsumed = 3;
	}
	
	ElectricityBill(int i, String n, int u) //Parameterized constructor
	{
		this.custId = i;
		this.name = n;
		this.unitConsumed = u;
	}

	//Setters
	void setCustId(int i)
	{
		this.custId = i;
	}
	void setName(String n)
	{
		this.name = n;
	}
	void setUnitConsumed(int u)
	{
		this.unitConsumed = u;
	}
	
	// Static method to change rate
	static void changeRate(double newrate)
	{
		RatePerUnit = newrate;
	}

	//Getters
	int getCustId()
	{
		return this.custId;
	}
	String getName()
	{
		return this.name;
	}
	int getUnitConsumed()
	{
		return this.unitConsumed;
	}
	
	static double getRatePerUnit()
	{
		return RatePerUnit;
	}

	//Calculate bill
	double calculateBill()
	{
		return unitConsumed * RatePerUnit;
	}

	//display
	void display()
	{
		System.out.println("\nCustomer ID : " + custId);
		System.out.println("Customer Name : " + name);
		System.out.println("Unit Consumed : " + unitConsumed);
		System.out.println("Rate per unit : " + RatePerUnit);
	}

}// class ends

class TestElectricityBill 
{
	public static void main(String[]args)
	{
		ElectricityBill e1 = new ElectricityBill(11, "Karan", 12);	
		e1.display();
		
		ElectricityBill e2 = new ElectricityBill(12, "Sonal", 7);	
		e2.display();

		ElectricityBill e3 = new ElectricityBill(13, "Priti", 10);	
		e3.display();
		
		ElectricityBill.changeRate(6.5);
		System.out.println("After Changing Rate...");
		System.out.println("Total Amount  : " + e1.calculateBill());
		System.out.println("Total Amount  : " + e2.calculateBill());
		System.out.println("Total Amount : " + e3.calculateBill());
	}

}
