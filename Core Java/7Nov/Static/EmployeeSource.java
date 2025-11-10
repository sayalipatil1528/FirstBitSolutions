class Employee
{
	String name;
	double basicSalary;
	static double BonusRate = 7.5;

	Employee() //default constructor
	{
		this.name = "Amol";
		this.basicSalary = 30000;
	}
	
	Employee(String n, double bs) //Parameterized constructor
	{
		this.name = n;
		this.basicSalary = bs;
	}

	//Setters
	void setName(String n)
	{
		this.name = n;
	}
	void setBasicSalary(double s)
	{
		this.basicSalary = s;
	}
	
	
	static void changeBonusRate(double newrate)
	{
		BonusRate = newrate;
	}

	//Getters
	
	String getName()
	{
		return this.name;
	}
	double getBasicSalary()
	{
		return this.basicSalary;
	}
	
	static double getBonusRate()
	{
		return BonusRate;
	}

	//Calculate bill
	double calculateSalary()
	{
		return basicSalary+(basicSalary*BonusRate/100);
	}

	//display
	void display()
	{
		System.out.println("\nName: " + name);
        		System.out.println("Basic Salary: " + basicSalary);
       		 System.out.println("Bonus Rate: " + BonusRate );
	}

}// class ends

class TestEmployee
{
	public static void main(String[]args)
	{
		Employee e1 = new Employee ("Karan", 22000);	
		e1.display();
		
		Employee e2 = new Employee ("Sonal", 20000);	
		e2.display();

		Employee e3 = new Employee ( "Priti", 21000);	
		e3.display();
		
		Employee .changeBonusRate(8.5);
		System.out.println("After Changing Rate...");
		System.out.println("Total Amount : " + e1.calculateSalary());
		System.out.println("Total Amount : " + e2.calculateSalary());
		System.out.println("Total Amount : " + e3.calculateSalary());
	}

}
