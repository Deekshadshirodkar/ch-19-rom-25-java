class InvitationCard {

    
    InvitationCard() {
        System.out.println("Invitation Card Constructor Invoked");
    }

    InvitationCard(int cardId, String eventType, String hostName, String venue, String date, String time, String cardTheme) {
        System.out.println("Invitation Card Parameterized Constructor Invoked");
        this.cardId = cardId;
        this.eventType = eventType;
        this.hostName = hostName;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.cardTheme = cardTheme;
    }
	
	int cardId;
    String eventType;
    String hostName;
    String venue;
    String date;
    String time;
    String cardTheme;


    public void getInvitationCardInfo() {
        System.out.println("ID: " + cardId);
        System.out.println("Event: " + eventType);
        System.out.println("Host: " + hostName);
        System.out.println("Venue: " + venue);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Theme: " + cardTheme);
    }
}
