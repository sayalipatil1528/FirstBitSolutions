class Student
{
	int rollno,marks;
	String name;
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
		Student s1,s2;
		s1=new Student();
		s2=new Student();

		s1.setRollNo(25);
		s1.setName("Prachi");
		s1.setMarks(78);

		s2.setRollNo(26);
		s2.setName("Karan");
		s2.setMarks(87);

		//System.out.println("Roll No : "+s1.rollno+"\nName : "+s1.name+"\nMarks : "+s1.marks);

		if(s1.getMarks()>s2.getMarks())
		{
			System.out.println("s1 has high marks");
		}
		else
		{
			System.out.println("s2 has high marks");
		}

		s1.display();
		s2.display();
	}//main ends here
}//TestStudent class ends here