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
	
}//HR class ends here
class TestDistance
{
	public static void main(String[]args)
	{
		Distance d1;
		d1=new Distance();
		d1.setKiloMeter(12);
		d1.setMeter(240);
		System.out.println("Kilometer : "+d1.km+"\nMeter : "+d1.m);
	}//main ends here
}//TestDistance ends here
		
	