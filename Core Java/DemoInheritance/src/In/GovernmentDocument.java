package In;

class GovernmentDocument
{
	int documentId;
    String holderName;
    String issueDate;
    String expiryDate;
    String issuingAuthority;
    String placeOfIssue;
    boolean isActive;

    GovernmentDocument() 
	{
		System.out.println("GovernmentDocument default constructor");
		documentId=111;
		holderName="Anuksh";
		issueDate="2025-7-11";
		expiryDate="2030-8-23";
		issuingAuthority="xyz";
		placeOfIssue="Pune";
		isActive=true;
	}

	GovernmentDocument(int documentId, String holderName, String issueDate, String expiryDate,
			String issuingAuthority, String placeOfIssue, boolean isActive) 
	{
		System.out.println("GovernmentDocument parameterized constructor");
		this.documentId = documentId;
		this.holderName = holderName;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.issuingAuthority = issuingAuthority;
		this.placeOfIssue = placeOfIssue;
		this.isActive = isActive;
	}

	int getDocumentId() {
		return documentId;
	}

	void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	String getIssueDate() {
		return issueDate;
	}

	void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	String getExpiryDate() {
		return expiryDate;
	}

	void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	String getIssuingAuthority() {
		return issuingAuthority;
	}

	void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	String getPlaceOfIssue() {
		return placeOfIssue;
	}

	void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	boolean isActive() {
		return isActive;
	}

	void setActive(boolean isActive) {
		this.isActive = isActive;
	}
    
	void display()
	{
		System.out.println("\nDocument Id : "+this.documentId);
		System.out.println("Holder Name : "+this.holderName);
		System.out.println("Issue Date : "+this.issueDate);
		System.out.println("Expiry Date : "+this.expiryDate);
		System.out.println("Issuing Authority : "+this.issuingAuthority);
		System.out.println("Place of Issue : "+this.placeOfIssue);
		System.out.println("Is active : "+this.isActive);
	}
	
}//class GovernmentDocument ends here

class Passport extends GovernmentDocument
{
    
    String countryOfIssue;
    String passportType;
    int novisaPages;
    String nationality;
    boolean hasVisaStamp;
    
	Passport() 
	{
		super();
		System.out.println("Passport default constructor");
		countryOfIssue="India";
		passportType="Ordinary";
		novisaPages=45;
		nationality="Indian";
		hasVisaStamp=true;
	}

	Passport(int documentId, String holderName, String issueDate, String expiryDate, String issuingAuthority,
			String placeOfIssue, boolean isActive, String countryOfIssue, String passportType, int novisaPages,
			String nationality, boolean hasVisaStamp) {
	    super(documentId,holderName,issueDate,expiryDate,issuingAuthority,placeOfIssue,isActive);
	    System.out.println("Passport parameterized constructor");
		this.countryOfIssue = countryOfIssue;
		this.passportType = passportType;
		this.novisaPages = novisaPages;
		this.nationality = nationality;
		this.hasVisaStamp = hasVisaStamp;
	}

	String getCountryOfIssue() {
		return countryOfIssue;
	}

	void setCountryOfIssue(String countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	String getPassportType() {
		return passportType;
	}

	void setPassportType(String passportType) {
		this.passportType = passportType;
	}

	int getNovisaPages() {
		return novisaPages;
	}

	void setNovisaPages(int novisaPages) {
		this.novisaPages = novisaPages;
	}

	String getNationality() {
		return nationality;
	}

	void setNationality(String nationality) {
		this.nationality = nationality;
	}

	boolean isHasVisaStamp() {
		return hasVisaStamp;
	}

	void setHasVisaStamp(boolean hasVisaStamp) {
		this.hasVisaStamp = hasVisaStamp;
	}
    
	void display()
	{
		super.display();
		System.out.println("Country of Issue : "+this.countryOfIssue);
		System.out.println("Passport type : "+this.passportType);
		System.out.println("No of Visa pages : "+this.novisaPages);
		System.out.println("Nationality : "+this.nationality);
		System.out.println("Has Visa Stamp : "+this.hasVisaStamp);
	}
    
}//Passport class ends here

class DrivingLicense extends GovernmentDocument
{
    
    String vehicleType;
    String licenseNumber;
    String bloodGroup;
    int noofvalidityYears;
    boolean istestPassed;
    
	DrivingLicense() 
	{
		super();
		System.out.println("DrivingLicense default constructor");
		vehicleType="Four wheeler";
		licenseNumber="MH12 202030";
		bloodGroup="A+";
		noofvalidityYears=10;
		istestPassed=true;
	}

