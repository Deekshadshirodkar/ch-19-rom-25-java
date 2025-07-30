class Coins {
    
    Coins() {
        System.out.println("Coins Constructor Invoked");
    }

    Coins(int coinId, double weight, String material, String country, int year, String color, boolean isCollectible) {
        System.out.println("Coins Parameterized Constructor Invoked");
        this.coinId = coinId;
        this.weight = weight;
        this.material = material;
        this.country = country;
        this.year = year;
        this.color = color;
        this.isCollectible = isCollectible;
    }
	
	int coinId;
    double weight;
    String material;
    String country;
    int year;
    String color;
    boolean isCollectible;


    public void getCoinInfo() {
        System.out.println("ID: " + coinId);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Material: " + material);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Collectible: " + isCollectible);
    }
}
