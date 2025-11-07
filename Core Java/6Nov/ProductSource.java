import java.util.Scanner;
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
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product ID : ");
		int id=sc.nextInt();

		System.out.println("Enter Quantity : ");
		int qty=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		String name=sc.nextLine();

		System.out.println("Enter Price : ");
		double price=sc.nextDouble();

		Product p1=new Product(id,qty,name,price);

		p1.display();
		
		
	}//main ends here
}//TestProduct class ends here