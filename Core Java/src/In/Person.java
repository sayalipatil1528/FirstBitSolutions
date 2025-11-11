package In;

class Person {
	String name;
	int age;
	String address;
	
	Person()
	{
		name="abc";
		age=25;
		address="Pune";
	}

	public Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}
	
	
	void display()
	{
		System.out.println("\nName is : "+this.name);
		System.out.println("Age is : "+this.age);
		System.out.println("Address is : "+this.address);
	}
	

}//Person class ends here

class Student1 extends Person
{
	int rollno;
	String grade;
	
	
	Student1()
	{
		super();
		rollno=11;
		grade="A";
	}


	Student1(String name, int age, String address, int rollno, String grade)
	{
		super(name,age,address);
		this.rollno = rollno;
		this.grade = grade;
	}


	int getRollno() {
		return rollno;
	}


	void setRollno(int rollno) {
		this.rollno = rollno;
	}


	String getGrade() {
		return grade;
	}


	void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Roll no is : "+this.rollno);
		System.out.println("Grade is : "+this.grade);
	}
	
}//class Student1 ends here

class Teacher extends Person
{
	String subject;
	double salary;
	
	Teacher()
	{
		super();
		subject="English";
		salary=25000;
	}

	Teacher(String name, int age, String address, String subject, double salary) 
	{
		super(name,age,address);
		this.subject = subject;
		this.salary = salary;
	}

	String getSubject() {
		return subject;
	}

	void setSubject(String subject) {
		this.subject = subject;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		super.display();
		System.out.println("Subject is : "+this.subject);
		System.out.println("Salary is : "+this.salary);
	}
}//class Teacher ends here

class Doctor extends Person
{
	String hospitalname;
	String specialization;
	
	
	Doctor()
	{
		super();
		hospitalname="abc";
		specialization="xyz";
	}


	Doctor(String name, int age, String address, String hospitalname, String specialization) 
	{
		super(name,age,address);
		this.hospitalname = hospitalname;
		this.specialization = specialization;
	}
	
	void display()
	{
		super.display();
		System.out.println("Hospital name is : "+this.hospitalname);
		System.out.println("Specialization is : "+this.specialization);
	}
}//class Doctor ends here

class TestPerson
{
	public static void main(String[]args)
	{
		Person p1=new Person();
		p1.display();
		
		Student1 s1=new Student1("Anil",19,"Mumbai",1,"B");
		s1.display();
		
		Teacher t1=new Teacher();
		t1.display();
		
		Doctor d1=new Doctor();
		d1.display();
	}
}

