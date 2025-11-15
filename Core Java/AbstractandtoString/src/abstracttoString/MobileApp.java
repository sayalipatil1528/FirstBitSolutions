package abstracttoString;

abstract class MobileApp 
{
	String appname;
	String developer;
	double sizeMB;
	int noofdownloads;
	double rating;
	int releaseYear;
	String platform;

	MobileApp() 
	{
		System.out.println("MobileApp default constructor");
		appname="Whatsapp";
		developer="xyz";
		sizeMB=120;
		noofdownloads = 10;
		rating=8;
		releaseYear=2001;
		platform="Android";
	}

	MobileApp(String appname, String developer, double sizeMB, int noofdownloads, double rating, int releaseYear,
			String platform)
	{
		System.out.println("MobileApp parameterized constructor");
		this.appname = appname;
		this.developer = developer;
		this.sizeMB = sizeMB;
		this.noofdownloads = noofdownloads;
		this.rating = rating;
		this.releaseYear = releaseYear;
		this.platform = platform;
	}

	String getAppname() {
		return appname;
	}

	void setAppname(String appname) {
		this.appname = appname;
	}

	String getDeveloper() {
		return developer;
	}

	void setDeveloper(String developer) {
		this.developer = developer;
	}

	double getSizeMB() {
		return sizeMB;
	}

	void setSizeMB(double sizeMB) {
		this.sizeMB = sizeMB;
	}

	int getNoofdownloads() {
		return noofdownloads;
	}

	void setNoofdownloads(int noofdownloads) {
		this.noofdownloads = noofdownloads;
	}

	double getRating() {
		return rating;
	}

	void setRating(double rating) {
		this.rating = rating;
	}

	int getReleaseYear() {
		return releaseYear;
	}

	void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	String getPlatform() {
		return platform;
	}

	void setPlatform(String platform) {
		this.platform = platform;
	}
	
	abstract void Info();
	
	public String toString()
	{
		return "\nApp name : "+this.appname+"\nDeveloper : "+this.developer+"\nSize : "+this.sizeMB+"\nDownloads : "+this.noofdownloads+"\nRating : "+this.rating+"\nRelease Year : "+this.releaseYear+"\nPlatform : "+this.platform;
	}
	
//	void display()
//	{
//		System.out.println("\nApp name : "+this.appname);
//		System.out.println("Developer : "+this.developer);
//		System.out.println("Size : "+this.sizeMB);
//		System.out.println("Downloads : "+this.noofdownloads);
//		System.out.println("Rating : "+this.rating);
//		System.out.println("Release Year : "+this.releaseYear);
//		System.out.println("Platform : "+this.platform);
//	}

}// class MobileApp ends here

class MessagingApp extends MobileApp
{
	
	boolean isencryptionEnabled;
    int noofactiveUsers;
    boolean issupportsVideoCall;
    int messageLimit;
    boolean isthemeSupported;
    
	MessagingApp() 
	{
		super();
		System.out.println("MessagingApp default constructor");
		isencryptionEnabled=true;
		noofactiveUsers=1000;
		issupportsVideoCall=false;
		messageLimit=100;
		isthemeSupported=true;
	}

	MessagingApp(String appname, String developer, double sizeMB, int noofdownloads, double rating,
			int releaseYear, String platform, boolean isencryptionEnabled, int noofactiveUsers,
			boolean issupportsVideoCall, int messageLimit, boolean isthemeSupported) 
	{
		super(appname,developer,sizeMB,noofdownloads,rating,releaseYear,platform);
		System.out.println("MessagingApp parameterized constructor");
		this.isencryptionEnabled = isencryptionEnabled;
		this.noofactiveUsers = noofactiveUsers;
		this.issupportsVideoCall = issupportsVideoCall;
		this.messageLimit = messageLimit;
		this.isthemeSupported = isthemeSupported;
	}
	
	
	
    
	boolean isIsencryptionEnabled() {
		return isencryptionEnabled;
	}

	void setIsencryptionEnabled(boolean isencryptionEnabled) {
		this.isencryptionEnabled = isencryptionEnabled;
	}

