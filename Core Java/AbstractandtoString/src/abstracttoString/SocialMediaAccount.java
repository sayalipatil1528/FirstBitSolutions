package abstracttoString;

class SocialMediaAccount
{
	String username,email,countryOrigin,createdAt;
	boolean isPublic,isVerified;
	int noofposts,nooflikes,noofcomments,noofimpression;
	
	SocialMediaAccount() 
	{
		System.out.println("SocialMediaAccount default constructor");
		username="sp_12";
		email="sp12@gmail.com";
		countryOrigin="India";
		createdAt="2025-11-23";
		isPublic=true;
		isVerified=false;
		noofposts=21;
		nooflikes=50;
		noofcomments=25;
		noofimpression=120;
	}

	SocialMediaAccount(String username, String email, String countryOrigin, String createdAt, boolean isPublic,
			boolean isVerified, int noofposts, int nooflikes, int noofcomments, int noofimpression) 
	{
		System.out.println("SocialMediaAccount parameterized constructor");
		this.username = username;
		this.email = email;
		this.countryOrigin = countryOrigin;
		this.createdAt = createdAt;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.noofposts = noofposts;
		this.nooflikes = nooflikes;
		this.noofcomments = noofcomments;
		this.noofimpression = noofimpression;
	}

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getCountryOrigin() {
		return countryOrigin;
	}

	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	String getCreatedAt() {
		return createdAt;
	}

	void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	boolean isPublic() {
		return isPublic;
	}

	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	boolean isVerified() {
		return isVerified;
	}

	void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	int getNoofposts() {
		return noofposts;
	}

	void setNoofposts(int noofposts) {
		this.noofposts = noofposts;
	}

	int getNooflikes() {
		return nooflikes;
	}

	void setNooflikes(int nooflikes) {
		this.nooflikes = nooflikes;
	}

	int getNoofcomments() {
		return noofcomments;
	}

	void setNoofcomments(int noofcomments) {
		this.noofcomments = noofcomments;
	}

	int getNoofimpression() {
		return noofimpression;
	}

	void setNoofimpression(int noofimpression) {
		this.noofimpression = noofimpression;
	}
	
	
	public String toString()
	{
		return "\nUsername is : "+this.username+"\nEmail is : "+this.email+"\nCountry Origin : "+this.countryOrigin+"\nCreated at : "+this.createdAt+"\nIs Public : "+this.isPublic+"\nIs Verified : "+this.isVerified+"\nNo of posts : "+this.noofposts+"\nNo of likes : "+this.nooflikes+"\nNo of comments : "+this.noofcomments+"\nNo of impression : "+this.noofimpression;
	}
	
//	void display()
//	{
//		System.out.println("\nUsername is : "+this.username);
//		System.out.println("Email is : "+this.email);
//		System.out.println("Country Origin : "+this.countryOrigin);
//		System.out.println("Created at : "+this.createdAt);
//		System.out.println("Is Public : "+this.isPublic);
//		System.out.println("Is Verified : "+this.isVerified);
//		System.out.println("No of posts : "+this.noofposts);
//		System.out.println("No of likes : "+this.nooflikes);
//		System.out.println("No of comments : "+this.noofcomments);
//		System.out.println("No of impression : "+this.noofimpression);
//	}
	
}//class SocialMediaAccount ends here

class InstagramAccount extends SocialMediaAccount
{
	
	int nooffollower,nooffollowing,noofhighligt,noofpostachive,noofstoryachived,noofaudiosaved;

	InstagramAccount() 
	{
		super();
		System.out.println("InstagramAccount default constructor");
		nooffollower = 200;
		nooffollowing = 180;
		noofhighligt = 30;
		noofpostachive = 46;
		noofstoryachived = 50;
		noofaudiosaved = 16;
	}

	InstagramAccount(String username, String email, String countryOrigin, String createdAt, boolean isPublic,
			boolean isVerified, int noofposts, int nooflikes, int noofcomments, int noofimpression, int nooffollower,
			int nooffollowing, int noofhighligt, int noofpostachive, int noofstoryachived, int noofaudiosaved)
	{
		super(username,email,countryOrigin,createdAt,isPublic,isVerified,noofposts,nooflikes,noofcomments,noofimpression);
		System.out.println("InstagramAccount parameterized constructor");
		this.nooffollower = nooffollower;
		this.nooffollowing = nooffollowing;
		this.noofhighligt = noofhighligt;
		this.noofpostachive = noofpostachive;
		this.noofstoryachived = noofstoryachived;
		this.noofaudiosaved = noofaudiosaved;
	}

	int getNooffollower() {
		return nooffollower;
	}

	void setNooffollower(int nooffollower) {
		this.nooffollower = nooffollower;
	}

	int getNooffollowing() {
		return nooffollowing;
	}

	void setNooffollowing(int nooffollowing) {
		this.nooffollowing = nooffollowing;
	}

	int getNoofhighligt() {
		return noofhighligt;
	}

	void setNoofhighligt(int noofhighligt) {
		this.noofhighligt = noofhighligt;
	}

	int getNoofpostachive() {
		return noofpostachive;
	}

	void setNoofpostachive(int noofpostachive) {
		this.noofpostachive = noofpostachive;
	}

	int getNoofstoryachived() {
		return noofstoryachived;
	}

	void setNoofstoryachived(int noofstoryachived) {
		this.noofstoryachived = noofstoryachived;
	}

	int getNoofaudiosaved() {
		return noofaudiosaved;
	}

