import java.util.Scanner;
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

		Date arr[]=new Date[3];
		arr[0]=new Date();
		arr[1]=new Date(7,11,2025,"Friday");
		arr[2]=new Date();
		arr[3]=new Date();
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			arr[i].display();
		}
		Date d1,d2,d3,d4;
		d1=new Date();
		d2=new Date();
		d3=new Date();
		d4=new Date(6,11,2025,"Thursday");

		d1.setDay(12);
		d1.setMonth(11);
		d1.setYear(2025);
		d1.setDOW("Friday");


		d2.setDay(13);
		d2.setMonth(11);
		d2.setYear(2025);
		d2.setDOW("Saturday");

		

		if(d1.getDay()>d2.getDay())
		{
			System.out.println("d1 is big");
		}
		else
		{
			System.out.println("d2 is big");
		}

		d1.display();
		d2.display();
		d3.display();
		d4.display();

		
	}//main ends here
}
//Test Class ends here