class Employee
{
	int id;
	String name;
	double salary;
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
		Employee e1,e2;
		e1=new Employee();
		e2=new Employee();

		e1.setID(1);
		e1.setName("Sakshi");
		e1.setSalary(20000);

		e2.setID(2);
		e2.setName("Kartik");
		e2.setSalary(36000);

		/*System.out.println("Id is : "+e1.id);
		System.out.println("Name is : "+e1.name);
		System.out.println("Salary is : "+e1.salary);*/

		if(e1.getSalary()>e2.getSalary())
		{
			System.out.println("e1 has highest salary");
		}
		else
		{
			System.out.println("e2 has highest salary");
		}

		e1.display();
		e2.display();

	}//main ends here
}//TestEmployee Class ends here