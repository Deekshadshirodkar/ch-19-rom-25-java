class Jewellery {

    
    Jewellery() {
        System.out.println("Jewellery Constructor Invoked");
    }

    Jewellery(int jewelleryId, String type, String material, double weight, String brand, String color, double price) {
        System.out.println("Jewellery Parameterized Constructor Invoked");
        this.jewelleryId = jewelleryId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
	
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
