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
		Admin a1,a2,a3,a4;
		a1=new Admin();
		a2=new Admin();
		a3=new Admin();
		a4=new Admin(5,"Ankit",45000,2000);

		a1.setID(1);
		a1.setName("Sanket");
		a1.setSalary(23000);
		a1.setAllowance(1000);

		a2.setID(2);
		a2.setName("Gaurav");
		a2.setSalary(27000);
		a2.setAllowance(500);

		//System.out.println("Id is : "+a1.id+"\nName is : "+a1.name+"\nSalary is : "+a1.salary+"\nAllowance is : "+a1.allowance);

		if(a1.getSalary()>a2.getSalary())
		{
			System.out.println("a1 has highest salary");
		}
		else
		{
			System.out.println("a2 has highest salary");
		}

		a1.display();
		a2.display();
		a3.display();
		a4.display();


	}//main ends here
}//TestAdmin ends here