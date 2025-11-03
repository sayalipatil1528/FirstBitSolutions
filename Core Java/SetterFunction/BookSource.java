class Book
{
	int isbn;
	String bname,category;
	double price;
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
}//Book class ends here
class TestBook
{
	public static void main(String[]args)
	{
		Book b1;
		b1=new Book();
		b1.setISBN(23);
		b1.setBName("Shyamchi Aai");
		b1.setCategory("Story");
		b1.setPrice(350);
		System.out.println("ISBN : "+b1.isbn+"\nName : "+b1.bname+"\nCategory : "+b1.category+"\nPrice : "+b1.price);
	}//main ends here
}//TestBook class ends here
