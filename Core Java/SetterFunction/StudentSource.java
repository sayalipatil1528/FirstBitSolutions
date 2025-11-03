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
}//Student class ends here
class TestStudent
{
	public static void main(String[]args)
	{
		Student s1;
		s1=new Student();
		s1.setRollNo(25);
		s1.setName("Prachi");
		s1.setMarks(78);
		System.out.println("Roll No : "+s1.rollno+"\nName : "+s1.name+"\nMarks : "+s1.marks);
	}//main ends here
}//TestStudent class ends here