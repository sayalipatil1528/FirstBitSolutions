import java.util.Scanner;
class SalesManager
{
	int id;
	String name;
	double salary;
	double incentive;
	double target;

	SalesManager()//default
	{
		System.out.println("Default Constructor called");
		this.id=12;
		this.name="Amit";
		this.salary=20000;
		this.incentive=1000;
		this.target=20;
	}

	SalesManager(int i,String n,double s,double inc,double t)//Parameterized
	{
		System.out.println("Parameterized Constructor called");
		this.id=i;
		this.name=n;
		this.salary=s;
		this.incentive=inc;
		this.target=t;
	}
	void setID(int i)
	{
		this.id=i;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setSalary(double s)
	{
		this.salary=s;
	}
	void setIncentive(double inc)
	{
		this.incentive=inc;
	}
	void setTarget(double t)
	{
		this.target=t;
	}

	
	int getID()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	double getIncentive()
	{
		return this.incentive;
	}
	double getTarget()
	{
		return this.target;
	}


	void display()
	{
		System.out.println("\nId : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
		System.out.println("Incentive : "+this.incentive);
		System.out.println("Target : "+this.target);
	}
}//SalesManager class ends here
class TestSalesManager
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();

		System.out.println("Enter Salary : ");
		double salary=sc.nextDouble();

		System.out.println("Enter Incentive : ");
		double inc=sc.nextDouble();

		System.out.println("Enter Target : ");
		double target=sc.nextDouble();

		SalesManager s1=new SalesManager(id,name,salary,inc,target);
		s1.display();
		
	}//main ends here
}//TestSalesManager ends here
		
	