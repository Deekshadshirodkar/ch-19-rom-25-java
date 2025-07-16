class Banner {

    static String content = "Big Sale!";
    static int width = 10;
    static int height = 4;
    static boolean isVisible = true;
    static char orientation = 'L'; 
    static float weight = 2.3f;
    static long printId = 100000L;
    static byte folds = 2;


    public static String getContent() { 
		return content; 
		
	}
	
    public static int getWidth() { 
		return width; 
		
	}
	
    public static int getHeight() { 
		return height; 
		
	}
	
    public static boolean getIsVisible() { 
		return isVisible; 
		
	}
	
    public static char getOrientation() { 
		return orientation; 
		
	}
	
    public static float getWeight() { 
		return weight; 
	
	}
	
    public static long getPrintId() { 
		return printId; 
		
	}
	
    public static byte getFolds() { 
		return folds; 
	}
	
}