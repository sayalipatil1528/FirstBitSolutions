class TestString
{
	public static void main(String[]args)
	{
		String cName1="firstbit";
		String cName2="firstbit";
		String cName3="Infosys";
		String str=new String("firstbit");

		cName2="TCS";
		

		//cName1.equals(str);

		if(cName1==cName2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}

		if(cName1==str)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}