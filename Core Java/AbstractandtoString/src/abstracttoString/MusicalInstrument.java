package abstracttoString;

abstract class MusicalInstrument
{
	String brand;
	double price;
	
	MusicalInstrument()
	{
		System.out.println("MusicalInstrument default constructor");
		this.brand = "Casio";
		this.price = 40000;
	}

	MusicalInstrument(String brand, double price) 
	{
		System.out.println("MusicalInstrument parameterized constructor");
		this.brand = brand;
		this.price = price;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	abstract void play();
	
	
	public String toString()
    {
    	return "\nBrand : "+this.brand+"\nPrice : "+this.price;
    }
//	void display()
//	{
//		System.out.println("\nBrand : "+this.brand);
//		System.out.println("Price : "+this.price);
//	}
	
}// MusicalInstrument class ends here

class Guitar extends MusicalInstrument
{
	
	int noofstrings;

	Guitar() 
	{
		super();
		System.out.println("Guitar default constructor");
		this.noofstrings = 6;
	}

	Guitar(String brand, double price, int noofstrings) 
	{
		super(brand,price);
		System.out.println("Guitar parameterized constructor");
		this.noofstrings = noofstrings;
	}

	int getNoofstrings() {
		return noofstrings;
	}

	void setNoofstrings(int noofstrings) {
		this.noofstrings = noofstrings;
	}
	
	void play()
	{
		System.out.println("Playing the guitar\n");
	}
	
	public String toString()
    {
    	return super.toString()+"\nNo of strings : "+this.noofstrings;
    }
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of strings : "+this.noofstrings);
//	}
//	
}//class Guitar ends here

class Piano extends MusicalInstrument
{
	
	int noofkeys;

	Piano()
	{
		super();
		System.out.println("Piano default constructor");
		this.noofkeys = 90;
	}

	Piano(String brand, double price, int noofkeys) 
	{
		super(brand,price);
		System.out.println("Piano parameterized constructor");
		this.noofkeys = noofkeys;
	}

	int getNoofkeys() {
		return noofkeys;
	}

	void setNoofkeys(int noofkeys) {
		this.noofkeys = noofkeys;
	}
	
	
	void play()
	{
		System.out.println("Playing the Piano\n");
	}
	
	public String toString()
    {
    	return super.toString()+"\nNo of keys : "+this.noofkeys;
    }
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of keys : "+this.noofkeys);
//	}
//	
	
}//Class Piano ends here

class Drum extends MusicalInstrument
{
	
	String drumtype;

	Drum() 
	{
		super();
		System.out.println("Drum default constructor");
		this.drumtype = "Electric";
	}

	Drum(String brand, double price, String drumtype) 
	{
		super(brand,price);
		System.out.println("Drum parameterized constructor");
		this.drumtype = drumtype;
	}

	String getDrumtype() {
		return drumtype;
	}

	void setDrumtype(String drumtype) {
		this.drumtype = drumtype;
	}
	
	
	void play()
	{
		System.out.println("Playing the Drum\n");
	}
	
	public String toString()
    {
    	return super.toString()+"\nDrum type : "+this.drumtype;
    }
	
//	void display()
//	{
//		super.display();
//		System.out.println("Drum type : "+this.drumtype);
//	}
}//class Drum ends here

class TestMusicalInstrument
{
	public static void main(String[]args)
	{
		MusicalInstrument m1;//generic reference
//		m1=new MusicalInstrument("Casio",40000);
//		m1.display();
//	    m1.play();
		
		m1=new Guitar("Yamaha", 15000, 6);//upcasting
       // m1.display();
		System.out.println(m1);
        m1.play();

        m1=new Piano("Casio", 45000, 88);//upcasting
        //m1.display();
        System.out.println(m1);
        m1.play();

        m1=new Drum("Roland", 30000, "Electric Drum");//upcasting
        //m1.display();
        System.out.println(m1);
        m1.play();
	}
}

