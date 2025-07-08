class WashingMachine{

	static boolean isConnected;
	static int currentSpeed;
	static int maxSpeed = 8;
	static int minSpeed = 0;
	
	public static void onOrOff(){
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("Washing Machine is turned On.");
		
		}else if(isConnected == true){
			
			isConnected = false;
			System.out.println("Washing Machine is now turned Off.");
			return;
			
		}
	}
	
	
	public static void increasedSpeed(){
		
		System.out.println("Increased Speed Started.");
		
		if(isConnected == true){
			
			if(currentSpeed < maxSpeed){
				
				currentSpeed = currentSpeed + 1;
				System.out.println("Speed is now increased to : " +currentSpeed);
			}
			else{
				System.out.println("Speed is already at maximum level");
			}
		}else{
			
			System.out.println("Please Switch on the Washing Machine.");
		}
		System.out.println("Increased Speed Ended.");
		return;
		
	}
	
	
	public static void decreasedSpeed(){
		
		System.out.println("Decreased Speed Started.");
		
		if(isConnected == true){
			
			if(currentSpeed > minSpeed){
				
				currentSpeed = currentSpeed - 1;
				System.out.println("speed is now decreased to : " +currentSpeed);
			}
			else{
				System.out.println("Speed is already at minimum level");
			}
		}else{
			
			System.out.println("Please Switch on the Washing Machine.");
		}
		System.out.println("Decreased Speed Ended.");
		return;
		
	}
	



}