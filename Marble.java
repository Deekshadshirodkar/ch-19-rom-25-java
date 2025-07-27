class Marble {

    String color;
    String type;
    double diameter; 
    double weight;   
    String texture;
    boolean transparent;
    String origin;

    public void getMarbleInfo() {
		
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Texture: " + texture);
        System.out.println("Transparent: " + transparent);
        System.out.println("Origin: " + origin);
    }
}
