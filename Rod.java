class Rod {

    
    Rod() {
        System.out.println("Rod Constructor Involed");
    }

    Rod(int rodId, String material, double lengthInMeters, double weightInKg, String usage, String manufacturer, double price) {
        System.out.println("Rod Parameterized Constructor Invoked");
        this.rodId = rodId;
        this.material = material;
        this.lengthInMeters = lengthInMeters;
        this.weightInKg = weightInKg;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.price = price;
    }


	int rodId;
    String material;
    double lengthInMeters;
    double weightInKg;
    String usage;
    String manufacturer;
    double price;


    public void getRodInfo() {
        System.out.println("ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthInMeters + " meters");
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.println("Usage: " + usage);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: ₹" + price);
    }
}
