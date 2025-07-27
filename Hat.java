class Hat {

    int hatId;
    String brand;
    String color;
    String material;
    String size;
    String style;
    double price;

    public void getHatInfo() {
		
        System.out.println("ID: " + hatId);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Style: " + style);
        System.out.println("Price: ₹" + price);
    }
}
