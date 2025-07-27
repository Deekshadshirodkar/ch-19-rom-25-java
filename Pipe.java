class Pipe {

    int pipeId;
    String material;
    double lengthInMeters;
    double diameterInInches;
    boolean isFlexible;
    String usageType;
    String color;

    public void getPipeInfo() {
		
        System.out.println("ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Length (m): " + lengthInMeters);
        System.out.println("Diameter (in): " + diameterInInches);
        System.out.println("Flexible: " + isFlexible);
        System.out.println("Usage: " + usageType);
        System.out.println("Color: " + color);
    }
}