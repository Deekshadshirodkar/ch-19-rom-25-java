class Signal {

    static String type = "Traffic";
    static boolean isWorking = true;
    static int timer = 60;
    static char signalColor = 'R';
    static float blinkRate = 1.2f;
    static short signalId = 101;
    static byte poleCount = 4;
    static long areaCode = 445566L;


    public static String getType() { 
		return type;

	}
	
    public static boolean getIsWorking() { 
		return isWorking; 
	
	}
	
    public static int getTimer() { 
		return timer; 
		
	}
	
    public static char getSignalColor() { 
		return signalColor; 
		
	}
	
    public static float getBlinkRate() { 
		return blinkRate; 
		
	}
	
    public static short getSignalId() { 
		return signalId; 
		
	}
	
    public static byte getPoleCount() { 
		return poleCount; 
		
	}
	
    public static long getAreaCode() { 
		return areaCode; 
	
	}
}