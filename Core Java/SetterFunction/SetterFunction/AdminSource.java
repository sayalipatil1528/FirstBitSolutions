class Admin
{
	int id;
	String name;
	double salary;
	double allowance;
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
}//Admin class ends here
class TestAdmin
{
	public static void main(String[]args)
	{
		Admin a1;
		a1=new Admin();
		a1.setID(1);
		a1.setName("Sanket");
		a1.setSalary(23000);
		a1.setAllowance(1000);
		System.out.println("Id is : "+a1.id+"\nName is : "+a1.name+"\nSalary is : "+a1.salary+"\nAllowance is : "+a1.allowance);
	}//main ends here
}//TestAdmin ends here