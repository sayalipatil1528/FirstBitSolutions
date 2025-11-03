class HR
{
	int id;
	String name;
	double salary;
	double commision;
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
}//HR class ends here
class TestHR
{
	public static void main(String[]args)
	{
		HR h1;
		h1=new HR();
		h1.setID(10);
		h1.setName("Anil");
		h1.setSalary(22000);
		h1.setCommision(3000);
		System.out.println("Id : "+h1.id+"\nName : "+h1.name+"\nSalary : "+h1.salary+"\nCommision : "+h1.commision);
	}//main ends here
}//TestHR ends here
		
	