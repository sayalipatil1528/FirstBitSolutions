import java.util.Scanner;
class Admin
{
	int id;
	String name;
	double salary;
	double allowance;


	Admin() //default
	{
		System.out.println("Default Constructor called");
		this.id=12;
		this.name="Sanika";
		this.salary=24000;
		this.allowance=2000;
	}

	Admin(int i,String n,double s,double a) //Parameterized
	{
		System.out.println("Parameterized Constructor called");
		this.id=i;
		this.name=n;
		this.salary=s;
		this.allowance=a;
	}

	void setID	(int i)
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
	void setAllowance(double a)
	{
		this.allowance=a;
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
	double getAllowance()
	{
		return this.allowance;
	}


	void display()
	{
		System.out.println("\nId is : "+this.id);
		System.out.println("Name is : "+this.name);
		System.out.println("Salary is : "+this.salary);
		System.out.println("Allowance is : "+this.allowance);
	}

}//Admin class ends here
class TestAdmin
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();
	
		System.out.println("Enter Salary : ");
		Double sal=sc.nextDouble();

		System.out.println("Enter Allowance : ");
		Double allowance=sc.nextDouble();

		Admin a1=new Admin(id,name,sal,allowance);

		a1.display();
		

	}//main ends here
}//TestAdmin ends here