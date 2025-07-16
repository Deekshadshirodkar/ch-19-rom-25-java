class WalkieTalkie {

    static String brand = "Motorola";
    static int range = 5;
    static boolean isCharged = true;
    static float battery = 87.5f;
    static short volumeLevel = 4;
    static byte channels = 8;
    static long id = 12345L;


    public static String getBrand() { 
		return brand; 
		
	}
	
    public static int getRange() { 
		return range; 
		
	}
	
    public static boolean getIsCharged() { 
		return isCharged; 
	
	}
	
    public static float getBattery() { 
		return battery; 
		
	}
	
    public static short getVolumeLevel() { 
		return volumeLevel; 
	
	}
	
    public static byte getChannels() { 
		return channels; 
		
	}
	
    public static long getId() { 
		return id; 
	
	}
}
