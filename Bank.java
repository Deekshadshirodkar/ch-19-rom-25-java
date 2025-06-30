class Bank{

	static String bankName;
    static Integer branchCode;
	static String ifscCode;
	static String address;
	static String bankType;
	static String headquarters;
	static int staff;
	static String manager;
	static Long telPhone;
    static double totalFunds;
	static String accountType;
    static Float interestRate;
	static String servicesOffered;
	static int totalBranch;
    static Long registrationNumber;
    static Short establishedYear;
    static Byte rating;
    static Boolean isActive;
    static Character grade;
	static Long customerCareNumber;
	
	
	public static void main(String bank[]){
		System.out.println("Name of the Bank : "+bankName);
		System.out.println("Branch Code : "+branchCode);
		System.out.println("IFSC code : " +ifscCode );
		System.out.println("Address : " +address);
		System.out.println("Type of Bank : " +bankType);
		System.out.println("Headquarters : " +headquarters);
		System.out.println("Total staff : " +staff);
		System.out.println("Manager : " +manager);
		System.out.println("Phone number : " +telPhone);
		System.out.println("Number of branch : " +totalBranch);
		System.out.println("Total Funds: " + totalFunds);
		System.out.println("Type of account: " +accountType);
		System.out.println("Services Offered : "+servicesOffered);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Rating: " + rating);
        System.out.println("Is Active: " + isActive);
        System.out.println("Grade: " + grade);
		System.out.println("Custoner Care Number : " +customerCareNumber);

		bankName = "Union Bank of Java";
		branchCode = 1234;
		ifscCode = "UN0064";
		address = "Karwar";
		bankType = "Public Sector Bank";
		headquarters = "Bengaluru, Karnataka";
		staff = 10;
		manager = "Mr. Patil ";
		telPhone = 98878583998L;
		totalFunds = 50000000.0;
		accountType = " Savings ";
		interestRate = 3.5f;
		servicesOffered = "Savings, Loans, Insurance, Forex";
		totalBranch = 15;
		registrationNumber = 9876543210L;
		establishedYear = 1995;
		rating = 5;
		isActive = true;
		grade = 'A';
		customerCareNumber = 180000267672L;
	
	
	
		System.out.println(bankName);
		System.out.println(branchCode);
		System.out.println(ifscCode );
		System.out.println(address);
		System.out.println(bankType);
		System.out.println(headquarters);
		System.out.println(staff);
		System.out.println(manager);
		System.out.println(telPhone);
		System.out.println(totalBranch);
		System.out.println(totalFunds);
		System.out.println(accountType);
		System.out.println(servicesOffered);
        System.out.println(interestRate);
        System.out.println(registrationNumber);
        System.out.println(establishedYear);
        System.out.println(rating);
        System.out.println(isActive);
        System.out.println(grade);
		System.out.println(customerCareNumber);

		
	}
}