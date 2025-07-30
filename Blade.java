class Blade {

   

    Blade() {
        System.out.println("Blade Constructor Invoked");
    }

    Blade(int bladeId, String brand, String bladeType, String material, double price, boolean isDisposable, String usage) {
        System.out.println("Blade Parameterized Constructor Invoked");
        this.bladeId = bladeId;
        this.brand = brand;
        this.bladeType = bladeType;
        this.material = material;
        this.price = price;
        this.isDisposable = isDisposable;
        this.usage = usage;
    }
	
	int bladeId;
    String brand;
    String bladeType;
    String material;
    double price;
    boolean isDisposable;
    String usage;

    public void getBladeInfo() {
        System.out.println("ID: " + bladeId);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + bladeType);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Disposable: " + isDisposable);
        System.out.println("Usage: " + usage);
    }
}
