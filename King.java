class King {

    int kingId;
    String name;
    String kingdom;
    int reignStartYear;
    int reignEndYear;
    boolean isWarrior;
    String queenName;

    public void getKingInfo() {
		
        System.out.println("ID: " + kingId);
        System.out.println("Name: " + name);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Start: " + reignStartYear);
        System.out.println("Reign End: " + reignEndYear);
        System.out.println("Warrior: " + isWarrior);
        System.out.println("Queen: " + queenName);
    }
}
