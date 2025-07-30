class MarbleRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Marble m1 = new Marble("Blue", "Glass", 2.5, 5.0, "Smooth", true, "India");
        m1.getMarbleInfo();

        Marble m2 = new Marble("Green", "Agate", 3.0, 6.5, "Grainy", false, "China");
        m2.getMarbleInfo();

        Marble m3 = new Marble("Red", "Clay", 2.8, 4.5, "Rough", false, "USA");
        m3.getMarbleInfo();

        Marble m4 = new Marble("Yellow", "Glass", 2.2, 3.9, "Smooth", true, "Italy");
        m4.getMarbleInfo();

        Marble m5 = new Marble("Orange", "Stone", 2.0, 6.0, "Rough", false, "Brazil");
        m5.getMarbleInfo();

        Marble m6 = new Marble("White", "Glass", 2.3, 4.0, "Smooth", true, "France");
        m6.getMarbleInfo();

        Marble m7 = new Marble("Black", "Onyx", 3.1, 7.2, "Glossy", false, "Turkey");
        m7.getMarbleInfo();

        Marble m8 = new Marble("Purple", "Glass", 2.9, 5.5, "Smooth", true, "Japan");
        m8.getMarbleInfo();

        Marble m9 = new Marble("Pink", "Marble Stone", 2.7, 5.1, "Polished", false, "India");
        m9.getMarbleInfo();

        Marble m10 = new Marble("Grey", "Granite", 3.0, 6.3, "Matte", false, "Germany");
        m10.getMarbleInfo();

        Marble m11 = new Marble("Turquoise", "Ceramic", 2.6, 5.8, "Smooth", false, "China");
        m11.getMarbleInfo();

        Marble m12 = new Marble("Brown", "Stone", 2.1, 5.0, "Grainy", false, "Mexico");
        m12.getMarbleInfo();

        Marble m13 = new Marble("Gold", "Glass", 3.4, 7.0, "Glossy", true, "Dubai");
        m13.getMarbleInfo();

        Marble m14 = new Marble("Silver", "Crystal", 2.8, 6.4, "Shiny", true, "Austria");
        m14.getMarbleInfo();

        Marble m15 = new Marble("Navy Blue", "Glass", 2.2, 5.2, "Matte", true, "Netherlands");
        m15.getMarbleInfo();

        Marble m16 = new Marble("Beige", "Marble", 2.9, 6.1, "Smooth", false, "Egypt");
        m16.getMarbleInfo();

        Marble m17 = new Marble("Ivory", "Glass", 2.5, 4.7, "Polished", true, "USA");
        m17.getMarbleInfo();

        Marble m18 = new Marble("Sky Blue", "Glass", 3.0, 6.9, "Glossy", true, "South Korea");
        m18.getMarbleInfo();

        Marble m19 = new Marble("Mint Green", "Ceramic", 2.4, 5.5, "Matte", false, "Thailand");
        m19.getMarbleInfo();

        Marble m20 = new Marble("Copper", "Metallic", 3.2, 7.6, "Rough", false, "Russia");
        m20.getMarbleInfo();

        System.out.println("Main Ended");
    }
}


        /*Marble m1 = new Marble();
        m1.color = "Blue";
        m1.type = "Glass";
        m1.diameter = 2.5;
        m1.weight = 5.0;
        m1.texture = "Smooth";
        m1.transparent = true;
        m1.origin = "India";
        System.out.println("=== Marble 1 ===");
        m1.getMarbleInfo();

        Marble m2 = new Marble();
        m2.color = "Green";
        m2.type = "Agate";
        m2.diameter = 3.0;
        m2.weight = 6.5;
        m2.texture = "Grainy";
        m2.transparent = false;
        m2.origin = "China";
        System.out.println("=== Marble 2 ===");
        m2.getMarbleInfo();

        Marble m3 = new Marble();
        m3.color = "Red";
        m3.type = "Clay";
        m3.diameter = 2.8;
        m3.weight = 4.5;
        m3.texture = "Rough";
        m3.transparent = false;
        m3.origin = "USA";
        System.out.println("=== Marble 3 ===");
        m3.getMarbleInfo();

        Marble m4 = new Marble();
        m4.color = "Yellow";
        m4.type = "Glass";
        m4.diameter = 2.2;
        m4.weight = 3.9;
        m4.texture = "Smooth";
        m4.transparent = true;
        m4.origin = "Italy";
        System.out.println("=== Marble 4 ===");
        m4.getMarbleInfo();

        Marble m5 = new Marble();
        m5.color = "Orange";
        m5.type = "Stone";
        m5.diameter = 2.0;
        m5.weight = 6.0;
        m5.texture = "Rough";
        m5.transparent = false;
        m5.origin = "Brazil";
        System.out.println("=== Marble 5 ===");
        m5.getMarbleInfo();

        Marble m6 = new Marble();
        m6.color = "White";
        m6.type = "Glass";
        m6.diameter = 2.3;
        m6.weight = 4.0;
        m6.texture = "Smooth";
        m6.transparent = true;
        m6.origin = "France";
        System.out.println("=== Marble 6 ===");
        m6.getMarbleInfo();

        Marble m7 = new Marble();
        m7.color = "Black";
        m7.type = "Onyx";
        m7.diameter = 3.1;
        m7.weight = 7.2;
        m7.texture = "Glossy";
        m7.transparent = false;
        m7.origin = "Turkey";
        System.out.println("=== Marble 7 ===");
        m7.getMarbleInfo();

        Marble m8 = new Marble();
        m8.color = "Purple";
        m8.type = "Glass";
        m8.diameter = 2.9;
        m8.weight = 5.5;
        m8.texture = "Smooth";
        m8.transparent = true;
        m8.origin = "Japan";
        System.out.println("=== Marble 8 ===");
        m8.getMarbleInfo();

        Marble m9 = new Marble();
        m9.color = "Pink";
        m9.type = "Marble Stone";
        m9.diameter = 2.7;
        m9.weight = 5.1;
        m9.texture = "Polished";
        m9.transparent = false;
        m9.origin = "India";
        System.out.println("=== Marble 9 ===");
        m9.getMarbleInfo();

        Marble m10 = new Marble();
        m10.color = "Grey";
        m10.type = "Granite";
        m10.diameter = 3.0;
        m10.weight = 6.3;
        m10.texture = "Matte";
        m10.transparent = false;
        m10.origin = "Germany";
        System.out.println("=== Marble 10 ===");
        m10.getMarbleInfo();

        Marble m11 = new Marble();
        m11.color = "Turquoise";
        m11.type = "Ceramic";
        m11.diameter = 2.6;
        m11.weight = 5.8;
        m11.texture = "Smooth";
        m11.transparent = false;
        m11.origin = "China";
        System.out.println("=== Marble 11 ===");
        m11.getMarbleInfo();

        Marble m12 = new Marble();
        m12.color = "Brown";
        m12.type = "Stone";
        m12.diameter = 2.1;
        m12.weight = 5.0;
        m12.texture = "Grainy";
        m12.transparent = false;
        m12.origin = "Mexico";
        System.out.println("=== Marble 12 ===");
        m12.getMarbleInfo();

        Marble m13 = new Marble();
        m13.color = "Gold";
        m13.type = "Glass";
        m13.diameter = 3.4;
        m13.weight = 7.0;
        m13.texture = "Glossy";
        m13.transparent = true;
        m13.origin = "Dubai";
        System.out.println("=== Marble 13 ===");
        m13.getMarbleInfo();

        Marble m14 = new Marble();
        m14.color = "Silver";
        m14.type = "Crystal";
        m14.diameter = 2.8;
        m14.weight = 6.4;
        m14.texture = "Shiny";
        m14.transparent = true;
        m14.origin = "Austria";
        System.out.println("=== Marble 14 ===");
        m14.getMarbleInfo();

        Marble m15 = new Marble();
        m15.color = "Navy Blue";
        m15.type = "Glass";
        m15.diameter = 2.2;
        m15.weight = 5.2;
        m15.texture = "Matte";
        m15.transparent = true;
        m15.origin = "Netherlands";
        System.out.println("=== Marble 15 ===");
        m15.getMarbleInfo();

        Marble m16 = new Marble();
        m16.color = "Beige";
        m16.type = "Marble";
        m16.diameter = 2.9;
        m16.weight = 6.1;
        m16.texture = "Smooth";
        m16.transparent = false;
        m16.origin = "Egypt";
        System.out.println("=== Marble 16 ===");
        m16.getMarbleInfo();

        Marble m17 = new Marble();
        m17.color = "Ivory";
        m17.type = "Glass";
        m17.diameter = 2.5;
        m17.weight = 4.7;
        m17.texture = "Polished";
        m17.transparent = true;
        m17.origin = "USA";
        System.out.println("=== Marble 17 ===");
        m17.getMarbleInfo();

        Marble m18 = new Marble();
        m18.color = "Sky Blue";
        m18.type = "Glass";
        m18.diameter = 3.0;
        m18.weight = 6.9;
        m18.texture = "Glossy";
        m18.transparent = true;
        m18.origin = "South Korea";
        System.out.println("=== Marble 18 ===");
        m18.getMarbleInfo();

        Marble m19 = new Marble();
        m19.color = "Mint Green";
        m19.type = "Ceramic";
        m19.diameter = 2.4;
        m19.weight = 5.5;
        m19.texture = "Matte";
        m19.transparent = false;
        m19.origin = "Thailand";
        System.out.println("=== Marble 19 ===");
        m19.getMarbleInfo();

        Marble m20 = new Marble();
        m20.color = "Copper";
        m20.type = "Metallic";
        m20.diameter = 3.2;
        m20.weight = 7.6;
        m20.texture = "Rough";
        m20.transparent = false;
        m20.origin = "Russia";
        System.out.println("=== Marble 20 ===");
        m20.getMarbleInfo();*/
