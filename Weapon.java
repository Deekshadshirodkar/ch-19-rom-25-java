class Weapon {

    
    Weapon() {
        System.out.println("Weapon Constructor Invoked");
    }

    Weapon(int weaponId, String name, String type, String material, double weight, double length, boolean isLicensed) {
        System.out.println("Weapon Parameterized Constructor Invoked");
        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.isLicensed = isLicensed;
    }

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
