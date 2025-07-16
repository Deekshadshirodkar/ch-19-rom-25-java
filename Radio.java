class Radio {

    static String brand = "Sony";
    static int volumeLevel = 7;
    static boolean isOn = true;
    static char mode = 'F'; 
    static float version = 1.5f;
    static long serialNumber = 123456789L;
    static short battery = 100;
    static byte presets = 5;


    public static String getBrand() {
		return brand; 
	
	}
	
    public static int getVolumeLevel() { 
		return volumeLevel; 
	
	}
	
    public static boolean getIsOn() { 
		return isOn; 
		
	}
	
    public static char getMode() { 
		return mode; 
		
	}
	
    public static float getVersion() { 
		return version; 
	
	}
	
    public static long getSerialNumber() { 
		return serialNumber; 
	
	}
	
    public static short getBattery() { 
		return battery; 
	
	}
    public static byte getPresets() { 
		return presets; 
	
	}
}