class Speaker{

	static boolean isConnected;
	static int currentVolume;
	static int maxVolume = 7;
	static int minVolume = 0;
	
	public static void onOrOff(){
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The speaker is turned On....." + isConnected);
		
		}else if(isConnected == true){
			
			isConnected = false;
			System.out.println("The speaker is not connected" );
		
		}
	}
	
	//increase volume
	public static void increaseVolume(){
		System.out.println("IncreaseVolume Started");
		if(isConnected == true){
			
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The current Volume is " + currentVolume);
			
			}else{
				
				System.out.println("Max Volume reached");
			}
		}else{
				
				System.out.println("Please Switch on the speaker");
				
			}
		}
		
		public static void decreaseVolume(){
			
			System.out.println("decreaseVolume Started");
			
			if(isConnected == true){
				
				if(currentVolume >= minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current Volume is: " +currentVolume);
					
				}
				else{
					System.out.println("Min Volume reached");
					
				}
			}
			else{
				System.out.println("Please Switch on the Speaker");
				
			}
						
		}	
	
}