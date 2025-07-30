class Blazzer {

    
    Blazzer() {
        System.out.println("Blazzer Constructor Invoked");
    }

    Blazzer(int blazzerId, String brand, String size, String color, String fabric, double price, boolean isFormal) {
        System.out.println("Blazzer Parameterized Constructor Invoked");
        this.blazzerId = blazzerId;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        this.isFormal = isFormal;
    }
	
	int blazzerId;
    String brand;
    String size;
    String color;
    String fabric;
    double price;
    boolean isFormal;


    public void getBlazzerInfo() {
        System.out.println("ID: " + blazzerId);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Fabric: " + fabric);
        System.out.println("Price: Rs." + price);
        System.out.println("Formal: " + isFormal);
    }
}
