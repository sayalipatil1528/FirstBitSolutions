class Distance
{
	int km,m;
	void setKiloMeter(int k)
	{
		this.km=k;
	}
	void setMeter(int m)
	{
		this.m=m;
	}


	int getKiloMeter()
	{
		return this.km;
	}
	int getMeter()
	{
		return this.m;
	}

	
	void display()
	{
		System.out.println("\nKiloMeter : "+this.km);
		System.out.println("\nMeter : "+this.m);
	}
	
}//HR class ends here
class TestDistance
{
	public static void main(String[]args)
	{
		Distance d1,d2;
		d1=new Distance();
		d2=new Distance();

		d1.setKiloMeter(12);
		d1.setMeter(240);

		d2.setKiloMeter(10);
		d2.setMeter(120);

		//System.out.println("Kilometer : "+d1.km+"\nMeter : "+d1.m);

		if(d1.getKiloMeter()>d2.getKiloMeter())
		{
			System.out.println("S1 has more Distance");
		}
		else
		{
			System.out.println("S2 has more Distance");
		}
		
		d1.display();
		d2.display();

	}//main ends here
}//TestDistance ends here
		
	