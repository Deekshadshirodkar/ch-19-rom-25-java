class SocialMedia {

	/*static String faceboook = "Facebook";
	static String instagram = "Instagram";
	static String twitter = "Twitter";
	static String snapchat = "Snapchat";
	static String linkedIn = "LinkedIn";
	static String youTube = "YouTube";
	static String pinterest = "Pinterest";
	static String reddit = "Reddit";
	static String telegram = "Telegram";
	static String whatsApp = "WhatsApp";


	static String mediaNames[] = {faceboook,instagram,twitter,snapchat,linkedIn,youTube,pinterest,reddit,telegram,whatsApp};
*/

    public static void main(String[] medianame) {
		
		String faceboook = "Facebook";
		String instagram = "Instagram";
		String twitter = "Twitter";
		String snapchat = "Snapchat";
		String linkedIn = "LinkedIn";
		String youTube = "YouTube";
		String pinterest = "Pinterest";
		String reddit = "Reddit";
		String telegram = "Telegram";
		String whatsApp = "WhatsApp";


		String mediaNames[] = {faceboook,instagram,twitter,snapchat,linkedIn,youTube,pinterest,reddit,telegram,whatsApp};

		System.out.println("Main Started");
		
		System.out.println("Popular Social Media Platforms:" );
		for(String mediaName : mediaNames){
				System.out.println(mediaName);
		}

		System.out.println("Main Ended");

        //System.out.println("Popular Social Media Platforms:" + mediaNames[0] +  " " + mediaNames[1] + " " + mediaNames[2] + " " + mediaNames[3] + " " + mediaNames[4] + " " + mediaNames[5] + " " + mediaNames[6] + " " +mediaNames[7] + " " + mediaNames[8] + " " + mediaNames[9]);
    }
}
