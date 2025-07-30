class CoinsRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Coins coin1 = new Coins(1, 5.0, "Copper", "India", 1990, "Brown", false);
        System.out.println("=== Coin 1 ===");
        coin1.getCoinInfo();

        Coins coin2 = new Coins(2, 2.5, "Aluminum", "India", 1985, "Silver", true);
        System.out.println("=== Coin 2 ===");
        coin2.getCoinInfo();

        Coins coin3 = new Coins(3, 6.0, "Nickel", "USA", 1978, "Grey", false);
        System.out.println("=== Coin 3 ===");
        coin3.getCoinInfo();

        Coins coin4 = new Coins(4, 10.0, "Silver", "UK", 1960, "Shiny Silver", true);
        System.out.println("=== Coin 4 ===");
        coin4.getCoinInfo();

        Coins coin5 = new Coins(5, 3.0, "Brass", "India", 2000, "Golden", false);
        System.out.println("=== Coin 5 ===");
        coin5.getCoinInfo();

        Coins coin6 = new Coins(6, 1.0, "Zinc", "Canada", 2010, "Silver", false);
        System.out.println("=== Coin 6 ===");
        coin6.getCoinInfo();

        Coins coin7 = new Coins(7, 4.5, "Bronze", "India", 1975, "Brown", true);
        System.out.println("=== Coin 7 ===");
        coin7.getCoinInfo();

        Coins coin8 = new Coins(8, 2.2, "Nickel", "USA", 2005, "Grey", false);
        System.out.println("=== Coin 8 ===");
        coin8.getCoinInfo();

        Coins coin9 = new Coins(9, 7.0, "Steel", "Germany", 1999, "Silver-Grey", true);
        System.out.println("=== Coin 9 ===");
        coin9.getCoinInfo();

        Coins coin10 = new Coins(10, 3.3, "Aluminum", "Japan", 2012, "Silver", false);
        System.out.println("=== Coin 10 ===");
        coin10.getCoinInfo();

        Coins coin11 = new Coins(11, 1.1, "Plastic", "Fantasy", 2023, "Transparent", true);
        System.out.println("=== Coin 11 ===");
        coin11.getCoinInfo();

        Coins coin12 = new Coins(12, 8.0, "Silver", "UK", 1980, "Shiny", true);
        System.out.println("=== Coin 12 ===");
        coin12.getCoinInfo();

        Coins coin13 = new Coins(13, 4.0, "Steel", "Russia", 1995, "Grey", false);
        System.out.println("=== Coin 13 ===");
        coin13.getCoinInfo();

        Coins coin14 = new Coins(14, 5.5, "Brass", "India", 2015, "Gold", true);
        System.out.println("=== Coin 14 ===");
        coin14.getCoinInfo();

        Coins coin15 = new Coins(15, 9.9, "Silver", "France", 1970, "Bright Silver", true);
        System.out.println("=== Coin 15 ===");
        coin15.getCoinInfo();

        Coins coin16 = new Coins(16, 2.8, "Copper", "USA", 1992, "Brown", false);
        System.out.println("=== Coin 16 ===");
        coin16.getCoinInfo();

        Coins coin17 = new Coins(17, 6.4, "Nickel", "Germany", 1988, "Grey", true);
        System.out.println("=== Coin 17 ===");
        coin17.getCoinInfo();

        Coins coin18 = new Coins(18, 1.9, "Aluminum", "India", 2008, "Silver", false);
        System.out.println("=== Coin 18 ===");
        coin18.getCoinInfo();

        Coins coin19 = new Coins(19, 10.5, "Silver", "USA", 1945, "Antique", true);
        System.out.println("=== Coin 19 ===");
        coin19.getCoinInfo();

        Coins coin20 = new Coins(20, 2.0, "Plastic", "FantasyLand", 2024, "Neon Blue", true);
        System.out.println("=== Coin 20 ===");
        coin20.getCoinInfo();

        System.out.println("Main Ended");
    }
}

		/*Coins coin1 = new Coins();
        coin1.coinId = 1;
        coin1.weight = 5.0;
        coin1.material = "Copper";
        coin1.country = "India";
        coin1.year = 1990;
        coin1.color = "Brown";
        coin1.isCollectible = false;
        System.out.println("=== Coin 1 ===");
        coin1.getCoinInfo();

        Coins coin2 = new Coins();
        coin2.coinId = 2;
        coin2.weight = 2.5;
        coin2.material = "Aluminum";
        coin2.country = "India";
        coin2.year = 1985;
        coin2.color = "Silver";
        coin2.isCollectible = true;
        System.out.println("=== Coin 2 ===");
        coin2.getCoinInfo();

        Coins coin3 = new Coins();
        coin3.coinId = 3;
        coin3.weight = 6.0;
        coin3.material = "Nickel";
        coin3.country = "USA";
        coin3.year = 1978;
        coin3.color = "Grey";
        coin3.isCollectible = false;
        System.out.println("=== Coin 3 ===");
        coin3.getCoinInfo();

        Coins coin4 = new Coins();
        coin4.coinId = 4;
        coin4.weight = 10.0;
        coin4.material = "Silver";
        coin4.country = "UK";
        coin4.year = 1960;
        coin4.color = "Shiny Silver";
        coin4.isCollectible = true;
        System.out.println("=== Coin 4 ===");
        coin4.getCoinInfo();

        Coins coin5 = new Coins();
        coin5.coinId = 5;
        coin5.weight = 3.0;
        coin5.material = "Brass";
        coin5.country = "India";
        coin5.year = 2000;
        coin5.color = "Golden";
        coin5.isCollectible = false;
        System.out.println("=== Coin 5 ===");
        coin5.getCoinInfo();

        Coins coin6 = new Coins();
        coin6.coinId = 6;
        coin6.weight = 1.0;
        coin6.material = "Zinc";
        coin6.country = "Canada";
        coin6.year = 2010;
        coin6.color = "Silver";
        coin6.isCollectible = false;
        System.out.println("=== Coin 6 ===");
        coin6.getCoinInfo();

        Coins coin7 = new Coins();
        coin7.coinId = 7;
        coin7.weight = 4.5;
        coin7.material = "Bronze";
        coin7.country = "India";
        coin7.year = 1975;
        coin7.color = "Brown";
        coin7.isCollectible = true;
        System.out.println("=== Coin 7 ===");
        coin7.getCoinInfo();

        Coins coin8 = new Coins();
        coin8.coinId = 8;
        coin8.weight = 2.2;
        coin8.material = "Nickel";
        coin8.country = "USA";
        coin8.year = 2005;
        coin8.color = "Grey";
        coin8.isCollectible = false;
        System.out.println("=== Coin 8 ===");
        coin8.getCoinInfo();

        Coins coin9 = new Coins();
        coin9.coinId = 9;
        coin9.weight = 7.0;
        coin9.material = "Steel";
        coin9.country = "Germany";
        coin9.year = 1999;
        coin9.color = "Silver-Grey";
        coin9.isCollectible = true;
        System.out.println("=== Coin 9 ===");
        coin9.getCoinInfo();

        Coins coin10 = new Coins();
        coin10.coinId = 10;
        coin10.weight = 3.3;
        coin10.material = "Aluminum";
        coin10.country = "Japan";
        coin10.year = 2012;
        coin10.color = "Silver";
        coin10.isCollectible = false;
        System.out.println("=== Coin 10 ===");
        coin10.getCoinInfo();

        Coins coin11 = new Coins();
        coin11.coinId = 11;
        coin11.weight = 1.1;
        coin11.material = "Plastic";
        coin11.country = "Fantasy";
        coin11.year = 2023;
        coin11.color = "Transparent";
        coin11.isCollectible = true;
        System.out.println("=== Coin 11 ===");
        coin11.getCoinInfo();

        Coins coin12 = new Coins();
        coin12.coinId = 12;
        coin12.weight = 8.0;
        coin12.material = "Silver";
        coin12.country = "UK";
        coin12.year = 1980;
        coin12.color = "Shiny";
        coin12.isCollectible = true;
        System.out.println("=== Coin 12 ===");
        coin12.getCoinInfo();

        Coins coin13 = new Coins();
        coin13.coinId = 13;
        coin13.weight = 4.0;
        coin13.material = "Steel";
        coin13.country = "Russia";
        coin13.year = 1995;
        coin13.color = "Grey";
        coin13.isCollectible = false;
        System.out.println("=== Coin 13 ===");
        coin13.getCoinInfo();

        Coins coin14 = new Coins();
        coin14.coinId = 14;
        coin14.weight = 5.5;
        coin14.material = "Brass";
        coin14.country = "India";
        coin14.year = 2015;
        coin14.color = "Gold";
        coin14.isCollectible = true;
        System.out.println("=== Coin 14 ===");
        coin14.getCoinInfo();

        Coins coin15 = new Coins();
        coin15.coinId = 15;
        coin15.weight = 9.9;
        coin15.material = "Silver";
        coin15.country = "France";
        coin15.year = 1970;
        coin15.color = "Bright Silver";
        coin15.isCollectible = true;
        System.out.println("=== Coin 15 ===");
        coin15.getCoinInfo();

        Coins coin16 = new Coins();
        coin16.coinId = 16;
        coin16.weight = 2.8;
        coin16.material = "Copper";
        coin16.country = "USA";
        coin16.year = 1992;
        coin16.color = "Brown";
        coin16.isCollectible = false;
        System.out.println("=== Coin 16 ===");
        coin16.getCoinInfo();

        Coins coin17 = new Coins();
        coin17.coinId = 17;
        coin17.weight = 6.4;
        coin17.material = "Nickel";
        coin17.country = "Germany";
        coin17.year = 1988;
        coin17.color = "Grey";
        coin17.isCollectible = true;
        System.out.println("=== Coin 17 ===");
        coin17.getCoinInfo();

        Coins coin18 = new Coins();
        coin18.coinId = 18;
        coin18.weight = 1.9;
        coin18.material = "Aluminum";
        coin18.country = "India";
        coin18.year = 2008;
        coin18.color = "Silver";
        coin18.isCollectible = false;
        System.out.println("=== Coin 18 ===");
        coin18.getCoinInfo();

        Coins coin19 = new Coins();
        coin19.coinId = 19;
        coin19.weight = 10.5;
        coin19.material = "Silver";
        coin19.country = "USA";
        coin19.year = 1945;
        coin19.color = "Antique";
        coin19.isCollectible = true;
        System.out.println("=== Coin 19 ===");
        coin19.getCoinInfo();

        Coins coin20 = new Coins();
        coin20.coinId = 20;
        coin20.weight = 2.0;
        coin20.material = "Plastic";
        coin20.country = "FantasyLand";
        coin20.year = 2024;
        coin20.color = "Neon Blue";
        coin20.isCollectible = true;
        System.out.println("=== Coin 20 ===");
        coin20.getCoinInfo();*/