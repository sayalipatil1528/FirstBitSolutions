package polymorphism;

class Farmer
{
	int farmerid;
	String farmername,city;
	double annualIncome,insuranceamt,landarea;
	int noofequipment;
	
	Farmer()
	{
		System.out.println("Farmer default constructor");
		farmerid = 101;
		farmername = "Ram Patil";
		landarea = 45.76;
		city = "Satara";
		annualIncome = 120000;
		insuranceamt = 2000;
		noofequipment = 8;
	}

	Farmer(int farmerid, String farmername, double landarea, String city, double annualIncome,
			double insuranceamt, int noofequipment)
	{
		System.out.println("Farmer parameterized constructor");
		this.farmerid = farmerid;
		this.farmername = farmername;
		this.landarea = landarea;
		this.city = city;
		this.annualIncome = annualIncome;
		this.insuranceamt = insuranceamt;
		this.noofequipment = noofequipment;
	}

	int getFarmerid() {
		return farmerid;
	}

	void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}

	String getFarmername() {
		return farmername;
	}

	void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	String getCity() {
		return city;
	}

	void setCity(String city) {
		this.city = city;
	}

	double getAnnualIncome() {
		return annualIncome;
	}

	void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	double getInsuranceamt() {
		return insuranceamt;
	}

	void setInsuranceamt(double insuranceamt) {
		this.insuranceamt = insuranceamt;
	}

	double getLandarea() {
		return landarea;
	}

	void setLandarea(double landarea) {
		this.landarea = landarea;
	}

	int getNoofequipment() {
		return noofequipment;
	}

	void setNoofequipment(int noofequipment) {
		this.noofequipment = noofequipment;
	}
	
	
	void calsubsidy()
	{
		System.out.println("subsidy received ");
	}
	
	void display()
	{
		System.out.println("\nFarmer Id is : "+this.farmerid);
		System.out.println("Farmer Name is : "+this.farmername);
		System.out.println("LandArea is : "+this.landarea);
		System.out.println("City is : "+this.city);
		System.out.println("Annual Income is : "+this.annualIncome);
		System.out.println("No of Equipment : "+this.noofequipment);
		System.out.println("Insurance Amount is : "+this.insuranceamt);
	}
}//Farmer class ends here

class DairyFarmer extends Farmer
{
	
	int noofcattles,milkproducedperday,dairylicenceno;

	DairyFarmer() 
	{
		super();
		System.out.println("DairyFarmer default constructor");
		this.noofcattles = 12;
		this.milkproducedperday = 200;
		this.dairylicenceno = 111;
	}

	DairyFarmer(int farmerid, String farmername, String city, double annualIncome, double insuranceamt,
			double landarea, int noofequipment, int noofcattles, int milkproducedperday, int dairylicenceno)
	{
		
		super(farmerid,farmername,landarea,city,annualIncome,insuranceamt,noofequipment);
		System.out.println("DairyFarmer parameterized constructor");
		this.noofcattles = noofcattles;
		this.milkproducedperday = milkproducedperday;
		this.dairylicenceno = dairylicenceno;
	}

	int getNoofcattles() {
		return noofcattles;
	}

	void setNoofcattles(int noofcattles) {
		this.noofcattles = noofcattles;
	}

	int getMilkproducedperday() {
		return milkproducedperday;
	}

	void setMilkproducedperday(int milkproducedperday) {
		this.milkproducedperday = milkproducedperday;
	}

	int getDairylicenceno() {
		return dairylicenceno;
	}

	void setDairylicenceno(int dairylicenceno) {
		this.dairylicenceno = dairylicenceno;
	}
	
	void calsubsidy()
	{
		System.out.println("subsidy received based on cattles ");
	}
	
	
	void display()
	{
		super.display();
		System.out.println("No of cattles : "+this.noofcattles);
		System.out.println("Milk Produced per day : "+this.milkproducedperday);
		System.out.println("Dairy Licence is : "+this.dairylicenceno);
	}
	
	
}//DairyFarmer class ends here

class PoultryFarmer extends Farmer
{
	
	int noofchickens,noofhens,noofshades,eggproducedperday,shadecapacity;
	String poultryname;
	
	PoultryFarmer() 
	{
		super();
		System.out.println("PoultryFarmer default constructor");
		this.noofchickens = 200;
		this.noofhens = 400;
		this.noofshades = 5;
		this.eggproducedperday = 350;
		this.shadecapacity = 100;
		this.poultryname = "abc";
	}

