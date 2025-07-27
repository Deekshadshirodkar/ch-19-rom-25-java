class Weapon {

    int weaponId;
    String name;
    String type;
    String material;
    double weight;
    double length;
    boolean isLicensed;

    public void getWeaponInfo() {
		
        System.out.println("ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Length (cm): " + length);
        System.out.println("Licensed: " + isLicensed);
    }
}
