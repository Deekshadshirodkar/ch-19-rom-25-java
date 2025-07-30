class Crackers {

    
    Crackers() {
        System.out.println("Crackers Constructor Called");
    }

    Crackers(int crackerId, String name, String type, String color, boolean isLoud, int price, String manufacturer) {
        System.out.println("Crackers Parameterized Constructor Called");
        this.crackerId = crackerId;
        this.name = name;
        this.type = type;
        this.color = color;
        this.isLoud = isLoud;
        this.price = price;
        this.manufacturer = manufacturer;
    }
	
	int crackerId;
    String name;
    String type;
    String color;
    boolean isLoud;
    int price;
    String manufacturer;


    public void getCrackersInfo() {
        System.out.println("ID: " + crackerId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Loud: " + isLoud);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
