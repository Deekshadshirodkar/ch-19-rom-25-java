class Hat {

    
    Hat() {
        System.out.println("Hat Constructor Invoked");
    }

    Hat(int hatId, String brand, String color, String material, String size, String style, double price) {
        System.out.println("Hat Parameterized Constructor Invoked");
        this.hatId = hatId;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.size = size;
        this.style = style;
        this.price = price;
    }
	
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
