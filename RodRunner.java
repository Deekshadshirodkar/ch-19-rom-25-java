class RodRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Rod rod1 = new Rod(1, "Steel", 2.5, 4.5, "Construction", "TATA Steel", 800.0);
        System.out.println("=== Rod 1 ===");
        rod1.getRodInfo();

        Rod rod2 = new Rod(2, "Iron", 3.0, 5.2, "Support Beam", "JSW", 950.0);
        System.out.println("=== Rod 2 ===");
        rod2.getRodInfo();

        Rod rod3 = new Rod(3, "Aluminium", 2.0, 2.8, "Tent Pole", "Hindalco", 600.0);
        System.out.println("=== Rod 3 ===");
        rod3.getRodInfo();

        Rod rod4 = new Rod(4, "Carbon Fiber", 1.5, 1.2, "Aerospace", "ISRO Suppliers", 1200.0);
        System.out.println("=== Rod 4 ===");
        rod4.getRodInfo();

        Rod rod5 = new Rod(5, "PVC", 2.0, 3.0, "Water Pipeline", "Supreme", 500.0);
        System.out.println("=== Rod 5 ===");
        rod5.getRodInfo();

        Rod rod6 = new Rod(6, "Stainless Steel", 2.2, 4.0, "Railings", "Jindal", 980.0);
        System.out.println("=== Rod 6 ===");
        rod6.getRodInfo();

        Rod rod7 = new Rod(7, "Brass", 1.8, 3.5, "Decorative", "BrassoTech", 750.0);
        System.out.println("=== Rod 7 ===");
        rod7.getRodInfo();

        Rod rod8 = new Rod(8, "Copper", 1.6, 4.1, "Electrical Grounding", "ElectroCore", 1100.0);
        System.out.println("=== Rod 8 ===");
        rod8.getRodInfo();

        Rod rod9 = new Rod(9, "Fiberglass", 2.1, 2.2, "Flag Pole", "FiberPro", 670.0);
        System.out.println("=== Rod 9 ===");
        rod9.getRodInfo();

        Rod rod10 = new Rod(10, "Titanium", 1.9, 3.1, "Medical Implants", "BioMetal Inc.", 2500.0);
        System.out.println("=== Rod 10 ===");
        rod10.getRodInfo();

        Rod rod11 = new Rod(11, "Cast Iron", 2.8, 6.0, "Fencing", "IronBuild", 1050.0);
        System.out.println("=== Rod 11 ===");
        rod11.getRodInfo();

        Rod rod12 = new Rod(12, "Nickel Alloy", 1.7, 2.6, "Heat Resistance", "AlloyTech", 1340.0);
        System.out.println("=== Rod 12 ===");
        rod12.getRodInfo();

        Rod rod13 = new Rod(13, "Galvanized Iron", 2.3, 4.4, "Scaffolding", "GalvaPro", 890.0);
        System.out.println("=== Rod 13 ===");
        rod13.getRodInfo();

        Rod rod14 = new Rod(14, "Plastic Coated", 2.0, 3.3, "Closet Rod", "ClosetCraft", 430.0);
        System.out.println("=== Rod 14 ===");
        rod14.getRodInfo();

        Rod rod15 = new Rod(15, "Mild Steel", 2.6, 5.0, "Fabrication", "MS Steel Ltd.", 720.0);
        System.out.println("=== Rod 15 ===");
        rod15.getRodInfo();

        Rod rod16 = new Rod(16, "Zinc-Coated", 1.5, 2.9, "Automobile", "ZincPlus", 890.0);
        System.out.println("=== Rod 16 ===");
        rod16.getRodInfo();

        Rod rod17 = new Rod(17, "Wooden", 1.8, 3.0, "Curtain Rod", "HomeDeco", 350.0);
        System.out.println("=== Rod 17 ===");
        rod17.getRodInfo();

        Rod rod18 = new Rod(18, "Plastic", 1.2, 1.5, "DIY Project", "CraftPro", 150.0);
        System.out.println("=== Rod 18 ===");
        rod18.getRodInfo();

        Rod rod19 = new Rod(19, "Reinforced Steel", 3.5, 6.5, "Pillars", "SteelWorks", 1200.0);
        System.out.println("=== Rod 19 ===");
        rod19.getRodInfo();

        Rod rod20 = new Rod(20, "Chromium Alloy", 2.2, 3.6, "Automotive Shaft", "AutoAlloy Ltd.", 1550.0);
        System.out.println("=== Rod 20 ===");
        rod20.getRodInfo();

        System.out.println("Main Ended");
    }
}


		/*Rod rod1 = new Rod();
        rod1.rodId = 1;
        rod1.material = "Steel";
        rod1.lengthInMeters = 2.5;
        rod1.weightInKg = 4.5;
        rod1.usage = "Construction";
        rod1.manufacturer = "TATA Steel";
        rod1.price = 800.0;
        System.out.println("=== Rod 1 ===");
        rod1.getRodInfo();

        Rod rod2 = new Rod();
        rod2.rodId = 2;
        rod2.material = "Iron";
        rod2.lengthInMeters = 3.0;
        rod2.weightInKg = 5.2;
        rod2.usage = "Support Beam";
        rod2.manufacturer = "JSW";
        rod2.price = 950.0;
        System.out.println("=== Rod 2 ===");
        rod2.getRodInfo();

        Rod rod3 = new Rod();
        rod3.rodId = 3;
        rod3.material = "Aluminium";
        rod3.lengthInMeters = 2.0;
        rod3.weightInKg = 2.8;
        rod3.usage = "Tent Pole";
        rod3.manufacturer = "Hindalco";
        rod3.price = 600.0;
        System.out.println("=== Rod 3 ===");
        rod3.getRodInfo();

        Rod rod4 = new Rod();
        rod4.rodId = 4;
        rod4.material = "Carbon Fiber";
        rod4.lengthInMeters = 1.5;
        rod4.weightInKg = 1.2;
        rod4.usage = "Aerospace";
        rod4.manufacturer = "ISRO Suppliers";
        rod4.price = 1200.0;
        System.out.println("=== Rod 4 ===");
        rod4.getRodInfo();

        Rod rod5 = new Rod();
        rod5.rodId = 5;
        rod5.material = "PVC";
        rod5.lengthInMeters = 2.0;
        rod5.weightInKg = 3.0;
        rod5.usage = "Water Pipeline";
        rod5.manufacturer = "Supreme";
        rod5.price = 500.0;
        System.out.println("=== Rod 5 ===");
        rod5.getRodInfo();

        Rod rod6 = new Rod();
        rod6.rodId = 6;
        rod6.material = "Stainless Steel";
        rod6.lengthInMeters = 2.2;
        rod6.weightInKg = 4.0;
        rod6.usage = "Railings";
        rod6.manufacturer = "Jindal";
        rod6.price = 980.0;
        System.out.println("=== Rod 6 ===");
        rod6.getRodInfo();

        Rod rod7 = new Rod();
        rod7.rodId = 7;
        rod7.material = "Brass";
        rod7.lengthInMeters = 1.8;
        rod7.weightInKg = 3.5;
        rod7.usage = "Decorative";
        rod7.manufacturer = "BrassoTech";
        rod7.price = 750.0;
        System.out.println("=== Rod 7 ===");
        rod7.getRodInfo();

        Rod rod8 = new Rod();
        rod8.rodId = 8;
        rod8.material = "Copper";
        rod8.lengthInMeters = 1.6;
        rod8.weightInKg = 4.1;
        rod8.usage = "Electrical Grounding";
        rod8.manufacturer = "ElectroCore";
        rod8.price = 1100.0;
        System.out.println("=== Rod 8 ===");
        rod8.getRodInfo();

        Rod rod9 = new Rod();
        rod9.rodId = 9;
        rod9.material = "Fiberglass";
        rod9.lengthInMeters = 2.1;
        rod9.weightInKg = 2.2;
        rod9.usage = "Flag Pole";
        rod9.manufacturer = "FiberPro";
        rod9.price = 670.0;
        System.out.println("=== Rod 9 ===");
        rod9.getRodInfo();

        Rod rod10 = new Rod();
        rod10.rodId = 10;
        rod10.material = "Titanium";
        rod10.lengthInMeters = 1.9;
        rod10.weightInKg = 3.1;
        rod10.usage = "Medical Implants";
        rod10.manufacturer = "BioMetal Inc.";
        rod10.price = 2500.0;
        System.out.println("=== Rod 10 ===");
        rod10.getRodInfo();

        Rod rod11 = new Rod();
        rod11.rodId = 11;
        rod11.material = "Cast Iron";
        rod11.lengthInMeters = 2.8;
        rod11.weightInKg = 6.0;
        rod11.usage = "Fencing";
        rod11.manufacturer = "IronBuild";
        rod11.price = 1050.0;
        System.out.println("=== Rod 11 ===");
        rod11.getRodInfo();

        Rod rod12 = new Rod();
        rod12.rodId = 12;
        rod12.material = "Nickel Alloy";
        rod12.lengthInMeters = 1.7;
        rod12.weightInKg = 2.6;
        rod12.usage = "Heat Resistance";
        rod12.manufacturer = "AlloyTech";
        rod12.price = 1340.0;
        System.out.println("=== Rod 12 ===");
        rod12.getRodInfo();

        Rod rod13 = new Rod();
        rod13.rodId = 13;
        rod13.material = "Galvanized Iron";
        rod13.lengthInMeters = 2.3;
        rod13.weightInKg = 4.4;
        rod13.usage = "Scaffolding";
        rod13.manufacturer = "GalvaPro";
        rod13.price = 890.0;
        System.out.println("=== Rod 13 ===");
        rod13.getRodInfo();

        Rod rod14 = new Rod();
        rod14.rodId = 14;
        rod14.material = "Plastic Coated";
        rod14.lengthInMeters = 2.0;
        rod14.weightInKg = 3.3;
        rod14.usage = "Closet Rod";
        rod14.manufacturer = "ClosetCraft";
        rod14.price = 430.0;
        System.out.println("=== Rod 14 ===");
        rod14.getRodInfo();

        Rod rod15 = new Rod();
        rod15.rodId = 15;
        rod15.material = "Mild Steel";
        rod15.lengthInMeters = 2.6;
        rod15.weightInKg = 5.0;
        rod15.usage = "Fabrication";
        rod15.manufacturer = "MS Steel Ltd.";
        rod15.price = 720.0;
        System.out.println("=== Rod 15 ===");
        rod15.getRodInfo();

        Rod rod16 = new Rod();
        rod16.rodId = 16;
        rod16.material = "Zinc-Coated";
        rod16.lengthInMeters = 1.5;
        rod16.weightInKg = 2.9;
        rod16.usage = "Automobile";
        rod16.manufacturer = "ZincPlus";
        rod16.price = 890.0;
        System.out.println("=== Rod 16 ===");
        rod16.getRodInfo();

        Rod rod17 = new Rod();
        rod17.rodId = 17;
        rod17.material = "Wooden";
        rod17.lengthInMeters = 1.8;
        rod17.weightInKg = 3.0;
        rod17.usage = "Curtain Rod";
        rod17.manufacturer = "HomeDeco";
        rod17.price = 350.0;
        System.out.println("=== Rod 17 ===");
        rod17.getRodInfo();

        Rod rod18 = new Rod();
        rod18.rodId = 18;
        rod18.material = "Plastic";
        rod18.lengthInMeters = 1.2;
        rod18.weightInKg = 1.5;
        rod18.usage = "DIY Project";
        rod18.manufacturer = "CraftPro";
        rod18.price = 150.0;
        System.out.println("=== Rod 18 ===");
        rod18.getRodInfo();

        Rod rod19 = new Rod();
        rod19.rodId = 19;
        rod19.material = "Reinforced Steel";
        rod19.lengthInMeters = 3.5;
        rod19.weightInKg = 6.5;
        rod19.usage = "Pillars";
        rod19.manufacturer = "SteelWorks";
        rod19.price = 1200.0;
        System.out.println("=== Rod 19 ===");
        rod19.getRodInfo();

        Rod rod20 = new Rod();
        rod20.rodId = 20;
        rod20.material = "Chromium Alloy";
        rod20.lengthInMeters = 2.2;
        rod20.weightInKg = 3.6;
        rod20.usage = "Automotive Shaft";
        rod20.manufacturer = "AutoAlloy Ltd.";
        rod20.price = 1550.0;
        System.out.println("=== Rod 20 ===");
        rod20.getRodInfo();*/