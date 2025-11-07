import java.util.Scanner;
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
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ISBN : ");
		int isbn=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();

		System.out.println("Enter Category : ");
		String category=sc.nextLine();

		System.out.println("Enter Price : ");
		double price=sc.nextDouble();

		Book b1=new Book(isbn,name,category,price);

		b1.display();
		
	}//main ends here
}//TestBook class ends here
