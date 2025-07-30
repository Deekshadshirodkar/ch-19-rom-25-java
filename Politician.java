class Politician {

    
    Politician() {
        System.out.println("Politician Constructor Invoked");
    }

    Politician(int politicianId, String name, String party, String state, int age, boolean isCabinetMinister, String constituency) {
        System.out.println("Politician Parameterized Constructor Invoked");
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.state = state;
        this.age = age;
        this.isCabinetMinister = isCabinetMinister;
        this.constituency = constituency;
    }
	
	int politicianId;
    String name;
    String party;
    String state;
    int age;
    boolean isCabinetMinister;
    String constituency;


    public void getPoliticianInfo() {
        System.out.println("ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("State: " + state);
        System.out.println("Age: " + age);
        System.out.println("Cabinet Minister: " + isCabinetMinister);
        System.out.println("Constituency: " + constituency);
    }
}