	int getNoofactiveUsers() {
		return noofactiveUsers;
	}

	void setNoofactiveUsers(int noofactiveUsers) {
		this.noofactiveUsers = noofactiveUsers;
	}

	boolean isIssupportsVideoCall() {
		return issupportsVideoCall;
	}

	void setIssupportsVideoCall(boolean issupportsVideoCall) {
		this.issupportsVideoCall = issupportsVideoCall;
	}

	int getMessageLimit() {
		return messageLimit;
	}

	void setMessageLimit(int messageLimit) {
		this.messageLimit = messageLimit;
	}

	boolean isIsthemeSupported() {
		return isthemeSupported;
	}

	void setIsthemeSupported(boolean isthemeSupported) {
		this.isthemeSupported = isthemeSupported;
	}
	
	
	
	void Info()
	{
		System.out.println("Information about Message\n");
	}
	
	
	public String toString()
	{
		return super.toString()+"\nIs Encryption Enabled : "+this.isencryptionEnabled+"\nNo of active users : "+this.noofactiveUsers+"\nIs supports video call : "+this.issupportsVideoCall+"\nMessage Limit : "+this.messageLimit+"\nIs Theme supported : "+this.isthemeSupported;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("Is Encryption Enabled : "+this.isencryptionEnabled);
//		System.out.println("No of active users : "+this.noofactiveUsers);
//		System.out.println("Is supports video call : "+this.issupportsVideoCall);
//		System.out.println("Message Limit : "+this.messageLimit);
//		System.out.println("Is Theme supported : "+this.isthemeSupported);
//	}
	 
}//class MessagingApp ends here

class ShoppingApp extends MobileApp
{
	
	int noofproductCategories;
    int sellersCount;
    int noofdailyOrders;
    double rewardPoints;
    boolean iscashbackAvailable;
    
	ShoppingApp() 
	{
		super();
		System.out.println("ShoppingApp default constructor");
		noofproductCategories=12;
		sellersCount=30;
		noofdailyOrders=100;
		rewardPoints=8.7;
		iscashbackAvailable=false;
	}

	ShoppingApp(String appname, String developer, double sizeMB, int noofdownloads, double rating,
			int releaseYear, String platform, int noofproductCategories, int sellersCount, int noofdailyOrders,
			double rewardPoints, boolean iscashbackAvailable) 
	{
		super(appname,developer,sizeMB,noofdownloads,rating,releaseYear,platform);
		System.out.println("ShoppingApp parameterized constructor");
		this.noofproductCategories = noofproductCategories;
		this.sellersCount = sellersCount;
		this.noofdailyOrders = noofdailyOrders;
		this.rewardPoints = rewardPoints;
		this.iscashbackAvailable = iscashbackAvailable;
	}

	int getNoofproductCategories() {
		return noofproductCategories;
	}

	void setNoofproductCategories(int noofproductCategories) {
		this.noofproductCategories = noofproductCategories;
	}

	int getSellersCount() {
		return sellersCount;
	}

	void setSellersCount(int sellersCount) {
		this.sellersCount = sellersCount;
	}

	int getNoofdailyOrders() {
		return noofdailyOrders;
	}

	void setNoofdailyOrders(int noofdailyOrders) {
		this.noofdailyOrders = noofdailyOrders;
	}

	double getRewardPoints() {
		return rewardPoints;
	}

	void setRewardPoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	boolean isIscashbackAvailable() {
		return iscashbackAvailable;
	}

	void setIscashbackAvailable(boolean iscashbackAvailable) {
		this.iscashbackAvailable = iscashbackAvailable;
	}
    
	void Info()
	{
		System.out.println("Information about shopping");
	}
	
	
	public String toString()
	{
		return super.toString()+"\nNo of Product Categories : "+this.noofproductCategories+"\nSellers count : "+this.sellersCount+"\nNo of daily orders : "+this.noofdailyOrders+"\nReward Points : "+this.rewardPoints+"\nIs cashback available : "+this.iscashbackAvailable;
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("No of Product Categories : "+this.noofproductCategories);
//		System.out.println("Sellers count : "+this.sellersCount);
//		System.out.println("No of daily orders : "+this.noofdailyOrders);
//		System.out.println("Reward Points : "+this.rewardPoints);
//		System.out.println("Is cashback available : "+this.iscashbackAvailable);
//	}
//	
}//ShoppingApp class ends here

class FitnessApp extends MobileApp
{
	int noofworkoutPlans;
    double dailycaloriesTracked;
    double subscriptionCost;
    boolean istrainerAccessavailable;
    String userGoals;
    
