class Tyre {

    static String brand = "MRF";
    static int diameter = 16;
    static boolean isPunctured = false;
    static float pressure = 30.5f;
    static byte layers = 5;
    static short gripLevel = 80;
    static long batchCode = 554433L;


    public static String getBrand() { 
		return brand; 
	
	}
	
    public static int getDiameter() { 
		return diameter; 
		
	}
	
    public static boolean getIsPunctured() { 
		return isPunctured; 
	
	}
	
    public static float getPressure() { 
		return pressure; 
		
	}
	
    public static byte getLayers() { 
		return layers; 
	
	}
	
    public static short getGripLevel() { 
		return gripLevel; 
		
	}
	
    public static long getBatchCode() { 
		return batchCode; 
		
	}
}
