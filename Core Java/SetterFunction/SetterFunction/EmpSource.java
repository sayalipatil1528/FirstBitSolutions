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
}//Employee class ends here
class TestEmployee
{
	public static void main(String[]args)
	{
		Employee e1;
		e1=new Employee();
		e1.setID(1);
		e1.setName("Sakshi");
		e1.setSalary(20000);
		System.out.println("Id is : "+e1.id);
		System.out.println("Name is : "+e1.name);
		System.out.println("Salary is : "+e1.salary);
	}//main ends here
}//TestEmployee Class ends here