class Hairclip {

    

    Hairclip() {
        System.out.println("Hairclip Constructor Invoked");
    }

    Hairclip(int clipId, String brand, String color, String type, String material, double price, boolean isDecorative) {
        System.out.println("Hairclip Parameterized Constructor Invoked");
        this.clipId = clipId;
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.isDecorative = isDecorative;
    }
	
	int clipId;
    String brand;
    String color;
    String type;
    String material;
    double price;
    boolean isDecorative;

    public void getHairclipInfo() {
        System.out.println("ID: " + clipId);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Decorative: " + isDecorative);
    }
}