class Camera { 

static String cameraModel;
static String memorySize;
static double pickSize;
static String battery;
static double price;

public static void main(String photo[]){

	
	double price = 0.0;
	
	memorySize = "128GB";
	pickSize = 5.5;
	battery = "5000mph";
	cameraModel= "Nikon";
	System.out.println("Price of the Camera : Rs. " + price);
	price = 3000000.0;
	
	System.out.println("Camera Model : " +cameraModel);
	System.out.println("Memory Size : " + memorySize );
	System.out.println("Price of the Camera : Rs. " + price);
	System.out.println("pick Size : " +pickSize);
	System.out.println("Battery capacity : " +battery);
	
	
	
}

}