	PoultryFarmer(int farmerid, String farmername, String city, double annualIncome, double insuranceamt,
			double landarea, int noofequipment, int noofchickens, int noofhens, int noofshades, int eggproducedperday,
			int shadecapacity, String poultryname) 
	{
		super(farmerid,farmername,landarea,city,annualIncome,insuranceamt,noofequipment);
		System.out.println("PoultryFarmer parameterized constructor");
		this.noofchickens = noofchickens;
		this.noofhens = noofhens;
		this.noofshades = noofshades;
		this.eggproducedperday = eggproducedperday;
		this.shadecapacity = shadecapacity;
		this.poultryname = poultryname;
	}

	int getNoofchickens() {
		return noofchickens;
	}

	void setNoofchickens(int noofchickens) {
		this.noofchickens = noofchickens;
	}

	int getNoofhens() {
		return noofhens;
	}

	void setNoofhens(int noofhens) {
		this.noofhens = noofhens;
	}

	int getNoofshades() {
		return noofshades;
	}

	void setNoofshades(int noofshades) {
		this.noofshades = noofshades;
	}

	int getEggproducedperday() {
		return eggproducedperday;
	}

	void setEggproducedperday(int eggproducedperday) {
		this.eggproducedperday = eggproducedperday;
	}

	int getShadecapacity() {
		return shadecapacity;
	}

	void setShadecapacity(int shadecapacity) {
		this.shadecapacity = shadecapacity;
	}

	String getPoultryname() {
		return poultryname;
	}

	void setPoultryname(String poultryname) {
		this.poultryname = poultryname;
	}
	
	void calsubsidy()
	{
		System.out.println("subsidy received based on chicken ");
	}
	
	
	void display()
	{
		super.display();
		System.out.println("No of chickens : "+this.noofchickens);
		System.out.println("No of Hens : "+this.noofhens);
		System.out.println("No of shades : "+this.noofshades);
		System.out.println("Egg Produced per day : "+this.eggproducedperday);
		System.out.println("Shades capacity : "+this.shadecapacity);
		System.out.println("Poultry Name : "+this.poultryname);
		
	}
	
	
	
}//PoultryFarmer class ends here

class OrganicFarmer extends Farmer
{
	
	int organicertid;
	String croptype;
	int noofFertilized;
	
	
	OrganicFarmer() 
	{
		super();
		System.out.println("OrganicFarmer default constructor");
		organicertid = 111;
		croptype = "xyz";
		noofFertilized=107;
	}


	OrganicFarmer(int farmerid, String farmername, String city, double annualIncome, double insuranceamt,
			double landarea, int noofequipment, int organicertid, String croptype, int noofFertilized)
	{
		super(farmerid,farmername,landarea,city,annualIncome,insuranceamt,noofequipment);
		System.out.println("OrganicFarmer parameterized constructor");
		this.organicertid = organicertid;
		this.croptype = croptype;
		this.noofFertilized = noofFertilized;
	}


	int getOrganicertid() {
		return organicertid;
	}


	void setOrganicertid(int organicertid) {
		this.organicertid = organicertid;
	}


	String getCroptype() {
		return croptype;
	}


	void setCroptype(String croptype) {
		this.croptype = croptype;
	}


	int getNoofFertilized() {
		return noofFertilized;
	}


	void setNoofFertilized(int noofFertilized) {
		this.noofFertilized = noofFertilized;
	}
	
	
	void calsubsidy()
	{
		System.out.println("subsidy received based on land ");
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Organicer Id : "+this.organicertid);
		System.out.println("CropType : "+this.croptype);
		System.out.println("No of Fertilized : "+this.noofFertilized);
	}
	
	
}//Farmer class ends here

class TestFarmer
{
	public static void main(String[]args)
	{
		Farmer f1;//generic reference
		f1=new Farmer();
		f1.calsubsidy();
		f1.display();
		
		
		f1=new DairyFarmer(301, "Rohit Mane", "Sangli", 350000, 7000, 80.0, 12, 25, 450, 202);//upcasting
		f1.calsubsidy();
		f1.display();
		
		f1=new PoultryFarmer();//upcasting
		f1.calsubsidy();
		f1.display();
		
		f1=new OrganicFarmer(501, "Anita Jadhav", "Nashik", 200000, 4000, 35.7, 6, 909, "Sugarcane", 50);//upcasting
		f1.calsubsidy();
		f1.display();
	}
}

