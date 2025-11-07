class Product
{
	int productId,quantity;
	String pname;
	double price;

	Product()//Default
	{
		System.out.println("Default constructor called");
		this.productId=34;
		this.quantity=4;
		this.pname="Mobile";
		this.price=54000;
	}

	Product(int i,int q,String n,double p)//Parameterized
	{
		System.out.println("Parameterized constructor called");
		this.productId=i;
		this.quantity=q;
		this.pname=n;
		this.price=p;
	}

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
		Product arr[]=new Product[3];
		arr[0]=new Product();
		arr[1]=new Product(1,304000,"Car",5);
		arr[2]=new Product();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			arr[i].display();
		}

		Product p1,p2,p3,p4;
		p1=new Product();
		p2=new Product();
		p3=new Product();
		p4=new Product(45,3,"TV",53000);

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
		p3.display();
		p4.display();
		
	}//main ends here
}//TestProduct class ends here