import java.util.Scanner;
class Employee
{
	int id;
	String name;
	double salary;

	Employee()//default constructor
	{
		System.out.println("Default Constructor called");
		this.id=34;
		this.name="Sakshi";
		this.salary=30000;
	}

	Employee(int i,String n,double s)//Parameterized constructor
	{
		System.out.println("Parameterized Constructor called");
		this.id=i;
		this.name=n;
		this.salary=s;
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


	void display()
	{
		System.out.println("\nId : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
	}
}//Employee class ends here
class TestEmployee
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

		Employee e1=new Employee(id,name,salary);
		e1.display();
		

	}//main ends here
}//TestEmployee Class ends here