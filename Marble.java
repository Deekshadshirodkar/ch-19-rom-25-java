class Marble {

    
    Marble() {
        System.out.println("Marble Constructor Invoked");
    }

    Marble(String color, String type, double diameter, double weight, String texture, boolean transparent, String origin) {
        System.out.println("Marble Parameterized Constructor Invoked");
        this.color = color;
        this.type = type;
        this.diameter = diameter;
        this.weight = weight;
        this.texture = texture;
        this.transparent = transparent;
        this.origin = origin;
    }
	
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