	void setNoofaudiosaved(int noofaudiosaved) {
		this.noofaudiosaved = noofaudiosaved;
	}
	
	public String toString()
	{
		return super.toString()+"\nNo of followers : "+this.nooffollower+"\nNo of following : "+this.nooffollowing+"\nNo of highlight : "+this.noofhighligt+"\nNo of post achived : "+this.noofpostachive+"\nNo of story achived : "+this.noofstoryachived+"\nNo of audio saved : "+this.noofaudiosaved;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of followers : "+this.nooffollower);
//		System.out.println("No of following : "+this.nooffollowing);
//		System.out.println("No of highlight : "+this.noofhighligt);
//		System.out.println("No of post achived : "+this.noofpostachive);
//		System.out.println("No of story achived : "+this.noofstoryachived);
//		System.out.println("No of audio saved : "+this.noofaudiosaved);
//	}
	
}//InstagramAccount class ends here

class LinkedInAccount extends SocialMediaAccount
{
	int noofconnection,noofprofileview,noofjobsapplied;

	LinkedInAccount()
	{
		super();
		System.out.println("LinkedInAccount default constructor");
		noofconnection = 200;
		noofprofileview = 70;
		noofjobsapplied = 20;
	}

	LinkedInAccount(String username, String email, String countryOrigin, String createdAt, boolean isPublic,
			boolean isVerified, int noofposts, int nooflikes, int noofcomments, int noofimpression, int noofconnection,
			int noofprofileview, int noofjobsapplied)
	{
		super(username,email,countryOrigin,createdAt,isPublic,isVerified,noofposts,nooflikes,noofcomments,noofimpression);
		System.out.println("LinkedInAccount parameterized constructor");
		this.noofconnection = noofconnection;
		this.noofprofileview = noofprofileview;
		this.noofjobsapplied = noofjobsapplied;
	}

	int getNoofconnection() {
		return noofconnection;
	}

	void setNoofconnection(int noofconnection) {
		this.noofconnection = noofconnection;
	}

	int getNoofprofileview() {
		return noofprofileview;
	}

	void setNoofprofileview(int noofprofileview) {
		this.noofprofileview = noofprofileview;
	}

	int getNoofjobsapplied() {
		return noofjobsapplied;
	}

	void setNoofjobsapplied(int noofjobsapplied) {
		this.noofjobsapplied = noofjobsapplied;
	}
	
	
	public String toString()
	{
		return super.toString()+"\nNo of Connection : "+this.noofconnection+"\nNo of Profile view : "+this.noofprofileview+"\nNo of jobs applied : "+this.noofjobsapplied;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of Connection : "+this.noofconnection);
//		System.out.println("No of Profile view : "+this.noofprofileview);
//		System.out.println("No of jobs applied : "+this.noofjobsapplied);
//	}
	
	
}//LinkedInAccount class ends here

class YoutubeAccount extends SocialMediaAccount
{
	int noOfSubscribers;
    double watchTime;
    boolean isMonetized;
    double estimatedRevenue;
    
	YoutubeAccount() 
	{
		super();
		System.out.println("YoutubeAccount default constructor");
		this.noOfSubscribers = 300;
		this.watchTime =129;
		this.isMonetized = false;
		this.estimatedRevenue = 2000;
	}

	YoutubeAccount(String username, String email, String countryOrigin, String createdAt, boolean isPublic,
			boolean isVerified, int noofposts, int nooflikes, int noofcomments, int noofimpression, int noOfSubscribers,
			double watchTime, boolean isMonetized, double estimatedRevenue) 
	{
		super(username,email,countryOrigin,createdAt,isPublic,isVerified,noofposts,nooflikes,noofcomments,noofimpression);
		System.out.println("YoutubeAccount parameterized constructor");
		this.noOfSubscribers = noOfSubscribers;
		this.watchTime = watchTime;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}

	int getNoOfSubscribers() {
		return noOfSubscribers;
	}

	void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	double getWatchTime() {
		return watchTime;
	}

	void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}

	boolean isMonetized() {
		return isMonetized;
	}

	void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}

	double getEstimatedRevenue() {
		return estimatedRevenue;
	}

	void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}
    
	
	public String toString()
	{
		return super.toString()+"\nNo of subscriber : "+this.noOfSubscribers+"\nWatch Time : "+this.watchTime+"\nIs Monetized : "+this.isMonetized+"\nEstimated Revenue : "+this.estimatedRevenue;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of subscriber : "+this.noOfSubscribers);
//		System.out.println("Watch Time : "+this.watchTime);
//		System.out.println("Is Monetized : "+this.isMonetized);
//		System.out.println("Estimated Revenue : "+this.estimatedRevenue);
//	}
    
}//YoutubeAccount class ends here

class TestSocialMediaAccount
{
	public static void main(String[]args)
	{
		SocialMediaAccount s1;//generic reference
		s1=new SocialMediaAccount();
		System.out.println(s1);
		//s1.display();
		
		s1=new InstagramAccount();//upcasting
		System.out.println(s1);
		//s1.display();
		
		s1=new LinkedInAccount("pro_sayali", "sayali@linkedin.com", "India", "2021-02-15", true, true, 50, 600, 90, 1200,1000, 500, 50);//upcasting
		System.out.println(s1);
		//s1.display();
		
		s1=new YoutubeAccount("Sonal", "Sonal@yt.com", "UK", "2022-01-01",true, false, 300, 9000, 450, 150000,15000, 900.5, true, 25000.75);//upcasting
		System.out.println(s1);
		//s1.display();
	}
}

