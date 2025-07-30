class InvitationCardRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        InvitationCard card1 = new InvitationCard(1, "Wedding", "Rahul & Anjali", "Taj West End, Bengaluru", "25-12-2025", "6:00 PM", "Floral Gold");
        card1.getInvitationCardInfo();

        InvitationCard card2 = new InvitationCard(2, "Birthday", "Aarav", "Wonderland Hall, Mumbai", "15-08-2025", "4:00 PM", "Cartoon Theme");
        card2.getInvitationCardInfo();

        InvitationCard card3 = new InvitationCard(3, "Housewarming", "Mr. & Mrs. Sharma", "Jayanagar, Bengaluru", "01-11-2025", "11:00 AM", "Traditional Pooja");
        card3.getInvitationCardInfo();

        InvitationCard card4 = new InvitationCard(4, "Engagement", "Karan & Priya", "Leela Palace, Delhi", "18-09-2025", "7:00 PM", "Elegant Pastel");
        card4.getInvitationCardInfo();

        InvitationCard card5 = new InvitationCard(5, "Baby Shower", "Megha", "JP Nagar, Bengaluru", "05-10-2025", "12:30 PM", "Baby Blue & Pink");
        card5.getInvitationCardInfo();

        InvitationCard card6 = new InvitationCard(6, "Retirement", "Mr. Ramesh Kumar", "Club House, Hyderabad", "30-11-2025", "5:00 PM", "Golden Years");
        card6.getInvitationCardInfo();

        InvitationCard card7 = new InvitationCard(7, "Graduation", "Neha Verma", "St. Xavier's Auditorium, Mumbai", "10-06-2025", "3:00 PM", "Cap & Gown");
        card7.getInvitationCardInfo();

        InvitationCard card8 = new InvitationCard(8, "Anniversary", "Ravi & Sita", "Marriott Hotel, Chennai", "14-02-2025", "8:00 PM", "Romantic Red");
        card8.getInvitationCardInfo();

        InvitationCard card9 = new InvitationCard(9, "Naming Ceremony", "The Patil Family", "Sankranti Hall, Pune", "21-03-2025", "10:00 AM", "Traditional Baby");
        card9.getInvitationCardInfo();

        InvitationCard card10 = new InvitationCard(10, "Farewell", "Class of 2025", "College Lawn, Bhopal", "05-04-2025", "6:30 PM", "Memories & Laughter");
        card10.getInvitationCardInfo();

        InvitationCard card11 = new InvitationCard(11, "Festival Party", "Residents' Association", "Community Center, Noida", "02-10-2025", "5:30 PM", "Diwali Sparkle");
        card11.getInvitationCardInfo();

        InvitationCard card12 = new InvitationCard(12, "Kitty Party", "Ladies Club", "Garden View Café, Jaipur", "12-08-2025", "2:00 PM", "Peach Blossom");
        card12.getInvitationCardInfo();

        InvitationCard card13 = new InvitationCard(13, "Sports Day", "Greenfield School", "Sports Ground, Lucknow", "20-01-2025", "9:00 AM", "Victory Colors");
        card13.getInvitationCardInfo();

        InvitationCard card14 = new InvitationCard(14, "Music Concert", "Yuva Rocks", "Open Arena, Kolkata", "30-07-2025", "7:00 PM", "Electric Beats");
        card14.getInvitationCardInfo();

        InvitationCard card15 = new InvitationCard(15, "Dance Showcase", "Rhythm Academy", "Auditorium, Nagpur", "12-09-2025", "6:30 PM", "Grace & Glam");
        card15.getInvitationCardInfo();

        InvitationCard card16 = new InvitationCard(16, "Art Exhibition", "Fine Arts Dept.", "Art Gallery, Kochi", "03-03-2025", "11:00 AM", "Brush Strokes");
        card16.getInvitationCardInfo();

        InvitationCard card17 = new InvitationCard(17, "Science Fair", "XYZ School", "Exhibition Hall, Patna", "17-07-2025", "10:00 AM", "Innovative Minds");
        card17.getInvitationCardInfo();

        InvitationCard card18 = new InvitationCard(18, "Literature Fest", "Readers Club", "Library Hall, Chandigarh", "23-04-2025", "4:00 PM", "Book Haven");
        card18.getInvitationCardInfo();

        InvitationCard card19 = new InvitationCard(19, "Cooking Contest", "Foodie Group", "Kitchen Studio, Surat", "29-05-2025", "1:00 PM", "Spice & Style");
        card19.getInvitationCardInfo();

        InvitationCard card20 = new InvitationCard(20, "Startup Pitch", "Entrepreneur Club", "Tech Hub, Bengaluru", "11-11-2025", "10:30 AM", "Innovation Blue");
        card20.getInvitationCardInfo();

        System.out.println("Main Ended");
    }
}



        /*InvitationCard card1 = new InvitationCard();
        card1.cardId = 1;
        card1.eventType = "Wedding";
        card1.hostName = "Rahul & Anjali";
        card1.venue = "Taj West End, Bengaluru";
        card1.date = "25-12-2025";
        card1.time = "6:00 PM";
        card1.cardTheme = "Floral Gold";
        System.out.println("=== Invitation Card 1 ===");
        card1.displayCardInfo();

        InvitationCard card2 = new InvitationCard();
        card2.cardId = 2;
        card2.eventType = "Birthday";
        card2.hostName = "Aarav";
        card2.venue = "Wonderland Hall, Mumbai";
        card2.date = "15-08-2025";
        card2.time = "4:00 PM";
        card2.cardTheme = "Cartoon Theme";
        System.out.println("=== Invitation Card 2 ===");
        card2.displayCardInfo();

        InvitationCard card3 = new InvitationCard();
        card3.cardId = 3;
        card3.eventType = "Housewarming";
        card3.hostName = "Mr. & Mrs. Sharma";
        card3.venue = "Jayanagar, Bengaluru";
        card3.date = "01-11-2025";
        card3.time = "11:00 AM";
        card3.cardTheme = "Traditional Pooja";
        System.out.println("=== Invitation Card 3 ===");
        card3.displayCardInfo();

        InvitationCard card4 = new InvitationCard();
        card4.cardId = 4;
        card4.eventType = "Engagement";
        card4.hostName = "Karan & Priya";
        card4.venue = "Leela Palace, Delhi";
        card4.date = "18-09-2025";
        card4.time = "7:00 PM";
        card4.cardTheme = "Elegant Pastel";
        System.out.println("=== Invitation Card 4 ===");
        card4.displayCardInfo();

        InvitationCard card5 = new InvitationCard();
        card5.cardId = 5;
        card5.eventType = "Baby Shower";
        card5.hostName = "Megha";
        card5.venue = "JP Nagar, Bengaluru";
        card5.date = "05-10-2025";
        card5.time = "12:30 PM";
        card5.cardTheme = "Baby Blue & Pink";
        System.out.println("=== Invitation Card 5 ===");
        card5.displayCardInfo();

        InvitationCard card6 = new InvitationCard();
        card6.cardId = 6;
        card6.eventType = "Retirement";
        card6.hostName = "Mr. Ramesh Kumar";
        card6.venue = "Club House, Hyderabad";
        card6.date = "30-11-2025";
        card6.time = "5:00 PM";
        card6.cardTheme = "Golden Years";
        System.out.println("=== Invitation Card 6 ===");
        card6.displayCardInfo();

        InvitationCard card7 = new InvitationCard();
        card7.cardId = 7;
        card7.eventType = "Graduation";
        card7.hostName = "Neha Verma";
        card7.venue = "St. Xavier's Auditorium, Mumbai";
        card7.date = "10-06-2025";
        card7.time = "3:00 PM";
        card7.cardTheme = "Cap & Gown";
        System.out.println("=== Invitation Card 7 ===");
        card7.displayCardInfo();

        InvitationCard card8 = new InvitationCard();
        card8.cardId = 8;
        card8.eventType = "Anniversary";
        card8.hostName = "Ravi & Sita";
        card8.venue = "Marriott Hotel, Chennai";
        card8.date = "14-02-2025";
        card8.time = "8:00 PM";
        card8.cardTheme = "Romantic Red";
        System.out.println("=== Invitation Card 8 ===");
        card8.displayCardInfo();

        InvitationCard card9 = new InvitationCard();
        card9.cardId = 9;
        card9.eventType = "Naming Ceremony";
        card9.hostName = "The Patil Family";
        card9.venue = "Sankranti Hall, Pune";
        card9.date = "21-03-2025";
        card9.time = "10:00 AM";
        card9.cardTheme = "Traditional Baby";
        System.out.println("=== Invitation Card 9 ===");
        card9.displayCardInfo();

        InvitationCard card10 = new InvitationCard();
        card10.cardId = 10;
        card10.eventType = "Farewell";
        card10.hostName = "Class of 2025";
        card10.venue = "College Lawn, Bhopal";
        card10.date = "05-04-2025";
        card10.time = "6:30 PM";
        card10.cardTheme = "Memories & Laughter";
        System.out.println("=== Invitation Card 10 ===");
        card10.displayCardInfo();

        InvitationCard card11 = new InvitationCard();
        card11.cardId = 11;
        card11.eventType = "Festival Party";
        card11.hostName = "Residents' Association";
        card11.venue = "Community Center, Noida";
        card11.date = "02-10-2025";
        card11.time = "5:30 PM";
        card11.cardTheme = "Diwali Sparkle";
        System.out.println("=== Invitation Card 11 ===");
        card11.displayCardInfo();

        InvitationCard card12 = new InvitationCard();
        card12.cardId = 12;
        card12.eventType = "Kitty Party";
        card12.hostName = "Ladies Club";
        card12.venue = "Garden View Café, Jaipur";
        card12.date = "12-08-2025";
        card12.time = "2:00 PM";
        card12.cardTheme = "Peach Blossom";
        System.out.println("=== Invitation Card 12 ===");
        card12.displayCardInfo();

        InvitationCard card13 = new InvitationCard();
        card13.cardId = 13;
        card13.eventType = "Sports Day";
        card13.hostName = "Greenfield School";
        card13.venue = "Sports Ground, Lucknow";
        card13.date = "20-01-2025";
        card13.time = "9:00 AM";
        card13.cardTheme = "Victory Colors";
        System.out.println("=== Invitation Card 13 ===");
        card13.displayCardInfo();

        InvitationCard card14 = new InvitationCard();
        card14.cardId = 14;
        card14.eventType = "Music Concert";
        card14.hostName = "Yuva Rocks";
        card14.venue = "Open Arena, Kolkata";
        card14.date = "30-07-2025";
        card14.time = "7:00 PM";
        card14.cardTheme = "Electric Beats";
        System.out.println("=== Invitation Card 14 ===");
        card14.displayCardInfo();

        InvitationCard card15 = new InvitationCard();
        card15.cardId = 15;
        card15.eventType = "Dance Showcase";
        card15.hostName = "Rhythm Academy";
        card15.venue = "Auditorium, Nagpur";
        card15.date = "12-09-2025";
        card15.time = "6:30 PM";
        card15.cardTheme = "Grace & Glam";
        System.out.println("=== Invitation Card 15 ===");
        card15.displayCardInfo();

        InvitationCard card16 = new InvitationCard();
        card16.cardId = 16;
        card16.eventType = "Art Exhibition";
        card16.hostName = "Fine Arts Dept.";
        card16.venue = "Art Gallery, Kochi";
        card16.date = "03-03-2025";
        card16.time = "11:00 AM";
        card16.cardTheme = "Brush Strokes";
        System.out.println("=== Invitation Card 16 ===");
        card16.displayCardInfo();

        InvitationCard card17 = new InvitationCard();
        card17.cardId = 17;
        card17.eventType = "Science Fair";
        card17.hostName = "XYZ School";
        card17.venue = "Exhibition Hall, Patna";
        card17.date = "17-07-2025";
        card17.time = "10:00 AM";
        card17.cardTheme = "Innovative Minds";
        System.out.println("=== Invitation Card 17 ===");
        card17.displayCardInfo();

        InvitationCard card18 = new InvitationCard();
        card18.cardId = 18;
        card18.eventType = "Literature Fest";
        card18.hostName = "Readers Club";
        card18.venue = "Library Hall, Chandigarh";
        card18.date = "23-04-2025";
        card18.time = "4:00 PM";
        card18.cardTheme = "Book Haven";
        System.out.println("=== Invitation Card 18 ===");
        card18.displayCardInfo();

        InvitationCard card19 = new InvitationCard();
        card19.cardId = 19;
        card19.eventType = "Cooking Contest";
        card19.hostName = "Foodie Group";
        card19.venue = "Kitchen Studio, Surat";
        card19.date = "29-05-2025";
        card19.time = "1:00 PM";
        card19.cardTheme = "Spice & Style";
        System.out.println("=== Invitation Card 19 ===");
        card19.displayCardInfo();

        InvitationCard card20 = new InvitationCard();
        card20.cardId = 20;
        card20.eventType = "Startup Pitch";
        card20.hostName = "Entrepreneur Club";
        card20.venue = "Tech Hub, Bengaluru";
        card20.date = "11-11-2025";
        card20.time = "10:30 AM";
        card20.cardTheme = "Innovation Blue";
        System.out.println("=== Invitation Card 20 ===");
        card20.displayCardInfo();*/