class CourtcaseRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Courtcase case1 = new Courtcase();
        case1.caseId = 1;
        case1.caseTitle = "Land Dispute";
        case1.plaintiff = "Ravi Kumar";
        case1.defendant = "Suresh Patel";
        case1.judge = "Justice Mehra";
        case1.courtName = "Delhi High Court";
        case1.isClosed = false;

        System.out.println("=== Case 1 ===");
        System.out.println("ID: " + case1.caseId);
        System.out.println("Title: " + case1.caseTitle);
        System.out.println("Plaintiff: " + case1.plaintiff);
        System.out.println("Defendant: " + case1.defendant);
        System.out.println("Judge: " + case1.judge);
        System.out.println("Court: " + case1.courtName);
        System.out.println("Closed: " + case1.isClosed);

        Courtcase case2 = new Courtcase();
        case2.caseId = 2;
        case2.caseTitle = "Fraud Investigation";
        case2.plaintiff = "CBI";
        case2.defendant = "XYZ Corp";
        case2.judge = "Justice Sharma";
        case2.courtName = "Supreme Court";
        case2.isClosed = false;

        System.out.println("=== Case 2 ===");
        System.out.println("ID: " + case2.caseId);
        System.out.println("Title: " + case2.caseTitle);
        System.out.println("Plaintiff: " + case2.plaintiff);
        System.out.println("Defendant: " + case2.defendant);
        System.out.println("Judge: " + case2.judge);
        System.out.println("Court: " + case2.courtName);
        System.out.println("Closed: " + case2.isClosed);

        Courtcase case3 = new Courtcase();
        case3.caseId = 3;
        case3.caseTitle = "Divorce Case";
        case3.plaintiff = "Neha Singh";
        case3.defendant = "Amit Singh";
        case3.judge = "Justice Rao";
        case3.courtName = "Mumbai Family Court";
        case3.isClosed = true;

        System.out.println("=== Case 3 ===");
        System.out.println("ID: " + case3.caseId);
        System.out.println("Title: " + case3.caseTitle);
        System.out.println("Plaintiff: " + case3.plaintiff);
        System.out.println("Defendant: " + case3.defendant);
        System.out.println("Judge: " + case3.judge);
        System.out.println("Court: " + case3.courtName);
        System.out.println("Closed: " + case3.isClosed);

		Courtcase case4 = new Courtcase();
        case4.caseId = 4;
        case4.caseTitle = "Property Claim";
        case4.plaintiff = "Anjali Desai";
        case4.defendant = "State Govt";
        case4.judge = "Justice Rao";
        case4.courtName = "Ahmedabad High Court";
        case4.isClosed = false;

        System.out.println("=== Case 4 ===");
        System.out.println("ID: " + case4.caseId);
        System.out.println("Title: " + case4.caseTitle);
        System.out.println("Plaintiff: " + case4.plaintiff);
        System.out.println("Defendant: " + case4.defendant);
        System.out.println("Judge: " + case4.judge);
        System.out.println("Court: " + case4.courtName);
        System.out.println("Closed: " + case4.isClosed);

        Courtcase case5 = new Courtcase();
        case5.caseId = 5;
        case5.caseTitle = "Murder Trial";
        case5.plaintiff = "Govt of India";
        case5.defendant = "Rahul Verma";
        case5.judge = "Justice Tripathi";
        case5.courtName = "Patna Sessions Court";
        case5.isClosed = false;

        System.out.println("=== Case 5 ===");
        System.out.println("ID: " + case5.caseId);
        System.out.println("Title: " + case5.caseTitle);
        System.out.println("Plaintiff: " + case5.plaintiff);
        System.out.println("Defendant: " + case5.defendant);
        System.out.println("Judge: " + case5.judge);
        System.out.println("Court: " + case5.courtName);
        System.out.println("Closed: " + case5.isClosed);

        Courtcase case6 = new Courtcase();
        case6.caseId = 6;
        case6.caseTitle = "Cheque Bounce";
        case6.plaintiff = "Nikita Jain";
        case6.defendant = "Deepak Traders";
        case6.judge = "Justice Meena";
        case6.courtName = "Delhi District Court";
        case6.isClosed = true;

        System.out.println("=== Case 6 ===");
        System.out.println("ID: " + case6.caseId);
        System.out.println("Title: " + case6.caseTitle);
        System.out.println("Plaintiff: " + case6.plaintiff);
        System.out.println("Defendant: " + case6.defendant);
        System.out.println("Judge: " + case6.judge);
        System.out.println("Court: " + case6.courtName);
        System.out.println("Closed: " + case6.isClosed);

        Courtcase case7 = new Courtcase();
        case7.caseId = 7;
        case7.caseTitle = "Accident Compensation";
        case7.plaintiff = "Shyam Sundar";
        case7.defendant = "XYZ Logistics";
        case7.judge = "Justice Arora";
        case7.courtName = "Chennai High Court";
        case7.isClosed = true;

        System.out.println("=== Case 7 ===");
        System.out.println("ID: " + case7.caseId);
        System.out.println("Title: " + case7.caseTitle);
        System.out.println("Plaintiff: " + case7.plaintiff);
        System.out.println("Defendant: " + case7.defendant);
        System.out.println("Judge: " + case7.judge);
        System.out.println("Court: " + case7.courtName);
        System.out.println("Closed: " + case7.isClosed);

        Courtcase case8 = new Courtcase();
        case8.caseId = 8;
        case8.caseTitle = "Cybercrime";
        case8.plaintiff = "Cyber Cell";
        case8.defendant = "Unknown";
        case8.judge = "Justice Ghosh";
        case8.courtName = "Kolkata Cyber Court";
        case8.isClosed = false;

        System.out.println("=== Case 8 ===");
        System.out.println("ID: " + case8.caseId);
        System.out.println("Title: " + case8.caseTitle);
        System.out.println("Plaintiff: " + case8.plaintiff);
        System.out.println("Defendant: " + case8.defendant);
        System.out.println("Judge: " + case8.judge);
        System.out.println("Court: " + case8.courtName);
        System.out.println("Closed: " + case8.isClosed);

        Courtcase case9 = new Courtcase();
        case9.caseId = 9;
        case9.caseTitle = "Loan Default";
        case9.plaintiff = "SBI Bank";
        case9.defendant = "Ravi Group";
        case9.judge = "Justice Nanda";
        case9.courtName = "Hyderabad Civil Court";
        case9.isClosed = false;

        System.out.println("=== Case 9 ===");
        System.out.println("ID: " + case9.caseId);
        System.out.println("Title: " + case9.caseTitle);
        System.out.println("Plaintiff: " + case9.plaintiff);
        System.out.println("Defendant: " + case9.defendant);
        System.out.println("Judge: " + case9.judge);
        System.out.println("Court: " + case9.courtName);
        System.out.println("Closed: " + case9.isClosed);

        Courtcase case10 = new Courtcase();
        case10.caseId = 10;
        case10.caseTitle = "Medical Negligence";
        case10.plaintiff = "Patient Welfare Org";
        case10.defendant = "ABC Hospital";
        case10.judge = "Justice Bose";
        case10.courtName = "Bangalore Consumer Court";
        case10.isClosed = true;

        System.out.println("=== Case 10 ===");
        System.out.println("ID: " + case10.caseId);
        System.out.println("Title: " + case10.caseTitle);
        System.out.println("Plaintiff: " + case10.plaintiff);
        System.out.println("Defendant: " + case10.defendant);
        System.out.println("Judge: " + case10.judge);
        System.out.println("Court: " + case10.courtName);
        System.out.println("Closed: " + case10.isClosed);

		        Courtcase case11 = new Courtcase();
        case11.caseId = 11;
        case11.caseTitle = "Fraud Transaction";
        case11.plaintiff = "Manoj Seth";
        case11.defendant = "Techkart Ltd";
        case11.judge = "Justice Naidu";
        case11.courtName = "Mumbai Economic Offense Court";
        case11.isClosed = false;

        System.out.println("=== Case 11 ===");
        System.out.println("ID: " + case11.caseId);
        System.out.println("Title: " + case11.caseTitle);
        System.out.println("Plaintiff: " + case11.plaintiff);
        System.out.println("Defendant: " + case11.defendant);
        System.out.println("Judge: " + case11.judge);
        System.out.println("Court: " + case11.courtName);
        System.out.println("Closed: " + case11.isClosed);

        Courtcase case12 = new Courtcase();
        case12.caseId = 12;
        case12.caseTitle = "Electricity Bill Dispute";
        case12.plaintiff = "Sneha Kulkarni";
        case12.defendant = "MSEB";
        case12.judge = "Justice Menon";
        case12.courtName = "Pune District Court";
        case12.isClosed = true;

        System.out.println("=== Case 12 ===");
        System.out.println("ID: " + case12.caseId);
        System.out.println("Title: " + case12.caseTitle);
        System.out.println("Plaintiff: " + case12.plaintiff);
        System.out.println("Defendant: " + case12.defendant);
        System.out.println("Judge: " + case12.judge);
        System.out.println("Court: " + case12.courtName);
        System.out.println("Closed: " + case12.isClosed);

        Courtcase case13 = new Courtcase();
        case13.caseId = 13;
        case13.caseTitle = "Environmental Violation";
        case13.plaintiff = "Green NGO";
        case13.defendant = "XYZ Chemicals";
        case13.judge = "Justice Shinde";
        case13.courtName = "NGT Delhi";
        case13.isClosed = false;

        System.out.println("=== Case 13 ===");
        System.out.println("ID: " + case13.caseId);
        System.out.println("Title: " + case13.caseTitle);
        System.out.println("Plaintiff: " + case13.plaintiff);
        System.out.println("Defendant: " + case13.defendant);
        System.out.println("Judge: " + case13.judge);
        System.out.println("Court: " + case13.courtName);
        System.out.println("Closed: " + case13.isClosed);

        Courtcase case14 = new Courtcase();
        case14.caseId = 14;
        case14.caseTitle = "Company Law Breach";
        case14.plaintiff = "Registrar of Companies";
        case14.defendant = "Bright Pvt Ltd";
        case14.judge = "Justice Batra";
        case14.courtName = "Company Law Board, Delhi";
        case14.isClosed = false;

        System.out.println("=== Case 14 ===");
        System.out.println("ID: " + case14.caseId);
        System.out.println("Title: " + case14.caseTitle);
        System.out.println("Plaintiff: " + case14.plaintiff);
        System.out.println("Defendant: " + case14.defendant);
        System.out.println("Judge: " + case14.judge);
        System.out.println("Court: " + case14.courtName);
        System.out.println("Closed: " + case14.isClosed);

        Courtcase case15 = new Courtcase();
        case15.caseId = 15;
        case15.caseTitle = "Worker Compensation";
        case15.plaintiff = "Ramesh Bhatt";
        case15.defendant = "SunWorks Pvt Ltd";
        case15.judge = "Justice Agrawal";
        case15.courtName = "Labour Court, Indore";
        case15.isClosed = true;

        System.out.println("=== Case 15 ===");
        System.out.println("ID: " + case15.caseId);
        System.out.println("Title: " + case15.caseTitle);
        System.out.println("Plaintiff: " + case15.plaintiff);
        System.out.println("Defendant: " + case15.defendant);
        System.out.println("Judge: " + case15.judge);
        System.out.println("Court: " + case15.courtName);
        System.out.println("Closed: " + case15.isClosed);

        Courtcase case16 = new Courtcase();
        case16.caseId = 16;
        case16.caseTitle = "Eviction Notice";
        case16.plaintiff = "House Owner";
        case16.defendant = "Tenant";
        case16.judge = "Justice Bhalla";
        case16.courtName = "Bhopal Civil Court";
        case16.isClosed = true;

        System.out.println("=== Case 16 ===");
        System.out.println("ID: " + case16.caseId);
        System.out.println("Title: " + case16.caseTitle);
        System.out.println("Plaintiff: " + case16.plaintiff);
        System.out.println("Defendant: " + case16.defendant);
        System.out.println("Judge: " + case16.judge);
        System.out.println("Court: " + case16.courtName);
        System.out.println("Closed: " + case16.isClosed);

        Courtcase case17 = new Courtcase();
        case17.caseId = 17;
        case17.caseTitle = "Minor Theft";
        case17.plaintiff = "Ravi Sharma";
        case17.defendant = "John Doe";
        case17.judge = "Justice Dey";
        case17.courtName = "Mumbai Magistrate Court";
        case17.isClosed = true;

        System.out.println("=== Case 17 ===");
        System.out.println("ID: " + case17.caseId);
        System.out.println("Title: " + case17.caseTitle);
        System.out.println("Plaintiff: " + case17.plaintiff);
        System.out.println("Defendant: " + case17.defendant);
        System.out.println("Judge: " + case17.judge);
        System.out.println("Court: " + case17.courtName);
        System.out.println("Closed: " + case17.isClosed);

        Courtcase case18 = new Courtcase();
        case18.caseId = 18;
        case18.caseTitle = "Copyright Infringement";
        case18.plaintiff = "XYZ Studios";
        case18.defendant = "PirateLinks.com";
        case18.judge = "Justice Vasudev";
        case18.courtName = "IP Court, Mumbai";
        case18.isClosed = false;

        System.out.println("=== Case 18 ===");
        System.out.println("ID: " + case18.caseId);
        System.out.println("Title: " + case18.caseTitle);
        System.out.println("Plaintiff: " + case18.plaintiff);
        System.out.println("Defendant: " + case18.defendant);
        System.out.println("Judge: " + case18.judge);
        System.out.println("Court: " + case18.courtName);
        System.out.println("Closed: " + case18.isClosed);

        Courtcase case19 = new Courtcase();
        case19.caseId = 19;
        case19.caseTitle = "Family Dispute";
        case19.plaintiff = "Sunita Sharma";
        case19.defendant = "Rajeev Sharma";
        case19.judge = "Justice Gill";
        case19.courtName = "Family Court, Delhi";
        case19.isClosed = false;

        System.out.println("=== Case 19 ===");
        System.out.println("ID: " + case19.caseId);
        System.out.println("Title: " + case19.caseTitle);
        System.out.println("Plaintiff: " + case19.plaintiff);
        System.out.println("Defendant: " + case19.defendant);
        System.out.println("Judge: " + case19.judge);
        System.out.println("Court: " + case19.courtName);
        System.out.println("Closed: " + case19.isClosed);

        Courtcase case20 = new Courtcase();
        case20.caseId = 20;
        case20.caseTitle = "Arbitration Dispute";
        case20.plaintiff = "GlobalTech Ltd";
        case20.defendant = "Zeta Contractors";
        case20.judge = "Justice Narayanan";
        case20.courtName = "Arbitration Tribunal";
        case20.isClosed = true;

        System.out.println("=== Case 20 ===");
        System.out.println("ID: " + case20.caseId);
        System.out.println("Title: " + case20.caseTitle);
        System.out.println("Plaintiff: " + case20.plaintiff);
        System.out.println("Defendant: " + case20.defendant);
        System.out.println("Judge: " + case20.judge);
        System.out.println("Court: " + case20.courtName);
        System.out.println("Closed: " + case20.isClosed);

        System.out.println("Main Ended");
    }
}

