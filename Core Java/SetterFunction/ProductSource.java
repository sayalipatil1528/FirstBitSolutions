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
}//Product class ends here
class TestProduct
{
	public static void main(String[]args)
	{
		Product p1;
		p1=new Product();
		p1.setProductID(102);
		p1.setPName("Laptop");
		p1.setPrice(56000);
		p1.setQuantity(2);
		System.out.println("Product Id : "+p1.productId+"\nName : "+p1.pname+"\nPrice : "+p1.price+"\nQuantity : "+p1.quantity);
	}//main ends here
}//TestProduct class ends here