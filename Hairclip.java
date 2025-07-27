class Hairclip {

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
