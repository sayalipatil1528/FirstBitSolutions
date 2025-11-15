package abstracttoString;

abstract class Defence {
	String nameofhead;
	int nooftroops,noofvehicle,noofcasualtie,noofmissionperformed,noofdept;
	String countryname;
	String locationofHeadQuarter;
	double budget;
	int manpowercount;
	
	Defence()//default
	{
		System.out.println("Defence default constructor");
		nameofhead = "Ankit Sharma";
		nooftroops = 6;
		noofvehicle = 20;
		noofcasualtie =4;
		noofmissionperformed = 50;
		noofdept = 10;
		countryname = "India";
		locationofHeadQuarter = "Kashmir";
		budget =200000;
		manpowercount = 200;
	}

	Defence(String nameofhead, int nooftroops, int noofvehicle, int noofcasualtie, int noofmissionperformed,
			int noofdept, String countryname, String locationofHeadQuarter, double budget, int manpowercount) 
	{
		System.out.println("Defence parameterized constructor");
		this.nameofhead = nameofhead;
		this.nooftroops = nooftroops;
		this.noofvehicle = noofvehicle;
		this.noofcasualtie = noofcasualtie;
		this.noofmissionperformed = noofmissionperformed;
		this.noofdept = noofdept;
		this.countryname = countryname;
		this.locationofHeadQuarter = locationofHeadQuarter;
		this.budget = budget;
		this.manpowercount = manpowercount;
	}

	String getNameofhead() {
		return nameofhead;
	}

	void setNameofhead(String nameofhead) {
		this.nameofhead = nameofhead;
	}

	int getNooftroops() {
		return nooftroops;
	}

	void setNooftroops(int nooftroops) {
		this.nooftroops = nooftroops;
	}

	int getNoofvehicle() {
		return noofvehicle;
	}

	void setNoofvehicle(int noofvehicle) {
		this.noofvehicle = noofvehicle;
	}

	int getNoofcasualtie() {
		return noofcasualtie;
	}

	void setNoofcasualtie(int noofcasualtie) {
		this.noofcasualtie = noofcasualtie;
	}

	int getNoofmissionperformed() {
		return noofmissionperformed;
	}

	void setNoofmissionperformed(int noofmissionperformed) {
		this.noofmissionperformed = noofmissionperformed;
	}

	int getNoofdept() {
		return noofdept;
	}

	void setNoofdept(int noofdept) {
		this.noofdept = noofdept;
	}

	String getCountryname() {
		return countryname;
	}

	void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	String getLocationofHeadQuarter() {
		return locationofHeadQuarter;
	}

	void setLocationofHeadQuarter(String locationofHeadQuarter) {
		this.locationofHeadQuarter = locationofHeadQuarter;
	}

	double getBudget() {
		return budget;
	}

	void setBudget(double budget) {
		this.budget = budget;
	}

	int getManpowercount() {
		return manpowercount;
	}

	void setManpowercount(int manpowercount) {
		this.manpowercount = manpowercount;
	}
	
	
	abstract void attack();
	
	
	public String toString()
    {
    	return super.toString()+"\nName of Head is : "+this.nameofhead+"\nNo of Troops : "+this.nooftroops+"\nNo of vehicle : "+this.noofvehicle+"\nNo of Casualtie : "+this.noofcasualtie+"\nNo of mission performed : "+this.noofmissionperformed+"\nNo of Dept : "+this.noofdept+"\nCountry name is :"+this.countryname+"\nLocation of Head Quarter : "+this.locationofHeadQuarter+"\nBudget : "+this.budget+"\nManPower count : "+this.manpowercount;
    }
	
	
//	void display()
//	{
//		System.out.println("\nName of Head is : "+this.nameofhead);
//		System.out.println("No of Troops : "+this.nooftroops);
//		System.out.println("No of vehicle : "+this.noofvehicle);
//		System.out.println("No of Casualtie : "+this.noofcasualtie);
//		System.out.println("No of mission performed : "+this.noofmissionperformed);
//		System.out.println("No of Dept : "+this.noofdept);
//		System.out.println("Country name is : "+this.countryname);
//		System.out.println("Location of Head Quarter : "+this.locationofHeadQuarter);
//		System.out.println("Budget : "+this.budget);
//		System.out.println("ManPower count : "+this.manpowercount);
//	}
	

}//Defence class ends here

class Army extends Defence
{
	
	int nooftanks,noofguns,noofgranades,noofbatallion;

	Army() 
	{
		super();
		System.out.println("Army default constructor");
		nooftanks = 16;
		noofguns = 68;
		noofgranades = 7;
		noofbatallion = 7;
	}

	Army(String nameofhead, int nooftroops, int noofvehicle, int noofcasualtie, int noofmissionperformed,
			int noofdept, String countryname, String locationofHeadQuarter, double budget, int manpowercount,
			int nooftanks, int noofguns, int noofgranades, int noofbatallion) 
	{
		super(nameofhead,nooftroops,noofvehicle,noofcasualtie,noofmissionperformed,noofdept,countryname,locationofHeadQuarter,budget,manpowercount);
		System.out.println("Army Parameterized constructor");
		this.nooftanks = nooftanks;
		this.noofguns = noofguns;
		this.noofgranades = noofgranades;
		this.noofbatallion = noofbatallion;
	}

	int getNooftanks() {
		return nooftanks;
	}

	void setNooftanks(int nooftanks) {
		this.nooftanks = nooftanks;
	}

	int getNoofguns() {
		return noofguns;
	}

	void setNoofguns(int noofguns) {
		this.noofguns = noofguns;
	}