	FitnessApp()
	{
		super();
		System.out.println("FitnessApp default constructor");
		noofworkoutPlans=12;
		dailycaloriesTracked=180;
		subscriptionCost=10000;
		istrainerAccessavailable=true;
		userGoals="Weight loss";
	}

	FitnessApp(String appname, String developer, double sizeMB, int noofdownloads, double rating,
			int releaseYear, String platform, int noofworkoutPlans, double dailycaloriesTracked,
			double subscriptionCost, boolean istrainerAccessavailable, String userGoals)
	{
		super(appname,developer,sizeMB,noofdownloads,rating,releaseYear,platform);
		System.out.println("FitnessApp parameterized constructor");
		this.noofworkoutPlans = noofworkoutPlans;
		this.dailycaloriesTracked = dailycaloriesTracked;
		this.subscriptionCost = subscriptionCost;
		this.istrainerAccessavailable = istrainerAccessavailable;
		this.userGoals = userGoals;
	}

	int getNoofworkoutPlans() {
		return noofworkoutPlans;
	}

	void setNoofworkoutPlans(int noofworkoutPlans) {
		this.noofworkoutPlans = noofworkoutPlans;
	}

	double getDailycaloriesTracked() {
		return dailycaloriesTracked;
	}

	void setDailycaloriesTracked(double dailycaloriesTracked) {
		this.dailycaloriesTracked = dailycaloriesTracked;
	}

	double getSubscriptionCost() {
		return subscriptionCost;
	}

	void setSubscriptionCost(double subscriptionCost) {
		this.subscriptionCost = subscriptionCost;
	}

	boolean isIstrainerAccessavailable() {
		return istrainerAccessavailable;
	}

	void setIstrainerAccessavailable(boolean istrainerAccessavailable) {
		this.istrainerAccessavailable = istrainerAccessavailable;
	}

	String getUserGoals() {
		return userGoals;
	}

	void setUserGoals(String userGoals) {
		this.userGoals = userGoals;
	}
    
	void Info()
	{
		System.out.println("Information about fitness");
	}
	
	public String toString()
	{
		return super.toString()+"\nNo of workout plan : "+this.noofworkoutPlans+"\nDaily calories tracked : "+this.dailycaloriesTracked+"\nSubcription cost : "+this.subscriptionCost+"\nIs trainer access available : "+this.istrainerAccessavailable;
	}
//    void display()
//    {
//    	super.display();
//    	System.out.println("No of workout plan : "+this.noofworkoutPlans);
//    	System.out.println("Daily calories tracked : "+this.dailycaloriesTracked);
//    	System.out.println("Subcription cost : "+this.subscriptionCost);
//    	System.out.println("Is trainer access available : "+this.istrainerAccessavailable);
//    }
    
}//FitnessApp class ends here

class TestMobileApp
{
	public static void main(String[]args)
	{
		MobileApp m1;//generic reference
//		m1=new MobileApp();
//		m1.display();
//		m1.Info();
		
		m1=new MessagingApp("Telegram", "Pavel Durov", 180.0, 8000000, 4.5, 2013, "iOS",true, 1200000, true, 1000, true);//upcasting
		//m1.display();
		System.out.println(m1);
		m1.Info();
		
		m1=new ShoppingApp();//upcasting
		//m1.display();
		System.out.println(m1);
		m1.Info();
		
		m1=new FitnessApp("FitTrack", "FitCorp", 95.2, 700000, 4.4, 2018, "Android",30, 250.0, 4999.0, true, "Muscle Gain");//upcasting
		//m1.display();
		System.out.println(m1);
		m1.Info();
	}
	
}//TestMobileApp class ends here
