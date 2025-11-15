package abstracttoString;

abstract class Artist {
	
	String name;
	int age;
	int noofyearsexperience;
	
	Artist() 
	{
		System.out.println("Artist default constructor");
		this.name = "Sonam";
		this.age = 45;
		this.noofyearsexperience = 18;
	}

	Artist(String name, int age, int noofyearsexperience) 
	{
		System.out.println("Artist Parameterized constructor");
		this.name = name;
		this.age = age;
		this.noofyearsexperience = noofyearsexperience;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getNoofyearsexperience() {
		return noofyearsexperience;
	}

	void setNoofyearsexperience(int noofyearsexperience) {
		this.noofyearsexperience = noofyearsexperience;
	}
	
	
	abstract void perform();
	
	
	public String toString() 
	{
		return "\nName : "+this.name+"\nAge : "+this.age+"\nNo of years experience : "+this.noofyearsexperience;
	}
	
//	void display()
//	{
//		System.out.println("\nName : "+this.name);
//		System.out.println("Age : "+this.age);
//		System.out.println("No of years experience : "+this.noofyearsexperience);
//	}
}//class Artist ends here

class Singer extends Artist
{
	String genre;
	int noofsongs;

	Singer() 
	{
		super();
		System.out.println("Singer default constructor");
		this.genre = "Classical";
		this.noofsongs = 17;
	}

	Singer(String name, int age, int noofyearsexperience, String genre, int noofsongs) 
	{
		super(name,age,noofyearsexperience);
		System.out.println("Singer Parameterized constructor");
		this.genre = genre;
		this.noofsongs = noofsongs;
	}

	String getGenre() {
		return genre;
	}

	void setGenre(String genre) {
		this.genre = genre;
	}

	int getNoofsongs() {
		return noofsongs;
	}

	void setNoofsongs(int noofsongs) {
		this.noofsongs = noofsongs;
	}
	
	
	void perform()
	{
		System.out.println("Singer is singing a song\n");
	}
	
	
	public String toString() 
	{
		return super.toString()+"\nGenre : "+this.genre+"\nNo of songs : "+this.noofsongs;
	}
	
	
//	void display()
//	{
//		super.display();
//		System.out.println("Genre is : "+this.genre);
//		System.out.println("No of songs : "+this.noofsongs);
//	}
	
}//class Singer ends here

class Dancer extends Artist
{
	String dancetype;
	int noofdanceperformed;

	Dancer() 
	{
		super();
		System.out.println("Dancer default constructor");
		this.dancetype = "Kathak";
		this.noofdanceperformed = 20;
	}

	Dancer(String name, int age, int noofyearsexperience, String dancetype, int noofdanceperformed) 
	{
		super(name,age,noofyearsexperience);
		System.out.println("Dancer Parameterized constructor");
		this.noofdanceperformed = noofdanceperformed;
	}

	String getDancetype() {
		return dancetype;
	}

	void setDancetype(String dancetype) {
		this.dancetype = dancetype;
	}

	int getNoofdanceperformed() {
		return noofdanceperformed;
	}

	void setNoofdanceperformed(int noofdanceperformed) {
		this.noofdanceperformed = noofdanceperformed;
	}
	
	
	void perform()
	{
		System.out.println("Dancer is performing a dance\n");
	}
	
	public String toString() 
	{
		return super.toString()+"\nDance type : "+this.dancetype+"\nNo of dance performed : "+this.noofdanceperformed;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("Dance type : "+this.dancetype);
//		System.out.println("No of dance performed : "+this.noofdanceperformed);
//	}
	
	
}//class Dancer ends here

class Painter extends Artist
{
	
	String paintingstyle;
	int noofpaintings;
	
	Painter()
	{
		super();
		System.out.println("Painter default constructor");
		this.paintingstyle = "Modern";
		this.noofpaintings = 18;
	}

	Painter(String name, int age, int noofyearsexperience, String paintingstyle, int noofpaintings) 
	{
		super(name,age,noofyearsexperience);
		System.out.println("Painter Parameterized constructor");
		this.paintingstyle = paintingstyle;
		this.noofpaintings = noofpaintings;
	}

	String getPaintingstyle() {
		return paintingstyle;
	}

	void setPaintingstyle(String paintingstyle) {
		this.paintingstyle = paintingstyle;
	}

	int getNoofpaintings() {
		return noofpaintings;
	}

	void setNoofpaintings(int noofpaintings) {
		this.noofpaintings = noofpaintings;
	}
	
	
	void perform()
	{
		System.out.println("Painter painting a picture\n");
	}
	
	
	public String toString() 
	{
		return super.toString()+"\nPainting style : "+this.paintingstyle+"\nNo of paintings : "+this.noofpaintings;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("Painting style : "+this.paintingstyle);
//		System.out.println("No of paintings : "+this.noofpaintings);
//	}
}//class Painter ends here

class TestArtist
{
	public static void main(String[]args) 
	{
		Artist a1;//generic reference
		//a1=new Artist("Amita",19,5);
		//a1.display();
		//a1.perform();
		
		a1=new Singer("Sonali",20,8,"Classical",10);//upcasting
		//a1.display();
		System.out.println(a1);
		a1.perform();
		
		a1=new Dancer("Chetan",34,10,"Hiphop",29);//upcasting
		//a1.display();
		System.out.println(a1);
		a1.perform();
		
		a1=new Painter("Atish",29,4,"Abstract",21);//upcasting
		//a1.display();
		System.out.println(a1);
		a1.perform();
		
	}
}

