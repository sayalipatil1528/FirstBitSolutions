package In;

public class Student {

	int Fbsid;
	String Name;
	int Distance;
	
	static int count=0;

		
	Student()
	{
		System.out.println("Student default constructor called");
		Fbsid=11;
		Name="Karan";
		Distance=10;
		count++;
	}//Default
	
	
	Student(int fbsid, String name, int distance)
	{
		System.out.println("Student Parameterized constructor called");
		this.Fbsid = fbsid;
		this.Name = name;
		this.Distance = distance;
		count++;
	}//Parameterized


	int getFbsid() {
		return Fbsid;
	}

	void setFbsid(int fbsid) {
		Fbsid = fbsid;
	}

	String getName() {
		return Name;
	}

	void setName(String name) {
		Name = name;
	}

	int getDistance() {
		return Distance;
	}

	void setDistance(int distance) {
		Distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}
	
	void display()
	{
		System.out.println("\nFirstbit id is : "+this.Fbsid);
		System.out.println("Name is : "+this.Name);
		System.out.println("Distance is : "+this.Distance);
	}
	
	
}//class student ends here
class PlacedStudent extends Student //step 1
{
	//step 2 remove state and behavior which is available in super class
	String companyname;
	String designation;
	

	
	PlacedStudent()
	{
		super();
		companyname="Wipro";
		designation="";
		System.out.println("PlacedStudent default constructor called");
	
	}//Default
	
	
	
	PlacedStudent(int fbsid, String name, int distance, String companyname, String designation) 
	{
		super(fbsid,name,distance);
		System.out.println("PlacedStudent parameterized constructor called");
		
		this.companyname = companyname;
		this.designation = designation;
		
		
	}



	String getCompanyname() {
		return companyname;
	}
	void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display()
	{
		super.display();
		System.out.println("Company name is : "+this.companyname);
		System.out.println("Designation is : "+this.designation);
	}
	
}//class PlacedStudent ends here

class DemoInheritance
{
	public static void main(String[]args)
	{
		//Student s1=new Student();
		//System.out.println("Student count total : "+Student.getCount());
		
		
		//Student s2=new Student(101,"Sanika",100);
		//System.out.println("Student count total : "+Student.getCount());
		
		PlacedStudent ps2=new PlacedStudent();
		ps2.display();
		System.out.println("Student count total : "+Student.getCount());
		
		PlacedStudent ps1=new PlacedStudent(1,"abc",20,"xyz","abc");
		System.out.println("Student count total : "+Student.getCount());
		
		ps1.display();
		
	}
}//class DemoInheritance ends here
