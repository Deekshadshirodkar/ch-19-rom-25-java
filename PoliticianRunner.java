class PoliticianRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Politician politician1 = new Politician(1, "Narendra Modi", "BJP", "Gujarat", 74, false, "Varanasi");
        System.out.println("=== Politician 1 ===");
        politician1.getPoliticianInfo();

        Politician politician2 = new Politician(2, "Rahul Gandhi", "Congress", "Kerala", 54, false, "Wayanad");
        System.out.println("=== Politician 2 ===");
        politician2.getPoliticianInfo();

        Politician politician3 = new Politician(3, "Mamata Banerjee", "TMC", "West Bengal", 69, false, "Bhabanipur");
        System.out.println("=== Politician 3 ===");
        politician3.getPoliticianInfo();

        Politician politician4 = new Politician(4, "Amit Shah", "BJP", "Gujarat", 60, true, "Gandhinagar");
        System.out.println("=== Politician 4 ===");
        politician4.getPoliticianInfo();

        Politician politician5 = new Politician(5, "Arvind Kejriwal", "AAP", "Delhi", 55, false, "New Delhi");
        System.out.println("=== Politician 5 ===");
        politician5.getPoliticianInfo();

        Politician politician6 = new Politician(6, "Yogi Adityanath", "BJP", "Uttar Pradesh", 51, false, "Gorakhpur");
        System.out.println("=== Politician 6 ===");
        politician6.getPoliticianInfo();

        Politician politician7 = new Politician(7, "Sharad Pawar", "NCP", "Maharashtra", 84, false, "Baramati");
        System.out.println("=== Politician 7 ===");
        politician7.getPoliticianInfo();

        Politician politician8 = new Politician(8, "Sonia Gandhi", "Congress", "Uttar Pradesh", 78, false, "Rae Bareli");
        System.out.println("=== Politician 8 ===");
        politician8.getPoliticianInfo();

        Politician politician9 = new Politician(9, "Nitish Kumar", "JDU", "Bihar", 73, false, "Nalanda");
        System.out.println("=== Politician 9 ===");
        politician9.getPoliticianInfo();

        Politician politician10 = new Politician(10, "Mayawati", "BSP", "Uttar Pradesh", 68, false, "Ambedkar Nagar");
        System.out.println("=== Politician 10 ===");
        politician10.getPoliticianInfo();

        Politician politician11 = new Politician(11, "Ajay Tiwari", "LJP", "Bihar", 53, false, "Patna");
        System.out.println("=== Politician 11 ===");
        politician11.getPoliticianInfo();

        Politician politician12 = new Politician(12, "Sunita Yadav", "BSP", "Uttar Pradesh", 49, false, "Agra");
        System.out.println("=== Politician 12 ===");
        politician12.getPoliticianInfo();

        Politician politician13 = new Politician(13, "Imran Ali", "SP", "Uttar Pradesh", 51, false, "Lucknow");
        System.out.println("=== Politician 13 ===");
        politician13.getPoliticianInfo();

        Politician politician14 = new Politician(14, "Kiran Verma", "Congress", "Rajasthan", 42, false, "Jaipur");
        System.out.println("=== Politician 14 ===");
        politician14.getPoliticianInfo();

        Politician politician15 = new Politician(15, "Raj Malhotra", "Independent", "Punjab", 63, false, "Amritsar");
        System.out.println("=== Politician 15 ===");
        politician15.getPoliticianInfo();

        Politician politician16 = new Politician(16, "Latha Reddy", "TDP", "Andhra Pradesh", 46, false, "Vijayawada");
        System.out.println("=== Politician 16 ===");
        politician16.getPoliticianInfo();

        Politician politician17 = new Politician(17, "Harish Rao", "TRS", "Telangana", 55, false, "Siddipet");
        System.out.println("=== Politician 17 ===");
        politician17.getPoliticianInfo();

        Politician politician18 = new Politician(18, "Anjali Sharma", "AAP", "Delhi", 38, false, "Delhi Cantonment");
        System.out.println("=== Politician 18 ===");
        politician18.getPoliticianInfo();

        Politician politician19 = new Politician(19, "Farhan Qureshi", "NCP", "Maharashtra", 44, false, "Nagpur");
        System.out.println("=== Politician 19 ===");
        politician19.getPoliticianInfo();

        Politician politician20 = new Politician(20, "Preeti Joshi", "Congress", "Rajasthan", 50, false, "Udaipur");
        System.out.println("=== Politician 20 ===");
        politician20.getPoliticianInfo();

        System.out.println("Main Ended");
    }
}



        /*Politician politician1 = new Politician();
        politician1.politicianId = 1;
        politician1.name = "Narendra Modi";
        politician1.party = "BJP";
        politician1.state = "Gujarat";
        politician1.age = 74;
        politician1.isCabinetMinister = false;
        politician1.constituency = "Varanasi";
        System.out.println("=== Politician 1 ===");
        politician1.getPoliticianInfo();

        Politician politician2 = new Politician();
        politician2.politicianId = 2;
        politician2.name = "Rahul Gandhi";
        politician2.party = "Congress";
        politician2.state = "Kerala";
        politician2.age = 54;
        politician2.isCabinetMinister = false;
        politician2.constituency = "Wayanad";
        System.out.println("=== Politician 2 ===");
        politician2.getPoliticianInfo();

        Politician politician3 = new Politician();
        politician3.politicianId = 3;
        politician3.name = "Mamata Banerjee";
        politician3.party = "TMC";
        politician3.state = "West Bengal";
        politician3.age = 69;
        politician3.isCabinetMinister = false;
        politician3.constituency = "Bhabanipur";
        System.out.println("=== Politician 3 ===");
        politician3.getPoliticianInfo();

        Politician politician4 = new Politician();
        politician4.politicianId = 4;
        politician4.name = "Amit Shah";
        politician4.party = "BJP";
        politician4.state = "Gujarat";
        politician4.age = 60;
        politician4.isCabinetMinister = true;
        politician4.constituency = "Gandhinagar";
        System.out.println("=== Politician 4 ===");
        politician4.getPoliticianInfo();

        Politician politician5 = new Politician();
        politician5.politicianId = 5;
        politician5.name = "Arvind Kejriwal";
        politician5.party = "AAP";
        politician5.state = "Delhi";
        politician5.age = 55;
        politician5.isCabinetMinister = false;
        politician5.constituency = "New Delhi";
        System.out.println("=== Politician 5 ===");
        politician5.getPoliticianInfo();

        Politician politician6 = new Politician();
        politician6.politicianId = 6;
        politician6.name = "Yogi Adityanath";
        politician6.party = "BJP";
        politician6.state = "Uttar Pradesh";
        politician6.age = 51;
        politician6.isCabinetMinister = false;
        politician6.constituency = "Gorakhpur";
        System.out.println("=== Politician 6 ===");
        politician6.getPoliticianInfo();

        Politician politician7 = new Politician();
        politician7.politicianId = 7;
        politician7.name = "Sharad Pawar";
        politician7.party = "NCP";
        politician7.state = "Maharashtra";
        politician7.age = 84;
        politician7.isCabinetMinister = false;
        politician7.constituency = "Baramati";
        System.out.println("=== Politician 7 ===");
        politician7.getPoliticianInfo();

        Politician politician8 = new Politician();
        politician8.politicianId = 8;
        politician8.name = "Sonia Gandhi";
        politician8.party = "Congress";
        politician8.state = "Uttar Pradesh";
        politician8.age = 78;
        politician8.isCabinetMinister = false;
        politician8.constituency = "Rae Bareli";
        System.out.println("=== Politician 8 ===");
        politician8.getPoliticianInfo();

        Politician politician9 = new Politician();
        politician9.politicianId = 9;
        politician9.name = "Nitish Kumar";
        politician9.party = "JDU";
        politician9.state = "Bihar";
        politician9.age = 73;
        politician9.isCabinetMinister = false;
        politician9.constituency = "Nalanda";
        System.out.println("=== Politician 9 ===");
        politician9.getPoliticianInfo();

        Politician politician10 = new Politician();
        politician10.politicianId = 10;
        politician10.name = "Mayawati";
        politician10.party = "BSP";
        politician10.state = "Uttar Pradesh";
        politician10.age = 68;
        politician10.isCabinetMinister = false;
        politician10.constituency = "Ambedkar Nagar";
        System.out.println("=== Politician 10 ===");
        politician10.getPoliticianInfo();

        Politician politician11 = new Politician();
        politician11.politicianId = 11;
        politician11.name = "Ajay Tiwari";
        politician11.party = "LJP";
        politician11.state = "Bihar";
        politician11.age = 53;
        politician11.isCabinetMinister = false;
        politician11.constituency = "Patna";
        System.out.println("=== Politician 11 ===");
        politician11.getPoliticianInfo();

        Politician politician12 = new Politician();
        politician12.politicianId = 12;
        politician12.name = "Sunita Yadav";
        politician12.party = "BSP";
        politician12.state = "Uttar Pradesh";
        politician12.age = 49;
        politician12.isCabinetMinister = false;
        politician12.constituency = "Agra";
        System.out.println("=== Politician 12 ===");
        politician12.getPoliticianInfo();

        Politician politician13 = new Politician();
        politician13.politicianId = 13;
        politician13.name = "Imran Ali";
        politician13.party = "SP";
        politician13.state = "Uttar Pradesh";
        politician13.age = 51;
        politician13.isCabinetMinister = false;
        politician13.constituency = "Lucknow";
        System.out.println("=== Politician 13 ===");
        politician13.getPoliticianInfo();

        Politician politician14 = new Politician();
        politician14.politicianId = 14;
        politician14.name = "Kiran Verma";
        politician14.party = "Congress";
        politician14.state = "Rajasthan";
        politician14.age = 42;
        politician14.isCabinetMinister = false;
        politician14.constituency = "Jaipur";
        System.out.println("=== Politician 14 ===");
        politician14.getPoliticianInfo();

        Politician politician15 = new Politician();
        politician15.politicianId = 15;
        politician15.name = "Raj Malhotra";
        politician15.party = "Independent";
        politician15.state = "Punjab";
        politician15.age = 63;
        politician15.isCabinetMinister = false;
        politician15.constituency = "Amritsar";
        System.out.println("=== Politician 15 ===");
        politician15.getPoliticianInfo();

        Politician politician16 = new Politician();
        politician16.politicianId = 16;
        politician16.name = "Latha Reddy";
        politician16.party = "TDP";
        politician16.state = "Andhra Pradesh";
        politician16.age = 46;
        politician16.isCabinetMinister = false;
        politician16.constituency = "Vijayawada";
        System.out.println("=== Politician 16 ===");
        politician16.getPoliticianInfo();

        Politician politician17 = new Politician();
        politician17.politicianId = 17;
        politician17.name = "Harish Rao";
        politician17.party = "TRS";
        politician17.state = "Telangana";
        politician17.age = 55;
        politician17.isCabinetMinister = false;
        politician17.constituency = "Siddipet";
        System.out.println("=== Politician 17 ===");
        politician17.getPoliticianInfo();

        Politician politician18 = new Politician();
        politician18.politicianId = 18;
        politician18.name = "Anjali Sharma";
        politician18.party = "AAP";
        politician18.state = "Delhi";
        politician18.age = 38;
        politician18.isCabinetMinister = false;
        politician18.constituency = "Delhi Cantonment";
        System.out.println("=== Politician 18 ===");
        politician18.getPoliticianInfo();

        Politician politician19 = new Politician();
        politician19.politicianId = 19;
        politician19.name = "Farhan Qureshi";
        politician19.party = "NCP";
        politician19.state = "Maharashtra";
        politician19.age = 44;
        politician19.isCabinetMinister = false;
        politician19.constituency = "Nagpur";
        System.out.println("=== Politician 19 ===");
        politician19.getPoliticianInfo();

        Politician politician20 = new Politician();
        politician20.politicianId = 20;
        politician20.name = "Preeti Joshi";
        politician20.party = "Congress";
        politician20.state = "Rajasthan";
        politician20.age = 50;
        politician20.isCabinetMinister = false;
        politician20.constituency = "Udaipur";
        System.out.println("=== Politician 20 ===");
        politician20.getPoliticianInfo();*/
