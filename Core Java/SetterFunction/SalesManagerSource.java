class SalesManager
{
	int id;
	String name;
	double salary;
	double incentive;
	double target;
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
}//SalesManager class ends here
class TestSalesManager
{
	public static void main(String[]args)
	{
		SalesManager s1;
		s1=new SalesManager ();
		s1.setID(5);
		s1.setName("Sonal");
		s1.setSalary(20000);
		s1.setIncentive(2000);
		s1.setTarget(100);
		System.out.println("Id : "+s1.id+"\nName : "+s1.name+"\nSalary : "+s1.salary+"\nIncentive : "+s1.incentive+"\nTarget : "+s1.target);
	}//main ends here
}//TestSalesManager ends here
		
	