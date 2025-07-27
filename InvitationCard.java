class InvitationCard {

    int cardId;
    String eventType;
    String hostName;
    String venue;
    String date;
    String time;
    String cardTheme;

    public void displayCardInfo() {
		
        System.out.println("ID: " + cardId);
        System.out.println("Event: " + eventType);
        System.out.println("Host: " + hostName);
        System.out.println("Venue: " + venue);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Theme: " + cardTheme);
    }
}
