package In;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee()//default
	{
		System.out.println("Employee default constructor ");
		id=101;
		name="Sonali";
		salary=30000;
	}

	Employee(int id, String name, double salary)//Parameterized 
	{
		System.out.println("Employee Parameterized constructor ");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("\nId is : "+this.id);
		System.out.println("Name is : "+this.name);
		System.out.println("Salary is : "+this.salary);
	}
	
}//Employee class ends here

class SalesManager extends Employee
{
	
	double incentive;
	double target;
	
	SalesManager()//default
	{
		
		super();
		System.out.println("SalesManager default constructor ");

		incentive=2000;
		target=23;
	}

	SalesManager(int id,String name,double salary,double incentive, double target) //parameterized
	{
		
		super(id,name,salary);
		System.out.println("SalesManager parameterized constructor ");
		this.incentive = incentive;
		this.target = target;
		
	}
	
	
	
	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	void display()
	{
		super.display();
		System.out.println("Incentive is : "+this.incentive);
		System.out.println("Target is : "+this.target);
	}
	
	
}//SalesManager ends here

class AreaSalesManager extends SalesManager
{
	String areaname;
	
	
	AreaSalesManager() 
	{
		super();
		System.out.println("AreaSalesManager default constructor ");
		areaname="Pune";
	}


	AreaSalesManager(int id, String name, double salary, double incentive, double target, String areaname)
	{
		super(id,name,salary,incentive,target);
		System.out.println("AreaSalesManager parameterized constructor ");
		this.areaname = areaname;
	}


	String getAreaname() {
		return areaname;
	}


	void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	
	void display()
	{
		super.display();
		System.out.println("Area name is : "+this.areaname);
	}
	
	
	
}//AreaSalesManager class ends here

class Admin extends Employee
{
	int id;
	String name;
	double salary;
	double allowance;
	
	Admin()//default
	{
		super();
		allowance=2000;
		System.out.println("Admin default constructor ");
	}

	Admin(int id, String name, double salary, double allowance) 
	{
		super(id,name,salary);
		this.allowance = allowance;
		System.out.println("Admin parameterized constructor ");
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance is : "+this.allowance);
	}
	
}//Admin class ends here

class HR extends Employee
{
	
	double commision;
	
	HR()//default
	{
		super();
		commision=3000;
		System.out.println("HR default constructor ");
	}

	HR(int id, String name, double salary, double commision) 
	{
		super(id,name,salary);
		this.commision = commision;
		System.out.println("HR parameterized constructor ");
	}

	double getCommision() {
		return commision;
	}

	void setCommision(double commision) {
		this.commision = commision;
	}
	
	void display()
	{
		super.display();
		System.out.println("Commision is : "+this.commision);
	}
	
}//HR class ends here


class TestEmployee
{
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.display();
		
		Admin a1=new Admin(101,"Komal",20000,2000);
		a1.display();
	
	
		SalesManager s1=new SalesManager();
		s1.display();
		
		AreaSalesManager as1=new AreaSalesManager();
		as1.display();
		
		HR h1=new HR(102,"Sakshi",23000,20000);
		h1.display();
	}
}