	int getNoofgranades() {
		return noofgranades;
	}

	void setNoofgranades(int noofgranades) {
		this.noofgranades = noofgranades;
	}

	int getNoofbatallion() {
		return noofbatallion;
	}

	void setNoofbatallion(int noofbatallion) {
		this.noofbatallion = noofbatallion;
	}
	
	void attack()
	{
		System.out.println("\nAttack on enemies with guns and granades");
	}
	
	
	public String toString()
	{
		return super.toString()+"\nNo of tanks : "+this.nooftanks+"\nNo of guns : "+this.noofguns+"\nNo of Granades : "+this.noofgranades+"\nNo of batallion : "+this.noofbatallion;
	}
//	void display()
//	{
//		super.display();
//		System.out.println("No of tanks : "+this.nooftanks);
//		System.out.println("No of guns : "+this.noofguns);
//		System.out.println("No of Granades : "+this.noofgranades);
//		System.out.println("No of batallion : "+this.noofbatallion);
//	}
	
}//Army class ends here

class Navy extends Defence
{
	
	int noofships,noofsubmariens,nooftorpedoes;

	Navy() 
	{
		super();
		System.out.println("Navy default constructor");
		this.noofships = noofships;
		this.noofsubmariens = noofsubmariens;
		this.nooftorpedoes = nooftorpedoes;
	}

	Navy(String nameofhead, int nooftroops, int noofvehicle, int noofcasualtie, int noofmissionperformed,
			int noofdept, String countryname, String locationofHeadQuarter, double budget, int manpowercount,
			int noofships, int noofsubmariens, int nooftorpedoes) 
	{
		super(nameofhead,nooftroops,noofvehicle,noofcasualtie,noofmissionperformed,noofdept,countryname,locationofHeadQuarter,budget,manpowercount);
		System.out.println("Navy parameterized constructor");
		this.noofships = noofships;
		this.noofsubmariens = noofsubmariens;
		this.nooftorpedoes = nooftorpedoes;
	}

	int getNoofships() {
		return noofships;
	}

	void setNoofships(int noofships) {
		this.noofships = noofships;
	}

	int getNoofsubmariens() {
		return noofsubmariens;
	}

	void setNoofsubmariens(int noofsubmariens) {
		this.noofsubmariens = noofsubmariens;
	}

	int getNooftorpedoes() {
		return nooftorpedoes;
	}

	void setNooftorpedoes(int nooftorpedoes) {
		this.nooftorpedoes = nooftorpedoes;
	}
	
	void attack()
	{
		System.out.println("\nAttack on enemies with torpedoes");
	}
	
	public String toString()
	{
		return super.toString()+"\nNo of ships : "+this.noofships+"\nNo of Submariens : "+this.noofsubmariens+"\nNo of torpedoes : "+this.nooftorpedoes;
	}
//	void display()
//	{
//		super.display();
//		System.out.println("No of Ships : "+this.noofships);
//		System.out.println("No of Submariens : "+this.noofsubmariens);
//		System.out.println("No of torpedoes : "+this.nooftorpedoes);
//	
//	}
	
}//Navy class ends here

class AirForce extends Defence
{
	int noofmissile,noofaircraft,noofsquadron;

	AirForce()
	{
		super();
		System.out.println("AirForce  default constructor");
		this.noofmissile = 150;
		this.noofaircraft = 67;
		this.noofsquadron = 29;
	}

	AirForce(String nameofhead, int nooftroops, int noofvehicle, int noofcasualtie, int noofmissionperformed,
			int noofdept, String countryname, String locationofHeadQuarter, double budget, int manpowercount,
			int noofmissile, int noofaircraft, int noofsquadron)
	{
		super(nameofhead,nooftroops,noofvehicle,noofcasualtie,noofmissionperformed,noofdept,countryname,locationofHeadQuarter,budget,manpowercount);

		System.out.println("AirForce parameterized constructor");
		this.noofmissile = noofmissile;
		this.noofaircraft = noofaircraft;
		this.noofsquadron = noofsquadron;
	}

	int getNoofmissile() {
		return noofmissile;
	}

	void setNoofmissile(int noofmissile) {
		this.noofmissile = noofmissile;
	}

	int getNoofaircraft() {
		return noofaircraft;
	}

	void setNoofaircraft(int noofaircraft) {
		this.noofaircraft = noofaircraft;
	}

	int getNoofsquadron() {
		return noofsquadron;
	}

	void setNoofsquadron(int noofsquadron) {
		this.noofsquadron = noofsquadron;
	}
	
	
	void attack()
	{
		System.out.println("\nAttack on enemies with missiles");
	}
	
	
	public String toString()
	{
		return super.toString()+"\nNo of missile : "+this.noofmissile+"\nNo of aircraft : "+this.noofaircraft+"\nNo of Squadron : "+this.noofsquadron;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of missile : "+this.noofmissile);
//		System.out.println("No of aircraft : "+this.noofaircraft);
//		System.out.println("No of Squadron : "+this.noofsquadron);
//	}
	
}//Navy class ends here

class TestDefence
{
	public static void main(String[]args)
	{
		Defence d1;//generic reference
//		d1=new Defence();
//		d1.display();
//		d1.attack();
//		
		d1=new Army();//upcasting
		//d1.display();
		System.out.println(d1);
		d1.attack();
		
		d1=new Navy();//upcasting
		//d1.display();
		System.out.println(d1);
		d1.attack();
		
		d1=new AirForce();//upcasting
		//d1.display();
		System.out.println(d1);
		d1.attack();
	}
}



