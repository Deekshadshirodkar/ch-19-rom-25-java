class GymEquipment {

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
