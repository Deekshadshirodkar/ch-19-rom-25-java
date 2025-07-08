class Tv{

	static boolean isConnected;
	static int currentVolume;
	static int maxVolume = 20;
	static int minVolume = 0;
	
	public static void onOrOff(){
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Telivision is turned On....." + isConnected);
		
		}else if(isConnected == true){
			
			isConnected = false;
			System.out.println("The Telivision is not connected" );
			return;
			
		}
	}
	
	public static void increasedVolume(){
		System.out.println("IncreaseVolume Started");
		if(isConnected == true){
			
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The current Volume is " + currentVolume);
			
			}else{
				
				System.out.println("Max Volume reached");
			}
		}else{
				
				System.out.println("Please Switch on the Telivision");
				
			}
			System.out.println("Increased Volume Ended.");
			return;
			
		}
		
		public static void decreasedVolume(){
			
			System.out.println("decreasedVolume Started");
			
			if(isConnected == true){
				
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current Volume is: " + currentVolume);
					
				}
				else{
					System.out.println("Min Volume reached");
					
				}
			}
			else{
				System.out.println("Please Switch on the Telivision");
				
			}
			System.out.println("Decreased Volume Ended.");	
			return;
		}


}