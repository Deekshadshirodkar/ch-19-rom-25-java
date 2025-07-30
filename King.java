class King {

    
    King() {
        System.out.println("King Constructor Invoked");
    }

    King(int kingId, String name, String kingdom, int reignStartYear, int reignEndYear, boolean isWarrior, String queenName) {
        System.out.println("King Parameterized Constructor Invoked");
        this.kingId = kingId;
        this.name = name;
        this.kingdom = kingdom;
        this.reignStartYear = reignStartYear;
        this.reignEndYear = reignEndYear;
        this.isWarrior = isWarrior;
        this.queenName = queenName;
    }

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
