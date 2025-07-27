class Flowers {

    int flowerId;
    String name;
    String color;
    boolean isFragrant;
    String bloomSeason;
    double petalLength;
    String origin;

    public void getFlowersInfo() {
		
        System.out.println("ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Fragrant: " + isFragrant);
        System.out.println("Season: " + bloomSeason);
        System.out.println("Petal Length: " + petalLength);
        System.out.println("Origin: " + origin);
    }
}
