class Politician {

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
