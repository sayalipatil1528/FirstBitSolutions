class Date
{
	int day,month,year;
	String dow;


	Date() //Default 
	{
		System.out.println("Default Constructor called");
		this.day=23;
		this.month=3;
		this.year=2022;
		this.dow="Sunday";
	}

	Date(int d,int m,int y,String str) //Parameterized
	{
		System.out.println("ParameterizedConstructor called");
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=str;
	}

	void setDay(int d)
	{
		this.day=d;
	}
	void setMonth(int m)
	{
		this.month=m;
	}
	void setYear(int y)
	{
		this.year=y;
	}
	void setDOW(String str)
	{
		this.dow=str;
	}
	int getDay()
	{
		return this.day;
	}
	int getMonth()
	{
		return this.month;
	}
	int getYear()
	{
		return this.year;
	}
	String getDOW()
	{
		return this.dow;
	}

	void display()
	{
		System.out.println("Day is : "+this.day);
		System.out.println("Month is : "+this.month);
		System.out.println("Year is : "+this.year);
		System.out.println("Day of week is : "+this.dow);
	}
}
//Date Class ends here
class TestDate
{
	public static void main(String[]args)
	{
		Date d1,d2,d3,d4;
		d1=new Date();
		d2=new Date();
		d3=new Date();
		d4=new Date(4,11,2025,"Tuesday");

		d1.setDay(2);
		d1.setMonth(11);
		d1.setYear(2025);
		d1.setDOW("Sunday");

		d2.setDay(3);
		d2.setMonth(11);
		d2.setYear(2025);
		d2.setDOW("Monday");

		//System.out.println("Date is : "+d1.day+"/"+d1.month+"/"+d1.year);
		//System.out.println("Day is : "+d1.dow);
		//System.out.println("Date is : "+d2.day+"/"+d2.month+"/"+d2.year);
		//System.out.println("Day is : "+d2.dow);
		
		if(d1.getDay()>d2.getDay())
		{
			System.out.println("d1 is younger");
		}
		else
		{
			System.out.println("d2 is younger");
		}

		if(d1.getMonth()>d2.getMonth())
		{
			System.out.println("d1 is younger");
		}
		else
		{
			System.out.println("d2 is younger");
		}

		if(d1.getYear()>d2.getYear())
		{
			System.out.println("d1 is younger");
		}
		else
		{
			System.out.println("d2 is younger");
		}

		d1.display();	
		d2.display();
		d3.display();	
		d4.display();
	}//main ends here
}
//Test Class ends here