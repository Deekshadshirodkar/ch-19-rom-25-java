class GymEquipment {

    
    GymEquipment() {
        System.out.println("Gym Equipment Constructor Invoked");
    }

    GymEquipment(int equipmentId, String name, String brand, String category, double weight, double price, boolean isElectric) {
        System.out.println("Gym Equipment Parameterized Constructor Invoked");
        this.equipmentId = equipmentId;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.isElectric = isElectric;
    }
	
	int equipmentId;
    String name;
    String brand;
    String category;
    double weight;
    double price;
    boolean isElectric;


    public void getGymEquipmentInfo() {
        System.out.println("ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println("Weight: " + weight);
        System.out.println("Price: ₹" + price);
        System.out.println("Electric: " + isElectric);
    }
}
