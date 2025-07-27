class Blade {

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