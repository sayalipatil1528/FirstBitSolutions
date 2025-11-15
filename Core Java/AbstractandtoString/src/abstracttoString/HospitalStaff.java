package abstracttoString;

abstract class HospitalStaff {
	String name;
    int age;
    String department;
    int experience;
	
    HospitalStaff()
    {
    	System.out.println("HospitalStaff default constructor");
		this.name = "Rohit";
		this.age = 35;
		this.department = "General Ward";
		this.experience = 19;
	}

	HospitalStaff(String name, int age, String department, int experience) 
	{
		System.out.println("HospitalStaff parameterized constructor");
		this.name = name;
		this.age = age;
		this.department = department;
		this.experience = experience;
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

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	int getExperience() {
		return experience;
	}

	void setExperience(int experience) {
		this.experience = experience;
	}
    
    
    abstract void work();
    
    
    public String toString()
    {
    	return "\nName : "+this.name+"\nAge : "+this.age+"\nDepartment : "+this.department+"\nExperience : "+this.experience;
    }
    
    
//    void display()
//    {
//    	System.out.println("\nName : "+this.name);
//    	System.out.println("Age : "+this.age);
//    	System.out.println("Department : "+this.department);
//    	System.out.println("Experience : "+this.experience);
//    }
}//class HospitalStaff ends here

class Doctor1 extends HospitalStaff
{
    String specialization;
    int noOfPatients;
	
    Doctor1()
    {
		super();
		System.out.println("Doctor default constructor");
		this.specialization = "Heart Sergeon";
		this.noOfPatients = 20;
	}

	Doctor1(String name, int age, String department, int experience, String specialization, int noOfPatients) 
	{
		super(name,age,department,experience);
		System.out.println("Doctor parameterized constructor");
		this.specialization = specialization;
		this.noOfPatients = noOfPatients;
	}

	String getSpecialization() {
		return specialization;
	}

	void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	int getNoOfPatients() {
		return noOfPatients;
	}

	void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
    
    
	void work()
    {
    	System.out.println("Doctor is treating patients\n");
    }
    
	
	public String toString()
    {
    	return super.toString()+"\nSpecialization : "+this.specialization+"\nNo of patients : "+this.noOfPatients;
    }
    
//    void display()
//    {
//    	super.display();
//    	System.out.println("Specialization : "+this.specialization);
//    	System.out.println("No of patients : "+this.noOfPatients);
//    }
    
}//class Doctor1 ends here

class Nurse extends HospitalStaff
{
    String shift;
    int wardNumber;
	
    Nurse()
    {
		super();
		System.out.println("Nurse default constructor");
		this.shift = "night";
		this.wardNumber = 23;
	}

	Nurse(String name, int age, String department, int experience, String shift, int wardNumber) 
	{
		super(name,age,department,experience);
		System.out.println("Nurse parameterized constructor");
		this.shift = shift;
		this.wardNumber = wardNumber;
	}

	String getShift() {
		return shift;
	}

	void setShift(String shift) {
		this.shift = shift;
	}

	int getWardNumber() {
		return wardNumber;
	}

	void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
    
	void work()
    {
    	System.out.println("Nurse assisting doctors in ward\n");
    }
	
	
	public String toString()
    {
    	return super.toString()+"\nShift : "+this.shift+"\nWard Number : "+this.wardNumber;
    }
	
//	void display()
//	{
//		super.display();
//		System.out.println("Shift : "+this.shift);
//		System.out.println("Ward number : "+this.wardNumber);
//	}
	
	
}//class Nurse ends here

class Cleaner extends HospitalStaff
{
    String areaAssigned;

	Cleaner()
	{
		super();
		System.out.println("Cleaner default constructor");
		this.areaAssigned = "ICU";
	}

	Cleaner(String name, int age, String department, int experience, String areaAssigned) 
	{
		super(name,age,department,experience);
		System.out.println("Cleaner parameterized constructor");
		this.areaAssigned = areaAssigned;
	}

	String getAreaAssigned() {
		return areaAssigned;
	}

	void setAreaAssigned(String areaAssigned) {
		this.areaAssigned = areaAssigned;
	}
    
    
	void work()
    {
    	System.out.println("Cleaner cleaning the hospital\n");
    }
    
	
	public String toString()
    {
    	return super.toString()+"\nArea Assigned : "+this.areaAssigned;
    }
    
//    void display()
//    {
//    	super.display();
//    	System.out.println("Area assigned : "+this.areaAssigned);
//    }
    
    
}//class Cleaner ends here

class TestHospitalStaff
{
	public static void main(String[]args)
	{
		HospitalStaff h1;//generic reference
//		h1=new HospitalStaff("Amol",56,"Cardiology",10);
//		h1.display();
//		h1.work();
		
		h1=new Doctor1("Dr.Mehta",45,"Cardiology",19,"Heart Sergeon",39);//upcasting
		//h1.display();
		System.out.println(h1);
		h1.work();
		
		h1=new Nurse("Priya",29,"General Ward",12,"night",6);//upcasting
		//h1.display();
		System.out.println(h1);
		h1.work();
		
		h1=new Cleaner("Ramesh",49,"Maintainance",29,"ICU");//upcasting
		//h1.display();
		System.out.println(h1);
		h1.work();
	}
}

