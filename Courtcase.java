class Courtcase {

    int caseId;
    String caseTitle;
    String plaintiff;
    String defendant;
    String judge;
    String courtName;
    boolean isClosed;

    public void getCourtcaseInfo() {
		
        System.out.println("ID: " + caseId);
        System.out.println("Title: " + caseTitle);
        System.out.println("Plaintiff: " + plaintiff);
        System.out.println("Defendant: " + defendant);
        System.out.println("Judge: " + judge);
        System.out.println("Court: " + courtName);
        System.out.println("Closed: " + isClosed);
    }
}