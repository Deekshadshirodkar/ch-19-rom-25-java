class KingRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        King king1 = new King(1, "Ashoka", "Maurya", 268, 232, true, "Asandhimitra");
        king1.getKingInfo();

        King king2 = new King(2, "Akbar", "Mughal", 1556, 1605, true, "Jodha Bai");
        king2.getKingInfo();

        King king3 = new King(3, "Raja Raja Chola", "Chola", 985, 1014, true, "Trailokya Mahadevi");
        king3.getKingInfo();

        King king4 = new King(4, "Krishnadevaraya", "Vijayanagara", 1509, 1529, true, "Chinna Devi");
        king4.getKingInfo();

        King king5 = new King(5, "Harsha", "Vardhana", 606, 647, true, "Unnamed");
        king5.getKingInfo();

        King king6 = new King(6, "Prithviraj Chauhan", "Chahamana", 1178, 1192, true, "Samyukta");
        king6.getKingInfo();

        King king7 = new King(7, "Shivaji Maharaj", "Maratha", 1674, 1680, true, "Sai Bhonsale");
        king7.getKingInfo();

        King king8 = new King(8, "Chandragupta Maurya", "Maurya", 321, 297, true, "Durdhara");
        king8.getKingInfo();

        King king9 = new King(9, "Bindusara", "Maurya", 297, 273, true, "Subhadrangi");
        king9.getKingInfo();

        King king10 = new King(10, "Ranjit Singh", "Sikh Empire", 1801, 1839, true, "Mehtab Kaur");
        king10.getKingInfo();

        King king11 = new King(11, "Bimbisara", "Haryanka", 544, 492, true, "Kosala Devi");
        king11.getKingInfo();

        King king12 = new King(12, "Pulakeshin II", "Chalukya", 610, 642, true, "Unnamed");
        king12.getKingInfo();

        King king13 = new King(13, "Vikramaditya", "Ujjain", 57, 0, true, "Unknown");
        king13.getKingInfo();

        King king14 = new King(14, "Rajendra Chola", "Chola", 1014, 1044, true, "Unknown");
        king14.getKingInfo();

        King king15 = new King(15, "Dharma Raja", "Travancore", 1758, 1798, false, "Unknown");
        king15.getKingInfo();

        King king16 = new King(16, "Raja Bhoj", "Paramara", 1010, 1055, true, "Unknown");
        king16.getKingInfo();

        King king17 = new King(17, "Jai Singh II", "Amber", 1699, 1743, true, "Unknown");
        king17.getKingInfo();

        King king18 = new King(18, "Zahir-ud-din Babur", "Mughal", 1526, 1530, true, "Aisha Sultan Begum");
        king18.getKingInfo();

        King king19 = new King(19, "Tipu Sultan", "Mysore", 1782, 1799, true, "Unnamed");
        king19.getKingInfo();

        King king20 = new King(20, "Narendra Dev", "Kosala", 6, 0, false, "Unknown");
        king20.getKingInfo();

        System.out.println("Main Ended");
    }
}


        /*King king1 = new King();
        king1.kingId = 1;
        king1.name = "Ashoka";
        king1.kingdom = "Maurya";
        king1.reignStartYear = 268;
        king1.reignEndYear = 232;
        king1.isWarrior = true;
        king1.queenName = "Asandhimitra";

        System.out.println("=== King 1 ===");
        king1.getKingInfo();

        King king2 = new King();
        king2.kingId = 2;
        king2.name = "Akbar";
        king2.kingdom = "Mughal";
        king2.reignStartYear = 1556;
        king2.reignEndYear = 1605;
        king2.isWarrior = true;
        king2.queenName = "Jodha Bai";

        System.out.println("=== King 2 ===");
        king2.getKingInfo();

        King king3 = new King();
        king3.kingId = 3;
        king3.name = "Raja Raja Chola";
        king3.kingdom = "Chola";
        king3.reignStartYear = 985;
        king3.reignEndYear = 1014;
        king3.isWarrior = true;
        king3.queenName = "Trailokya Mahadevi";

        System.out.println("=== King 3 ===");
        king3.getKingInfo();

        King king4 = new King();
        king4.kingId = 4;
        king4.name = "Krishnadevaraya";
        king4.kingdom = "Vijayanagara";
        king4.reignStartYear = 1509;
        king4.reignEndYear = 1529;
        king4.isWarrior = true;
        king4.queenName = "Chinna Devi";

        System.out.println("=== King 4 ===");
        king4.getKingInfo();

        King king5 = new King();
        king5.kingId = 5;
        king5.name = "Harsha";
        king5.kingdom = "Vardhana";
        king5.reignStartYear = 606;
        king5.reignEndYear = 647;
        king5.isWarrior = true;
        king5.queenName = "Unnamed";

        System.out.println("=== King 5 ===");
        king5.getKingInfo();

        King king6 = new King();
        king6.kingId = 6;
        king6.name = "Prithviraj Chauhan";
        king6.kingdom = "Chahamana";
        king6.reignStartYear = 1178;
        king6.reignEndYear = 1192;
        king6.isWarrior = true;
        king6.queenName = "Samyukta";

        System.out.println("=== King 6 ===");
        king6.getKingInfo();

        King king7 = new King();
        king7.kingId = 7;
        king7.name = "Shivaji Maharaj";
        king7.kingdom = "Maratha";
        king7.reignStartYear = 1674;
        king7.reignEndYear = 1680;
        king7.isWarrior = true;
        king7.queenName = "Sai Bhonsale";

        System.out.println("=== King 7 ===");
        king7.getKingInfo();

        King king8 = new King();
        king8.kingId = 8;
        king8.name = "Chandragupta Maurya";
        king8.kingdom = "Maurya";
        king8.reignStartYear = 321;
        king8.reignEndYear = 297;
        king8.isWarrior = true;
        king8.queenName = "Durdhara";

        System.out.println("=== King 8 ===");
        king8.getKingInfo();

        King king9 = new King();
        king9.kingId = 9;
        king9.name = "Bindusara";
        king9.kingdom = "Maurya";
        king9.reignStartYear = 297;
        king9.reignEndYear = 273;
        king9.isWarrior = true;
        king9.queenName = "Subhadrangi";

        System.out.println("=== King 9 ===");
        king9.getKingInfo();

        King king10 = new King();
        king10.kingId = 10;
        king10.name = "Ranjit Singh";
        king10.kingdom = "Sikh Empire";
        king10.reignStartYear = 1801;
        king10.reignEndYear = 1839;
        king10.isWarrior = true;
        king10.queenName = "Mehtab Kaur";

        System.out.println("=== King 10 ===");
        king10.getKingInfo();

        King king11 = new King();
        king11.kingId = 11;
        king11.name = "Bimbisara";
        king11.kingdom = "Haryanka";
        king11.reignStartYear = 544;
        king11.reignEndYear = 492;
        king11.isWarrior = true;
        king11.queenName = "Kosala Devi";

        System.out.println("=== King 11 ===");
        king11.getKingInfo();

        King king12 = new King();
        king12.kingId = 12;
        king12.name = "Pulakeshin II";
        king12.kingdom = "Chalukya";
        king12.reignStartYear = 610;
        king12.reignEndYear = 642;
        king12.isWarrior = true;
        king12.queenName = "Unnamed";

        System.out.println("=== King 12 ===");
        king12.getKingInfo();

        King king13 = new King();
        king13.kingId = 13;
        king13.name = "Vikramaditya";
        king13.kingdom = "Ujjain";
        king13.reignStartYear = 57;
        king13.reignEndYear = 0;
        king13.isWarrior = true;
        king13.queenName = "Unknown";

        System.out.println("=== King 13 ===");
        king13.getKingInfo();

        King king14 = new King();
        king14.kingId = 14;
        king14.name = "Rajendra Chola";
        king14.kingdom = "Chola";
        king14.reignStartYear = 1014;
        king14.reignEndYear = 1044;
        king14.isWarrior = true;
        king14.queenName = "Unknown";

        System.out.println("=== King 14 ===");
        king14.getKingInfo();

        King king15 = new King();
        king15.kingId = 15;
        king15.name = "Dharma Raja";
        king15.kingdom = "Travancore";
        king15.reignStartYear = 1758;
        king15.reignEndYear = 1798;
        king15.isWarrior = false;
        king15.queenName = "Unknown";

        System.out.println("=== King 15 ===");
        king15.getKingInfo();

        King king16 = new King();
        king16.kingId = 16;
        king16.name = "Raja Bhoj";
        king16.kingdom = "Paramara";
        king16.reignStartYear = 1010;
        king16.reignEndYear = 1055;
        king16.isWarrior = true;
        king16.queenName = "Unknown";

        System.out.println("=== King 16 ===");
        king16.getKingInfo();

        King king17 = new King();
        king17.kingId = 17;
        king17.name = "Jai Singh II";
        king17.kingdom = "Amber";
        king17.reignStartYear = 1699;
        king17.reignEndYear = 1743;
        king17.isWarrior = true;
        king17.queenName = "Unknown";

        System.out.println("=== King 17 ===");
        king17.getKingInfo();

        King king18 = new King();
        king18.kingId = 18;
        king18.name = "Zahir-ud-din Babur";
        king18.kingdom = "Mughal";
        king18.reignStartYear = 1526;
        king18.reignEndYear = 1530;
        king18.isWarrior = true;
        king18.queenName = "Aisha Sultan Begum";

        System.out.println("=== King 18 ===");
        king18.getKingInfo();

        King king19 = new King();
        king19.kingId = 19;
        king19.name = "Tipu Sultan";
        king19.kingdom = "Mysore";
        king19.reignStartYear = 1782;
        king19.reignEndYear = 1799;
        king19.isWarrior = true;
        king19.queenName = "Unnamed";

        System.out.println("=== King 19 ===");
        king19.getKingInfo();

        King king20 = new King();
        king20.kingId = 20;
        king20.name = "Narendra Dev";
        king20.kingdom = "Kosala";
        king20.reignStartYear = 6;
        king20.reignEndYear = 0;
        king20.isWarrior = false;
        king20.queenName = "Unknown";

        System.out.println("=== King 20 ===");
        king20.getKingInfo();*/
