class Fish {

    Fish() {
        System.out.println("Fish Constructor Invoked");
    }

    Fish(int fishId, String species, String color, double length, double weight, String habitat, boolean freshwater, String diet) {
        System.out.println("Fish Parameterized Constructor Invoked");
        this.fishId = fishId;
        this.species = species;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.habitat = habitat;
        this.freshwater = freshwater;
        this.diet = diet;
    }
	
	int fishId;
    String species;
    String color;
    double length;
    double weight;
    String habitat;
    boolean freshwater;
    String diet;

    public void getFishInfo() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Freshwater: " + freshwater);
        System.out.println("Diet: " + diet);
    }
}
