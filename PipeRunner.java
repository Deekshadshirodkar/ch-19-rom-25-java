class PipeRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Pipe pipe1 = new Pipe();
        pipe1.pipeId = 1;
        pipe1.material = "PVC";
        pipe1.lengthInMeters = 3.0;
        pipe1.diameterInInches = 2.5;
        pipe1.isFlexible = false;
        pipe1.usageType = "Water Supply";
        pipe1.color = "White";
        System.out.println("=== Pipe 1 ===");
        pipe1.getPipeInfo();

        Pipe pipe2 = new Pipe();
        pipe2.pipeId = 2;
        pipe2.material = "Steel";
        pipe2.lengthInMeters = 6.0;
        pipe2.diameterInInches = 3.0;
        pipe2.isFlexible = false;
        pipe2.usageType = "Gas Pipeline";
        pipe2.color = "Silver";
        System.out.println("=== Pipe 2 ===");
        pipe2.getPipeInfo();

        Pipe pipe3 = new Pipe();
        pipe3.pipeId = 3;
        pipe3.material = "Copper";
        pipe3.lengthInMeters = 2.5;
        pipe3.diameterInInches = 1.5;
        pipe3.isFlexible = false;
        pipe3.usageType = "Electrical Conduit";
        pipe3.color = "Copper Red";
        System.out.println("=== Pipe 3 ===");
        pipe3.getPipeInfo();

        Pipe pipe4 = new Pipe();
        pipe4.pipeId = 4;
        pipe4.material = "Rubber";
        pipe4.lengthInMeters = 1.0;
        pipe4.diameterInInches = 0.5;
        pipe4.isFlexible = true;
        pipe4.usageType = "Drainage";
        pipe4.color = "Black";
        System.out.println("=== Pipe 4 ===");
        pipe4.getPipeInfo();

        Pipe pipe5 = new Pipe();
        pipe5.pipeId = 5;
        pipe5.material = "Plastic";
        pipe5.lengthInMeters = 4.5;
        pipe5.diameterInInches = 2.0;
        pipe5.isFlexible = true;
        pipe5.usageType = "Garden Hose";
        pipe5.color = "Green";
        System.out.println("=== Pipe 5 ===");
        pipe5.getPipeInfo();

        Pipe pipe6 = new Pipe();
        pipe6.pipeId = 6;
        pipe6.material = "Aluminum";
        pipe6.lengthInMeters = 3.2;
        pipe6.diameterInInches = 1.0;
        pipe6.isFlexible = false;
        pipe6.usageType = "Exhaust";
        pipe6.color = "Gray";
        System.out.println("=== Pipe 6 ===");
        pipe6.getPipeInfo();

        Pipe pipe7 = new Pipe();
        pipe7.pipeId = 7;
        pipe7.material = "Fiber";
        pipe7.lengthInMeters = 5.0;
        pipe7.diameterInInches = 1.8;
        pipe7.isFlexible = false;
        pipe7.usageType = "Cable Casing";
        pipe7.color = "Blue";
        System.out.println("=== Pipe 7 ===");
        pipe7.getPipeInfo();

        Pipe pipe8 = new Pipe();
        pipe8.pipeId = 8;
        pipe8.material = "PVC";
        pipe8.lengthInMeters = 2.0;
        pipe8.diameterInInches = 1.2;
        pipe8.isFlexible = true;
        pipe8.usageType = "Irrigation";
        pipe8.color = "White";
        System.out.println("=== Pipe 8 ===");
        pipe8.getPipeInfo();

        Pipe pipe9 = new Pipe();
        pipe9.pipeId = 9;
        pipe9.material = "Iron";
        pipe9.lengthInMeters = 6.0;
        pipe9.diameterInInches = 4.0;
        pipe9.isFlexible = false;
        pipe9.usageType = "Sewerage";
        pipe9.color = "Rust Brown";
        System.out.println("=== Pipe 9 ===");
        pipe9.getPipeInfo();

        Pipe pipe10 = new Pipe();
        pipe10.pipeId = 10;
        pipe10.material = "Plastic";
        pipe10.lengthInMeters = 2.2;
        pipe10.diameterInInches = 0.75;
        pipe10.isFlexible = true;
        pipe10.usageType = "Air Duct";
        pipe10.color = "Yellow";
        System.out.println("=== Pipe 10 ===");
        pipe10.getPipeInfo();

        Pipe pipe11 = new Pipe();
        pipe11.pipeId = 11;
        pipe11.material = "PVC";
        pipe11.lengthInMeters = 1.5;
        pipe11.diameterInInches = 0.5;
        pipe11.isFlexible = true;
        pipe11.usageType = "Bathroom Fitting";
        pipe11.color = "Cream";
        System.out.println("=== Pipe 11 ===");
        pipe11.getPipeInfo();

        Pipe pipe12 = new Pipe();
        pipe12.pipeId = 12;
        pipe12.material = "Steel";
        pipe12.lengthInMeters = 7.5;
        pipe12.diameterInInches = 3.2;
        pipe12.isFlexible = false;
        pipe12.usageType = "Construction";
        pipe12.color = "Silver";
        System.out.println("=== Pipe 12 ===");
        pipe12.getPipeInfo();

        Pipe pipe13 = new Pipe();
        pipe13.pipeId = 13;
        pipe13.material = "Rubber";
        pipe13.lengthInMeters = 1.8;
        pipe13.diameterInInches = 1.1;
        pipe13.isFlexible = true;
        pipe13.usageType = "Automotive Hose";
        pipe13.color = "Red";
        System.out.println("=== Pipe 13 ===");
        pipe13.getPipeInfo();

        Pipe pipe14 = new Pipe();
        pipe14.pipeId = 14;
        pipe14.material = "Copper";
        pipe14.lengthInMeters = 2.8;
        pipe14.diameterInInches = 2.0;
        pipe14.isFlexible = false;
        pipe14.usageType = "Air Conditioner Tube";
        pipe14.color = "Golden Brown";
        System.out.println("=== Pipe 14 ===");
        pipe14.getPipeInfo();

        Pipe pipe15 = new Pipe();
        pipe15.pipeId = 15;
        pipe15.material = "PVC";
        pipe15.lengthInMeters = 5.5;
        pipe15.diameterInInches = 3.0;
        pipe15.isFlexible = false;
        pipe15.usageType = "Sump Outlet";
        pipe15.color = "White";
        System.out.println("=== Pipe 15 ===");
        pipe15.getPipeInfo();

        Pipe pipe16 = new Pipe();
        pipe16.pipeId = 16;
        pipe16.material = "Plastic";
        pipe16.lengthInMeters = 3.8;
        pipe16.diameterInInches = 1.9;
        pipe16.isFlexible = true;
        pipe16.usageType = "Aquarium Pump";
        pipe16.color = "Transparent";
        System.out.println("=== Pipe 16 ===");
        pipe16.getPipeInfo();

        Pipe pipe17 = new Pipe();
        pipe17.pipeId = 17;
        pipe17.material = "Steel";
        pipe17.lengthInMeters = 8.0;
        pipe17.diameterInInches = 4.5;
        pipe17.isFlexible = false;
        pipe17.usageType = "Oil Refinery";
        pipe17.color = "Steel Gray";
        System.out.println("=== Pipe 17 ===");
        pipe17.getPipeInfo();

        Pipe pipe18 = new Pipe();
        pipe18.pipeId = 18;
        pipe18.material = "Copper";
        pipe18.lengthInMeters = 2.0;
        pipe18.diameterInInches = 1.3;
        pipe18.isFlexible = true;
        pipe18.usageType = "Fridge Coil";
        pipe18.color = "Reddish Brown";
        System.out.println("=== Pipe 18 ===");
        pipe18.getPipeInfo();

        Pipe pipe19 = new Pipe();
        pipe19.pipeId = 19;
        pipe19.material = "Fiber";
        pipe19.lengthInMeters = 4.0;
        pipe19.diameterInInches = 2.4;
        pipe19.isFlexible = false;
        pipe19.usageType = "Data Conduit";
        pipe19.color = "Orange";
        System.out.println("=== Pipe 19 ===");
        pipe19.getPipeInfo();

        Pipe pipe20 = new Pipe();
        pipe20.pipeId = 20;
        pipe20.material = "PVC";
        pipe20.lengthInMeters = 3.5;
        pipe20.diameterInInches = 1.7;
        pipe20.isFlexible = false;
        pipe20.usageType = "Rain Water";
        pipe20.color = "Gray";
        System.out.println("=== Pipe 20 ===");
        pipe20.getPipeInfo();

        System.out.println("Main Ended");
    }
}