	DrivingLicense(int documentId, String holderName, String issueDate, String expiryDate,
			String issuingAuthority, String placeOfIssue, boolean isActive, String vehicleType, String licenseNumber,
			String bloodGroup, int noofvalidityYears, boolean istestPassed) 
	{
		super(documentId,holderName,issueDate,expiryDate,issuingAuthority,placeOfIssue,isActive);
	    System.out.println("DrivingLicense parameterized constructor");
		this.vehicleType = vehicleType;
		this.licenseNumber = licenseNumber;
		this.bloodGroup = bloodGroup;
		this.noofvalidityYears = noofvalidityYears;
		this.istestPassed = istestPassed;
	}

	String getVehicleType() {
		return vehicleType;
	}

	void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	String getLicenseNumber() {
		return licenseNumber;
	}

	void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	String getBloodGroup() {
		return bloodGroup;
	}

	void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	int getNoofvalidityYears() {
		return noofvalidityYears;
	}

	void setNoofvalidityYears(int noofvalidityYears) {
		this.noofvalidityYears = noofvalidityYears;
	}

	boolean isIstestPassed() {
		return istestPassed;
	}

	void setIstestPassed(boolean istestPassed) {
		this.istestPassed = istestPassed;
	}
    
	
    void display()
    {
    	super.display();
    	System.out.println("Vehicle Type : "+this.vehicleType);
    	System.out.println("License Number : "+this.licenseNumber);
    	System.out.println("Blood Group : "+this.bloodGroup);
    	System.out.println("No of validity years : "+this.noofvalidityYears);
    	System.out.println("Is test passed : "+this.istestPassed);
    }
    
}//DrivingLicense class ends here

class VoterID extends GovernmentDocument
{
    
    String constituency;
    String voterNumber;
    String pollingBooth;
    int electionYear;
    boolean isEligible;
    
	VoterID() 
	{
		super();
		System.out.println("VoterId default constructor");
		constituency="Nagpur Central";
		voterNumber="MH12 39493";
		pollingBooth="Booth No. 15, City High School";
		electionYear=2023;
		isEligible=true;
	}

	VoterID(int documentId, String holderName, String issueDate, String expiryDate, String issuingAuthority,
			String placeOfIssue, boolean isActive, String constituency, String voterNumber, String pollingBooth,
			int electionYear, boolean isEligible) 
	{
	    super(documentId,holderName,issueDate,expiryDate,issuingAuthority,placeOfIssue,isActive);
		System.out.println("VoterId parameterized constructor");
		this.constituency = constituency;
		this.voterNumber = voterNumber;
		this.pollingBooth = pollingBooth;
		this.electionYear = electionYear;
		this.isEligible = isEligible;
	}

	String getConstituency() {
		return constituency;
	}

	void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	String getVoterNumber() {
		return voterNumber;
	}

	void setVoterNumber(String voterNumber) {
		this.voterNumber = voterNumber;
	}

	String getPollingBooth() {
		return pollingBooth;
	}

	void setPollingBooth(String pollingBooth) {
		this.pollingBooth = pollingBooth;
	}

	int getElectionYear() {
		return electionYear;
	}

	void setElectionYear(int electionYear) {
		this.electionYear = electionYear;
	}

	boolean isEligible() {
		return isEligible;
	}

	void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
	
	
    void display()
    {
    	super.display();
    	System.out.println("Constituency : "+this.constituency);
    	System.out.println("Voter Number : "+this.voterNumber);
    	System.out.println("Polling Booth : "+this.pollingBooth);
    	System.out.println("Election year : "+this.electionYear);
    	System.out.println("Is Eligible : "+this.isEligible);
    }
    
}//class VoterID ends here

class TestGovernmentDocument
{
	public static void main(String[]args)
	{
		GovernmentDocument g1=new GovernmentDocument();
		g1.display();
		
		Passport p1=new Passport(201, "Priya Deshmukh", "2020-07-01", "2030-07-01","Ministry of External Affairs", "Mumbai", true,"India", "Diplomatic", 60, "Indian", true);
		p1.display();
		
		DrivingLicense d1=new DrivingLicense();
		d1.display();
		
		VoterID v1=new VoterID(401, "Neha Patil", "2022-09-10", "2032-09-10", "Election Commission of India", "Nagpur", true,"Nagpur Central", "MH2023456", "Booth No. 21, City College", 2024, true);
		v1.display();
	}
}
