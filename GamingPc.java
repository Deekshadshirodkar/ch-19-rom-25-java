class GamingPc {

    static String processor = "Intel i9";
    static int ram = 32;
    static float clockSpeed = 3.9f;
    static boolean isRGBEnabled = true;
    static byte usbPorts = 6;
    static short storage = 2048;
    static long serial = 123123123L;


    public static String getProcessor() { 
		return processor; 
		
	}
	
    public static int getRam() { 
		return ram; 
		
	}
	
    public static float getClockSpeed() { 
		return clockSpeed; 
		
	}
	
    public static boolean getIsRGBEnabled() { 
		return isRGBEnabled; 
	
	}
	
    public static byte getUsbPorts() { 
		return usbPorts; 
		
	}
	
    public static short getStorage() { 
		return storage; 
		
	}
	
    public static long getSerial() { 
		return serial; 
	}
}