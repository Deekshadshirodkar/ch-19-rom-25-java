class KarateRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Karate k1 = new Karate(1, "Ravi", "Tiger Dojo", "Sensei Kumar", false, "India", 1);
        k1.getKarateInfo();

        Karate k2 = new Karate(2, "Asha", "Dragon Academy", "Sensei Mehta", false, "India", 2);
        k2.getKarateInfo();

        Karate k3 = new Karate(3, "Sam", "Black Belt Club", "Sensei Lee", true, "USA", 5);
        k3.getKarateInfo();

        Karate k4 = new Karate(4, "Neha", "Zen Warriors", "Sensei Yamato", false, "Japan", 3);
        k4.getKarateInfo();

        Karate k5 = new Karate(5, "Rahul", "Blazing Fists", "Sensei Raj", true, "India", 6);
        k5.getKarateInfo();

        Karate k6 = new Karate(6, "Sneha", "Iron Fist Dojo", "Sensei Hiro", false, "Japan", 4);
        k6.getKarateInfo();

        Karate k7 = new Karate(3, "Arun", "Silent Warriors", "Sensei Ken", false, "India", 2);
        k7.getKarateInfo();

        Karate k8 = new Karate(4, "Priya", "Urban Combat", "Sensei Leena", true, "UK", 6);
        k8.getKarateInfo();

        Karate k9 = new Karate(2, "Nikhil", "Power Strike", "Sensei Aravind", false, "India", 3);
        k9.getKarateInfo();

        Karate k10 = new Karate(5, "Meera", "Zen Dojo", "Sensei Tanaka", true, "Japan", 7);
        k10.getKarateInfo();

        Karate k11 = new Karate(1, "Aman", "Crimson Tigers", "Sensei Vikram", false, "India", 1);
        k11.getKarateInfo();

        Karate k12 = new Karate(2, "Divya", "White Dragons", "Sensei Chen", false, "China", 2);
        k12.getKarateInfo();

        Karate k13 = new Karate(3, "Raj", "Street Fighters", "Sensei Abdul", true, "UAE", 5);
        k13.getKarateInfo();

        Karate k14 = new Karate(4, "Sana", "Blitz Dojo", "Sensei Rosa", false, "Brazil", 4);
        k14.getKarateInfo();

        Karate k15 = new Karate(5, "Farhan", "Red Phoenix", "Sensei Omar", true, "Pakistan", 6);
        k15.getKarateInfo();

        Karate k16 = new Karate(6, "Rekha", "Urban Lions", "Sensei Sato", true, "Japan", 8);
        k16.getKarateInfo();

        Karate k17 = new Karate(1, "Zaid", "Raging Storm", "Sensei Noor", false, "India", 1);
        k17.getKarateInfo();

        Karate k18 = new Karate(2, "Lata", "Golden Eagles", "Sensei Patel", false, "India", 2);
        k18.getKarateInfo();

        Karate k19 = new Karate(3, "Imran", "Shadow Warriors", "Sensei Raghav", true, "India", 5);
        k19.getKarateInfo();

        Karate k20 = new Karate(4, "Anjali", "Fury Academy", "Sensei Dev", true, "India", 6);
        k20.getKarateInfo();

        System.out.println("Main Ended");
    }
}



        /*Karate k1 = new Karate();
        k1.beltLevel = 1;
        k1.studentName = "Ravi";
        k1.dojoName = "Tiger Dojo";
        k1.instructor = "Sensei Kumar";
        k1.isProfessional = false;
        k1.country = "India";
        k1.yearsOfTraining = 1;
        System.out.println("=== Karate 1 ===");
        k1.getKarateInfo();

        Karate k2 = new Karate();
        k2.beltLevel = 2;
        k2.studentName = "Asha";
        k2.dojoName = "Dragon Academy";
        k2.instructor = "Sensei Mehta";
        k2.isProfessional = false;
        k2.country = "India";
        k2.yearsOfTraining = 2;
        System.out.println("=== Karate 2 ===");
        k2.getKarateInfo();

        Karate k3 = new Karate();
        k3.beltLevel = 3;
        k3.studentName = "Sam";
        k3.dojoName = "Black Belt Club";
        k3.instructor = "Sensei Lee";
        k3.isProfessional = true;
        k3.country = "USA";
        k3.yearsOfTraining = 5;
        System.out.println("=== Karate 3 ===");
        k3.getKarateInfo();

        Karate k4 = new Karate();
        k4.beltLevel = 4;
        k4.studentName = "Neha";
        k4.dojoName = "Zen Warriors";
        k4.instructor = "Sensei Yamato";
        k4.isProfessional = false;
        k4.country = "Japan";
        k4.yearsOfTraining = 3;
        System.out.println("=== Karate 4 ===");
        k4.getKarateInfo();

        Karate k5 = new Karate();
        k5.beltLevel = 5;
        k5.studentName = "Rahul";
        k5.dojoName = "Blazing Fists";
        k5.instructor = "Sensei Raj";
        k5.isProfessional = true;
        k5.country = "India";
        k5.yearsOfTraining = 6;
        System.out.println("=== Karate 5 ===");
        k5.getKarateInfo();

        Karate k6 = new Karate();
        k6.beltLevel = 6;
        k6.studentName = "Sneha";
        k6.dojoName = "Iron Fist Dojo";
        k6.instructor = "Sensei Hiro";
        k6.isProfessional = false;
        k6.country = "Japan";
        k6.yearsOfTraining = 4;
        System.out.println("=== Karate 6 ===");
        k6.getKarateInfo();

        Karate k7 = new Karate();
        k7.beltLevel = 3;
        k7.studentName = "Arun";
        k7.dojoName = "Silent Warriors";
        k7.instructor = "Sensei Ken";
        k7.isProfessional = false;
        k7.country = "India";
        k7.yearsOfTraining = 2;
        System.out.println("=== Karate 7 ===");
        k7.getKarateInfo();

        Karate k8 = new Karate();
        k8.beltLevel = 4;
        k8.studentName = "Priya";
        k8.dojoName = "Urban Combat";
        k8.instructor = "Sensei Leena";
        k8.isProfessional = true;
        k8.country = "UK";
        k8.yearsOfTraining = 6;
        System.out.println("=== Karate 8 ===");
        k8.getKarateInfo();

        Karate k9 = new Karate();
        k9.beltLevel = 2;
        k9.studentName = "Nikhil";
        k9.dojoName = "Power Strike";
        k9.instructor = "Sensei Aravind";
        k9.isProfessional = false;
        k9.country = "India";
        k9.yearsOfTraining = 3;
        System.out.println("=== Karate 9 ===");
        k9.getKarateInfo();

        Karate k10 = new Karate();
        k10.beltLevel = 5;
        k10.studentName = "Meera";
        k10.dojoName = "Zen Dojo";
        k10.instructor = "Sensei Tanaka";
        k10.isProfessional = true;
        k10.country = "Japan";
        k10.yearsOfTraining = 7;
        System.out.println("=== Karate 10 ===");
        k10.getKarateInfo();

        Karate k11 = new Karate();
        k11.beltLevel = 1;
        k11.studentName = "Aman";
        k11.dojoName = "Crimson Tigers";
        k11.instructor = "Sensei Vikram";
        k11.isProfessional = false;
        k11.country = "India";
        k11.yearsOfTraining = 1;
        System.out.println("=== Karate 11 ===");
        k11.getKarateInfo();

        Karate k12 = new Karate();
        k12.beltLevel = 2;
        k12.studentName = "Divya";
        k12.dojoName = "White Dragons";
        k12.instructor = "Sensei Chen";
        k12.isProfessional = false;
        k12.country = "China";
        k12.yearsOfTraining = 2;
        System.out.println("=== Karate 12 ===");
        k12.getKarateInfo();

        Karate k13 = new Karate();
        k13.beltLevel = 3;
        k13.studentName = "Raj";
        k13.dojoName = "Street Fighters";
        k13.instructor = "Sensei Abdul";
        k13.isProfessional = true;
        k13.country = "UAE";
        k13.yearsOfTraining = 5;
        System.out.println("=== Karate 13 ===");
        k13.getKarateInfo();

        Karate k14 = new Karate();
        k14.beltLevel = 4;
        k14.studentName = "Sana";
        k14.dojoName = "Blitz Dojo";
        k14.instructor = "Sensei Rosa";
        k14.isProfessional = false;
        k14.country = "Brazil";
        k14.yearsOfTraining = 4;
        System.out.println("=== Karate 14 ===");
        k14.getKarateInfo();

        Karate k15 = new Karate();
        k15.beltLevel = 5;
        k15.studentName = "Farhan";
        k15.dojoName = "Red Phoenix";
        k15.instructor = "Sensei Omar";
        k15.isProfessional = true;
        k15.country = "Pakistan";
        k15.yearsOfTraining = 6;
        System.out.println("=== Karate 15 ===");
        k15.getKarateInfo();

        Karate k16 = new Karate();
        k16.beltLevel = 6;
        k16.studentName = "Rekha";
        k16.dojoName = "Urban Lions";
        k16.instructor = "Sensei Sato";
        k16.isProfessional = true;
        k16.country = "Japan";
        k16.yearsOfTraining = 8;
        System.out.println("=== Karate 16 ===");
        k16.getKarateInfo();

        Karate k17 = new Karate();
        k17.beltLevel = 1;
        k17.studentName = "Zaid";
        k17.dojoName = "Raging Storm";
        k17.instructor = "Sensei Noor";
        k17.isProfessional = false;
        k17.country = "India";
        k17.yearsOfTraining = 1;
        System.out.println("=== Karate 17 ===");
        k17.getKarateInfo();

        Karate k18 = new Karate();
        k18.beltLevel = 2;
        k18.studentName = "Lata";
        k18.dojoName = "Golden Eagles";
        k18.instructor = "Sensei Patel";
        k18.isProfessional = false;
        k18.country = "India";
        k18.yearsOfTraining = 2;
        System.out.println("=== Karate 18 ===");
        k18.getKarateInfo();

        Karate k19 = new Karate();
        k19.beltLevel = 3;
        k19.studentName = "Imran";
        k19.dojoName = "Shadow Warriors";
        k19.instructor = "Sensei Raghav";
        k19.isProfessional = true;
        k19.country = "India";
        k19.yearsOfTraining = 5;
        System.out.println("=== Karate 19 ===");
        k19.getKarateInfo();

        Karate k20 = new Karate();
        k20.beltLevel = 4;
        k20.studentName = "Anjali";
        k20.dojoName = "Fury Academy";
        k20.instructor = "Sensei Dev";
        k20.isProfessional = true;
        k20.country = "India";
        k20.yearsOfTraining = 6;
        System.out.println("=== Karate 20 ===");
        k20.getKarateInfo();*/