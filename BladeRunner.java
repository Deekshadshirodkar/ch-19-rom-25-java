class BladeRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Blade blade1 = new Blade(1, "Gillette", "Twin Blade", "Stainless Steel", 49.99, true, "Shaving");
        /*Blade blade1 = new Blade();
        blade1.bladeId = 1;
        blade1.brand = "Gillette";
        blade1.bladeType = "Twin Blade";
        blade1.material = "Stainless Steel";
        blade1.price = 49.99;
        blade1.isDisposable = true;
        blade1.usage = "Shaving";*/
        System.out.println("=== Blade 1 ===");
        blade1.getBladeInfo();

        Blade blade2 = new Blade(2, "SuperMax", "Triple Blade", "Carbon Steel", 59.00, false, "Shaving");
        /*Blade blade2 = new Blade();
        blade2.bladeId = 2;
        blade2.brand = "SuperMax";
        blade2.bladeType = "Triple Blade";
        blade2.material = "Carbon Steel";
        blade2.price = 59.00;
        blade2.isDisposable = false;
        blade2.usage = "Shaving";*/
        System.out.println("=== Blade 2 ===");
        blade2.getBladeInfo();

        Blade blade3 = new Blade(3, "Wilkinson Sword", "Single Blade", "Titanium", 39.00, true, "Shaving");
        /*Blade blade3 = new Blade();
        blade3.bladeId = 3;
        blade3.brand = "Wilkinson Sword";
        blade3.bladeType = "Single Blade";
        blade3.material = "Titanium";
        blade3.price = 39.00;
        blade3.isDisposable = true;
        blade3.usage = "Shaving";*/
        System.out.println("=== Blade 3 ===");
        blade3.getBladeInfo();

        Blade blade4 = new Blade(4, "Dorco", "Five Blade", "Steel", 69.0, false, "Shaving");
        /*Blade blade4 = new Blade();
        blade4.bladeId = 4;
        blade4.brand = "Dorco";
        blade4.bladeType = "Five Blade";
        blade4.material = "Steel";
        blade4.price = 69.0;
        blade4.isDisposable = false;
        blade4.usage = "Shaving";*/
        System.out.println("=== Blade 4 ===");
        blade4.getBladeInfo();

        Blade blade5 = new Blade(5, "Feather", "Double Edge", "Platinum", 89.0, false, "Shaving");
        /*Blade blade5 = new Blade();
        blade5.bladeId = 5;
        blade5.brand = "Feather";
        blade5.bladeType = "Double Edge";
        blade5.material = "Platinum";
        blade5.price = 89.0;
        blade5.isDisposable = false;
        blade5.usage = "Shaving";*/
        System.out.println("=== Blade 5 ===");
        blade5.getBladeInfo();

        Blade blade6 = new Blade(6, "Bic", "Disposable", "Plastic + Steel", 29.99, true, "Shaving");
        /*Blade blade6 = new Blade();
        blade6.bladeId = 6;
        blade6.brand = "Bic";
        blade6.bladeType = "Disposable";
        blade6.material = "Plastic + Steel";
        blade6.price = 29.99;
        blade6.isDisposable = true;
        blade6.usage = "Shaving";*/
        System.out.println("=== Blade 6 ===");
        blade6.getBladeInfo();

        Blade blade7 = new Blade(7, "Dollar", "Single Blade", "Steel", 19.0, true, "Shaving");
        /*Blade blade7 = new Blade();
        blade7.bladeId = 7;
        blade7.brand = "Dollar";
        blade7.bladeType = "Single Blade";
        blade7.material = "Steel";
        blade7.price = 19.0;
        blade7.isDisposable = true;
        blade7.usage = "Shaving";*/
        System.out.println("=== Blade 7 ===");
        blade7.getBladeInfo();

        Blade blade8 = new Blade(8, "Laser", "Double Edge", "Stainless Steel", 45.0, false, "Shaving");
        /*Blade blade8 = new Blade();
        blade8.bladeId = 8;
        blade8.brand = "Laser";
        blade8.bladeType = "Double Edge";
        blade8.material = "Stainless Steel";
        blade8.price = 45.0;
        blade8.isDisposable = false;
        blade8.usage = "Shaving";*/
        System.out.println("=== Blade 8 ===");
        blade8.getBladeInfo();

        Blade blade9 = new Blade(9, "RazoRock", "Premium", "Titanium", 99.0, false, "Luxury Shaving");
        /*Blade blade9 = new Blade();
        blade9.bladeId = 9;
        blade9.brand = "RazoRock";
        blade9.bladeType = "Premium";
        blade9.material = "Titanium";
        blade9.price = 99.0;
        blade9.isDisposable = false;
        blade9.usage = "Luxury Shaving";*/
        System.out.println("=== Blade 9 ===");
        blade9.getBladeInfo();

        Blade blade10 = new Blade(10, "Shavette", "Barber Blade", "Carbon Steel", 75.5, true, "Professional Use");
        /*Blade blade10 = new Blade();
        blade10.bladeId = 10;
        blade10.brand = "Shavette";
        blade10.bladeType = "Barber Blade";
        blade10.material = "Carbon Steel";
        blade10.price = 75.5;
        blade10.isDisposable = true;
        blade10.usage = "Professional Use";*/
        System.out.println("=== Blade 10 ===");
        blade10.getBladeInfo();

        Blade blade11 = new Blade(11, "Merkur", "German Steel", "Steel", 109.0, false, "Shaving");
        /*Blade blade11 = new Blade();
        blade11.bladeId = 11;
        blade11.brand = "Merkur";
        blade11.bladeType = "German Steel";
        blade11.material = "Steel";
        blade11.price = 109.0;
        blade11.isDisposable = false;
        blade11.usage = "Shaving";*/
        System.out.println("=== Blade 11 ===");
        blade11.getBladeInfo();

        Blade blade12 = new Blade(12, "Persona", "Chrome", "Alloy Steel", 92.0, false, "Shaving");
        /*Blade blade12 = new Blade();
        blade12.bladeId = 12;
        blade12.brand = "Persona";
        blade12.bladeType = "Chrome";
        blade12.material = "Alloy Steel";
        blade12.price = 92.0;
        blade12.isDisposable = false;
        blade12.usage = "Shaving";*/
        System.out.println("=== Blade 12 ===");
        blade12.getBladeInfo();

        Blade blade13 = new Blade(13, "Parker", "Sharp Edge", "Carbon Alloy", 88.5, false, "Shaving");
        /*Blade blade13 = new Blade();
        blade13.bladeId = 13;
        blade13.brand = "Parker";
        blade13.bladeType = "Sharp Edge";
        blade13.material = "Carbon Alloy";
        blade13.price = 88.5;
        blade13.isDisposable = false;
        blade13.usage = "Shaving";*/
        System.out.println("=== Blade 13 ===");
        blade13.getBladeInfo();

        Blade blade14 = new Blade(14, "Derby", "Swedish Steel", "Stainless Steel", 67.0, true, "Shaving");
        /*Blade blade14 = new Blade();
        blade14.bladeId = 14;
        blade14.brand = "Derby";
        blade14.bladeType = "Swedish Steel";
        blade14.material = "Stainless Steel";
        blade14.price = 67.0;
        blade14.isDisposable = true;
        blade14.usage = "Shaving";*/
        System.out.println("=== Blade 14 ===");
        blade14.getBladeInfo();

        Blade blade15 = new Blade(15, "Treet", "Classic", "Steel", 59.0, false, "Shaving");
        /*Blade blade15 = new Blade();
        blade15.bladeId = 15;
        blade15.brand = "Treet";
        blade15.bladeType = "Classic";
        blade15.material = "Steel";
        blade15.price = 59.0;
        blade15.isDisposable = false;
        blade15.usage = "Shaving";*/
        System.out.println("=== Blade 15 ===");
        blade15.getBladeInfo();

        Blade blade16 = new Blade(16, "Kai", "Japanese Edge", "Titanium", 129.0, false, "Shaving");
        /*Blade blade16 = new Blade();
        blade16.bladeId = 16;
        blade16.brand = "Kai";
        blade16.bladeType = "Japanese Edge";
        blade16.material = "Titanium";
        blade16.price = 129.0;
        blade16.isDisposable = false;
        blade16.usage = "Shaving";*/
        System.out.println("=== Blade 16 ===");
        blade16.getBladeInfo();

        Blade blade17 = new Blade(17, "Astra", "Superior Platinum", "Platinum", 99.0, false, "Shaving");
        /*Blade blade17 = new Blade();
        blade17.bladeId = 17;
        blade17.brand = "Astra";
        blade17.bladeType = "Superior Platinum";
        blade17.material = "Platinum";
        blade17.price = 99.0;
        blade17.isDisposable = false;
        blade17.usage = "Shaving";*/
        System.out.println("=== Blade 17 ===");
        blade17.getBladeInfo();

        Blade blade18 = new Blade(18, "Croma", "Budget", "Plastic", 12.0, true, "Disposable Shaving");
        /*Blade blade18 = new Blade();
        blade18.bladeId = 18;
        blade18.brand = "Croma";
        blade18.bladeType = "Budget";
        blade18.material = "Plastic";
        blade18.price = 12.0;
        blade18.isDisposable = true;
        blade18.usage = "Disposable Shaving";*/
        System.out.println("=== Blade 18 ===");
        blade18.getBladeInfo();

        Blade blade19 = new Blade(19, "Harry's", "Precision", "Steel", 85.0, false, "Shaving");
        /*Blade blade19 = new Blade();
        blade19.bladeId = 19;
        blade19.brand = "Harry's";
        blade19.bladeType = "Precision";
        blade19.material = "Steel";
        blade19.price = 85.0;
        blade19.isDisposable = false;
        blade19.usage = "Shaving";*/
        System.out.println("=== Blade 19 ===");
        blade19.getBladeInfo();

        Blade blade20 = new Blade(20, "Dollar", "Budget", "Carbon", 20.0, true, "Quick Shave");
        /*Blade blade20 = new Blade();
        blade20.bladeId = 20;
        blade20.brand = "Dollar";
        blade20.bladeType = "Budget";
        blade20.material = "Carbon";
        blade20.price = 20.0;
        blade20.isDisposable = true;
        blade20.usage = "Quick Shave";*/
        System.out.println("=== Blade 20 ===");
        blade20.getBladeInfo();

        System.out.println("Main Ended");
    }
}