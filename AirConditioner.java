class AirConditioner{

	static boolean isConnected;
	static int maxTemperature = 28;
	static int minTemperature = 0;
	static int currentTemperature;
	
	public static void onOrOff(){
		
		if(isConnected == false){
			
			isConnected = true;
			System.out.println("AC is turned On.");
			
		}else{
			isConnected = false;
			System.out.println("AC is turned Off.");
		}
	}
	
	public static void increasedTemperature(){

		System.out.println("Increased Temperature Started");

		if(isConnected == true){
			
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature + 1;
				System.out.println("The Temperature is increased to : " +currentTemperature);
			
			}else{
				System.out.println("Temperature is already at maximum level.");
				
			}
		}else{
			System.out.println("Please Switch on the AC.");
			
		}
		
		System.out.println("Increased Temperature Started");
		return;
	}
	
	public static void decreasedTemperature(){
		
		System.out.println("Decreased Temperature Started");	
		
		if(isConnected == true){
			
			if(currentTemperature > minTemperature){
				currentTemperature = currentTemperature - 1;
				System.out.println("Temperature is increased to : " + currentTemperature);
			}else{
				System.out.println("Temperaturei is at minimum level");
			}
		}else{
			System.out.println("Please switch on the AC");
		}
	
			System.out.println("Decreased Temperature Ended");
			return;
	}
}