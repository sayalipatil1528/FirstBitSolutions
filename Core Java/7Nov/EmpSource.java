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
		Employee arr[]=new Employee[3];
		arr[0]=new Employee();
		arr[1]=new Employee(1,"Sahil",34000);
		arr[2]=new Employee();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			arr[i].display();
		}
		Employee e1,e2,e3,e4;
		e1=new Employee();
		e2=new Employee();
		e3=new Employee();
		e4=new Employee(6,"Kirti",40000);

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
		e3.display();
		e4.display();

	}//main ends here
}//TestEmployee Class ends here