class ChatShop {
	
	
	/*static String paniPuri = "Pani Puri";
	static String bhelPuri= "Bhel Puri";
	static String sevPuri= "Sev Puri";
	static String ragdaPattice = "Ragda Pattice";
	static String dahiPuri = "Dahi Puri";
	static String alooTikki = "Aloo Tikki Chaat";
	static String papdi = "Papdi Chaat";
	static String samosa = "Samosa Chaat";
	static String kachori = "Kachori Chaat";
	static String rajKachori = "Raj Kachori";
	
	static String chats[] = {paniPuri,bhelPuri,sevPuri,ragdaPattice,dahiPuri,alooTikki,papdi,samosa,kachori,rajKachori};
	*/
	
    public static void main(String[] chatshop) {
		
		String paniPuri = "Pani Puri";
		String bhelPuri= "Bhel Puri";
		String sevPuri= "Sev Puri";
		String ragdaPattice = "Ragda Pattice";
		String dahiPuri = "Dahi Puri";
		String alooTikki = "Aloo Tikki Chaat";
		String papdi = "Papdi Chaat";
		String samosa = "Samosa Chaat";
		String kachori = "Kachori Chaat";
		String rajKachori = "Raj Kachori";
	
		String chats[] = {paniPuri,bhelPuri,sevPuri,ragdaPattice,dahiPuri,alooTikki,papdi,samosa,kachori,rajKachori};
		

		System.out.println("Main Started");
		System.out.println("Chat Items:" );
		for(String chat : chats){
				System.out.println(chat);
		}


        //System.out.println("Chat Items Available:" +chats[0] + " " +chats[1] + " " +chats[2] + " " +chats[3] + " " +chats[4] + " " +chats[5] + " " +chats[6] + " " +chats[7] + " " +chats[8] + " " +chats[9]);
    
		System.out.println("Main Ended");
	}
}
