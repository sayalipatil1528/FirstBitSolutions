import java.util.Scanner
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
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Day : ");
		int day=sc.nextInt();

		System.out.println("Enter Month : ");
		int month=sc.nextInt();

		System.out.println("Enter Year : ");
		int year=sc.nextInt();


		System.out.println("Enter Day of week : ");
		String dow=sc.nextLine();

		Date d1=new Date(day,month,year,dow);
		d1.display();	
		
	}//main ends here
}
//Test Class ends here