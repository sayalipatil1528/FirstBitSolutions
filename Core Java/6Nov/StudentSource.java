import java.util.Scanner;
class Student
{
	int rollno,marks;
	String name;

	Student()//default 
	{
		System.out.println("Default Constructor called");
		this.rollno=22;
		this.name="Kartik";
		this.marks=89;
	}

	Student(int rn,String nm,int m)//parameterized
	{
		System.out.println("Parameterized Constructor called");
		this.rollno=rn;
		this.name=nm;
		this.marks=m;
	}

	void setRollNo(int rn)
	{
		this.rollno=rn;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setMarks(int m)
	{
		this.marks=m;
	}
	

	int getRollNo()
	{
		return this.rollno;
	}
	String getName()
	{
		return this.name;
	}
	int getMarks()
	{
		return this.marks;
	}


	void display()
	{
		System.out.println("\nRoll No : "+this.rollno);
		System.out.println("Name : "+this.name);
		System.out.println("Marks : "+this.marks);
	}
}//Student class ends here
class TestStudent
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();

		System.out.println("Enter Marks : ");
		int marks=sc.nextInt();
		
		Student s1=new Student(id,name,marks);

		s1.display();
		
	}//main ends here
}//TestStudent class ends here