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
		HR arr[]=new HR[3];
		arr[0]=new HR();
		arr[1]=new HR(1,"Sonal",23000,4300);
		arr[2]=new HR();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		HR h1,h2,h3,h4;
		h1=new HR();
		h2=new HR();
		h3=new HR();
		h4=new HR(3,"Ankita",20000,2400);


		h1.setID(10);
		h1.setName("Anil");
		h1.setSalary(22000);
		h1.setCommision(3000);

		h2.setID(15);
		h2.setName("Priti");
		h2.setSalary(19000);
		h2.setCommision(5000);
		//System.out.println("Id : "+h1.id+"\nName : "+h1.name+"\nSalary : "+h1.salary+"\nCommision : "+h1.commision);

		if(h1.getCommision()>h2.getCommision())
		{
			System.out.println("h1 has high commision");
		}
		else
		{
			System.out.println("h2 has high commision");
		}

		h1.display();
		h2.display();
		h3.display();
		h4.display();
		
	}//main ends here
}//TestHR ends here
		
	