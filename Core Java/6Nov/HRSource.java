import java.util.Scanner;
class HR
{
	int id;   
	String name;
	double salary;
	double commision;

	HR()//default constructor
	{
		System.out.println("Default Constructor called");
		this.id=11;
		this.name="Komal";
		this.salary=24000;
		this.commision=2000;
	}

	HR(int i,String n,double s,double c)//Parameterized constructor
	{
		System.out.println("Parameterized Constructor called");
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commision=c;
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
	void setCommision(double c)
	{
		this.commision=c;
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
	double getCommision()
	{
		return this.commision;
	}

	void display()
	{
		System.out.println("\nId : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
		System.out.println("Commision : "+this.commision);	
	}
}//HR class ends here
class TestHR
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();


		System.out.println("Enter Commision : ");
		double commision=sc.nextDouble();

		System.out.println("Enter Salary : ");
		double salary=sc.nextDouble();
		
		HR h1=new HR(id,name,salary,commision);
		h1.display();
		
	}//main ends here
}//TestHR ends here
		
	