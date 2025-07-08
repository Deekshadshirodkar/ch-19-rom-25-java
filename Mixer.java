class Mixer{

	static boolean isPoweredOn;
	static int currentSpeed;
	static int maxSpeed = 3;
	static int minSpeed = 0;
	
	public static void powerButton(){
		
		if(isPoweredOn == false){
			isPoweredOn = true;
			System.out.println("Mixer is turned On.");
		
		}else if(isPoweredOn == true){
			
			isPoweredOn = false;
			System.out.println("Mixer is now turned Off.");
		
		}
	}
	
	public static void increasedSpeed(){
		
		System.out.println("Increased Speed Started.");
		
		if(isPoweredOn == true){
			
			if(currentSpeed < maxSpeed){
				
				currentSpeed = currentSpeed + 1;
				System.out.println("Speed is now increased to : " +currentSpeed);
			}
			else{
				System.out.println("Speed is already at maximum level");
			}
		}else{
			
			System.out.println("Please Switch on the Mixer.");
		}
		System.out.println("Increased Speed Ended.");
		return;
	}
	
	public static void decreasedSpeed(){
		
		System.out.println("Decreased Speed Started.");
		
		if(isPoweredOn == true){
			
			if(currentSpeed > minSpeed){
				
				currentSpeed = currentSpeed - 1;
				System.out.println("speed is now decreased to : " +currentSpeed);
			}
			else{
				System.out.println("Speed is already at minimum level");
			}
		}else{
			
			System.out.println("Cannot decrease Speed.");
		}
		System.out.println("Decreased Speed Ended.");
		return;
	}
	
	

}