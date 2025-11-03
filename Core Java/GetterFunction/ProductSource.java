class Product
{
	int productId,quantity;
	String pname;
	double price;
	void setProductID(int i)
	{
		this.productId=i;
	}
	void setPName(String n)
	{
		this.pname=n;
	}
	void setPrice(double p)
	{
		this.price=p;
	}
	void setQuantity(int qty)
	{
		this.quantity=qty;
	}
	
	
	int getProductID()
	{
		return this.productId;
	}
	String getPName()
	{
		return this.pname;
	}
	double getPrice()
	{
		return this.price;
	}
	int getQuantity()
	{
		return this.quantity;
	}

	void display()
	{
		System.out.println("\nProduct Id is : "+this.productId);
		System.out.println("Name is : "+this.pname);
		System.out.println("Price is : "+this.price);
		System.out.println("Quantity is : "+this.quantity);
	}

}//Product class ends here
class TestProduct
{
	public static void main(String[]args)
	{
		Product p1,p2;
		p1=new Product();
		p2=new Product();

		p1.setProductID(101);
		p1.setPName("Laptop");
		p1.setPrice(56000);
		p1.setQuantity(2);

		p2.setProductID(102);
		p2.setPName("TV");
		p2.setPrice(50000);
		p2.setQuantity(3);

		//System.out.println("Product Id : "+p1.productId+"\nName : "+p1.pname+"\nPrice : "+p1.price+"\nQuantity : "+p1.quantity);
		//System.out.println("Product Id : "+p2.productId+"\nName : "+p2.pname+"\nPrice : "+p2.price+"\nQuantity : "+p2.quantity);

		if(p1.getPrice()>p2.getPrice())
		{
			System.out.println("p1 is high cost");
		}
		else
		{
			System.out.println("p2 is high cost");
		}
		

		p1.display();
		p2.display();
		
	}//main ends here
}//TestProduct class ends here