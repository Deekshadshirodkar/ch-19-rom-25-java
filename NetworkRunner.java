class NetworkRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Network network1 = new Network();
        network1.networkId = 1;
        network1.provider = "Jio";
        network1.type = "Mobile";
        network1.speedMbps = 150.0;
        network1.frequencyGHz = 2.3;
        network1.is5G = true;
        network1.region = "India";
        System.out.println("=== Network 1 ===");
        network1.getNetworkInfo();

        Network network2 = new Network();
        network2.networkId = 2;
        network2.provider = "Airtel";
        network2.type = "Fiber";
        network2.speedMbps = 200.0;
        network2.frequencyGHz = 2.4;
        network2.is5G = false;
        network2.region = "India";
        System.out.println("=== Network 2 ===");
        network2.getNetworkInfo();

        Network network3 = new Network();
        network3.networkId = 3;
        network3.provider = "Vi";
        network3.type = "Mobile";
        network3.speedMbps = 90.5;
        network3.frequencyGHz = 1.8;
        network3.is5G = false;
        network3.region = "India";
        System.out.println("=== Network 3 ===");
        network3.getNetworkInfo();

        Network network4 = new Network();
        network4.networkId = 4;
        network4.provider = "BSNL";
        network4.type = "Broadband";
        network4.speedMbps = 50.0;
        network4.frequencyGHz = 2.0;
        network4.is5G = false;
        network4.region = "India";
        System.out.println("=== Network 4 ===");
        network4.getNetworkInfo();

        Network network5 = new Network();
        network5.networkId = 5;
        network5.provider = "ACT";
        network5.type = "Fiber";
        network5.speedMbps = 300.0;
        network5.frequencyGHz = 5.0;
        network5.is5G = false;
        network5.region = "Bangalore";
        System.out.println("=== Network 5 ===");
        network5.getNetworkInfo();

        Network network6 = new Network();
        network6.networkId = 6;
        network6.provider = "Hathway";
        network6.type = "Cable Broadband";
        network6.speedMbps = 40.0;
        network6.frequencyGHz = 2.2;
        network6.is5G = false;
        network6.region = "Mumbai";
        System.out.println("=== Network 6 ===");
        network6.getNetworkInfo();

        Network network7 = new Network();
        network7.networkId = 7;
        network7.provider = "Spectra";
        network7.type = "Fiber";
        network7.speedMbps = 250.0;
        network7.frequencyGHz = 5.0;
        network7.is5G = false;
        network7.region = "Delhi";
        System.out.println("=== Network 7 ===");
        network7.getNetworkInfo();

        Network network8 = new Network();
        network8.networkId = 8;
        network8.provider = "Excitel";
        network8.type = "Fiber";
        network8.speedMbps = 100.0;
        network8.frequencyGHz = 2.5;
        network8.is5G = false;
        network8.region = "Chennai";
        System.out.println("=== Network 8 ===");
        network8.getNetworkInfo();

        Network network9 = new Network();
        network9.networkId = 9;
        network9.provider = "MTNL";
        network9.type = "Broadband";
        network9.speedMbps = 20.0;
        network9.frequencyGHz = 2.0;
        network9.is5G = false;
        network9.region = "Delhi";
        System.out.println("=== Network 9 ===");
        network9.getNetworkInfo();

        Network network10 = new Network();
        network10.networkId = 10;
        network10.provider = "Tata Sky";
        network10.type = "Wi-Fi";
        network10.speedMbps = 120.0;
        network10.frequencyGHz = 2.4;
        network10.is5G = false;
        network10.region = "Mumbai";
        System.out.println("=== Network 10 ===");
        network10.getNetworkInfo();

        Network network11 = new Network();
        network11.networkId = 11;
        network11.provider = "Jio Fiber";
        network11.type = "Fiber";
        network11.speedMbps = 300.0;
        network11.frequencyGHz = 5.0;
        network11.is5G = true;
        network11.region = "Pune";
        System.out.println("=== Network 11 ===");
        network11.getNetworkInfo();

        Network network12 = new Network();
        network12.networkId = 12;
        network12.provider = "Airtel 5G";
        network12.type = "Mobile";
        network12.speedMbps = 500.0;
        network12.frequencyGHz = 3.5;
        network12.is5G = true;
        network12.region = "Hyderabad";
        System.out.println("=== Network 12 ===");
        network12.getNetworkInfo();

        Network network13 = new Network();
        network13.networkId = 13;
        network13.provider = "RailWire";
        network13.type = "Broadband";
        network13.speedMbps = 100.0;
        network13.frequencyGHz = 2.0;
        network13.is5G = false;
        network13.region = "Kerala";
        System.out.println("=== Network 13 ===");
        network13.getNetworkInfo();

        Network network14 = new Network();
        network14.networkId = 14;
        network14.provider = "Netplus";
        network14.type = "Fiber";
        network14.speedMbps = 150.0;
        network14.frequencyGHz = 2.5;
        network14.is5G = false;
        network14.region = "Punjab";
        System.out.println("=== Network 14 ===");
        network14.getNetworkInfo();

        Network network15 = new Network();
        network15.networkId = 15;
        network15.provider = "GTPL";
        network15.type = "Cable";
        network15.speedMbps = 70.0;
        network15.frequencyGHz = 2.3;
        network15.is5G = false;
        network15.region = "Ahmedabad";
        System.out.println("=== Network 15 ===");
        network15.getNetworkInfo();

        Network network16 = new Network();
        network16.networkId = 16;
        network16.provider = "Den Broadband";
        network16.type = "Cable";
        network16.speedMbps = 60.0;
        network16.frequencyGHz = 2.1;
        network16.is5G = false;
        network16.region = "Jaipur";
        System.out.println("=== Network 16 ===");
        network16.getNetworkInfo();

        Network network17 = new Network();
        network17.networkId = 17;
        network17.provider = "Tikona";
        network17.type = "Wireless";
        network17.speedMbps = 25.0;
        network17.frequencyGHz = 2.0;
        network17.is5G = false;
        network17.region = "Bangalore";
        System.out.println("=== Network 17 ===");
        network17.getNetworkInfo();

        Network network18 = new Network();
        network18.networkId = 18;
        network18.provider = "You Broadband";
        network18.type = "Fiber";
        network18.speedMbps = 150.0;
        network18.frequencyGHz = 2.5;
        network18.is5G = false;
        network18.region = "Pune";
        System.out.println("=== Network 18 ===");
        network18.getNetworkInfo();

        Network network19 = new Network();
        network19.networkId = 19;
        network19.provider = "Siti Network";
        network19.type = "Cable";
        network19.speedMbps = 30.0;
        network19.frequencyGHz = 2.2;
        network19.is5G = false;
        network19.region = "Nagpur";
        System.out.println("=== Network 19 ===");
        network19.getNetworkInfo();

        Network network20 = new Network();
        network20.networkId = 20;
        network20.provider = "Aircel";
        network20.type = "Mobile";
        network20.speedMbps = 10.0;
        network20.frequencyGHz = 1.9;
        network20.is5G = false;
        network20.region = "Chennai";
        System.out.println("=== Network 20 ===");
        network20.getNetworkInfo();

        System.out.println("Main Ended");
    }
}
