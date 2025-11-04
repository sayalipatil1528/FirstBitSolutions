class Book
{
	int isbn;
	String bname,category;
	double price;

	Book()//Default
	{
		System.out.println("Default constructor called");
		this.isbn=34;
		this.bname="Harry Potter";
		this.category="Story";
		this.price=350;
	}

	Book(int i,String n,String c,double p)//Parameterized
	{
		System.out.println("Parameterized constructor called");
		this.isbn=i;
		this.bname=n;
		this.category=c;
		this.price=p;
	}

	void setISBN(int i)
	{
		this.isbn=i;
	}
	void setBName(String nm)
	{
		this.bname=nm;
	}
	void setCategory(String c)
	{
		this.category=c;
	}
	void setPrice(double p)
	{
		this.price=p;
	}


	
	int getISBN()
	{
		return this.isbn;
	}
	String getBName()
	{
		return  this.bname;
	}
	String getCategory()
	{
		return this.category;
	}
	double getPrice()
	{
		return this.price;
	}

	void display()
	{
		System.out.println("\nISBN : "+this.isbn);
		System.out.println("Name : "+this.bname);
		System.out.println("Category : "+this.category);
		System.out.println("Price : "+this.price);
	}

}//Book class ends here
class TestBook
{
	public static void main(String[]args)
	{
		Book b1,b2,b3,b4;
		b1=new Book();
		b2=new Book();
		b3=new Book();
		b4=new Book(2,"The Jungle Book","Story",450);

		b1.setISBN(23);
		b1.setBName("Shyamchi Aai");
		b1.setCategory("Story");
		b1.setPrice(350);

		b2.setISBN(24);
		b2.setBName("You can heal your lif");
		b2.setCategory("Motivational");
		b2.setPrice(400);

		//System.out.println("ISBN : "+b1.isbn+"\nName : "+b1.bname+"\nCategory : "+b1.category+"\nPrice : "+b1.price);

		if(b1.getPrice()>b2.getPrice())
		{
			System.out.println("b1 has high price");
		}
		else
		{
			System.out.println("b2 has high price");
		}

		b1.display();
		b2.display();
		b3.display();
		b4.display();

	}//main ends here
}//TestBook class ends here
