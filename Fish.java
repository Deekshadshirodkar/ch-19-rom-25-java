class Fish {
	
    String species;
    String color;
    double length;
    double weight;
    String habitat;
    boolean freshwater;
    String diet;

    public void getFishInfo() {
		
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Freshwater: " + freshwater);
        System.out.println("Diet: " + diet);
    }
}