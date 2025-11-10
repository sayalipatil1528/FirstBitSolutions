class LibraryUser
{
    	String name;
  	int daysLate;
   	static double finePerDay = 2.0; 

	LibraryUser() //default constructor
	{
		this.name = "Amol";
		this.daysLate = 3;
	}
	
	LibraryUser(String n, int d) //Parameterized constructor
	{
		this.name = n;
		this.daysLate = d;
	}

	//Setters
	void setName(String n)
	{
		this.name = n;
	}
	void setDaysLate(int d)
	{
		this.daysLate = d;
	}
	
	
	static void changeFineRate(double newRate)
    	{
        		finePerDay = newRate;
    	}

	//Getters
	
	String getName()
	{
		return this.name;
	}
	double getDaysLate()
	{
		return this.daysLate;
	}
	
	static double getFinePerDay()
	{
		return finePerDay;
	}

	double calculateFine()
    	{
       		 return daysLate * finePerDay;
    	}


	//display
	void display()
	{
		System.out.println("\nName: " + name);
        		System.out.println("Days Late: " + daysLate);
        		System.out.println("Fine Per Day: " + finePerDay);
	}

}// class ends

class TestLibraryUser
{
	public static void main(String[]args)
	{
		LibraryUser l1 = new LibraryUser("Karan", 2);	
		l1.display();
		
		LibraryUser l2 = new LibraryUser("Sonal", 4);	
		l2.display();

		LibraryUser l3 = new LibraryUser( "Priti", 3);	
		l3.display();
		
		LibraryUser.changeFineRate(2.5);
		System.out.println("After Changing Rate...");
		System.out.println("Total Amount : " + l1.calculateFine());
		System.out.println("Total Amount : " + l2.calculateFine());
		System.out.println("Total Amount : " + l3.calculateFine());
	}

}
