class Jewellery {
    int jewelleryId;
    String type;
    String material;
    double weight;
    String brand;
    String color;
    double price;

    public void getJewelleryInfo() {
        System.out.println("ID: " + jewelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
    }
}
