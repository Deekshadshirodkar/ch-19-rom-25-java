class Desktop{
	
	static String deviceName;
	static String origin;
	static String deviceId;
	static String manufacturer;
    static Integer ramSizeGB;
	static String operatingSystem;
	static String price;
	static String processor;
	static String hardDisk;
    static double processorSpeedGHz;
    static Float screenSizeInches;
	static String storageType;
    static Long serialNumber;
	static String purchaseDate;
	static String pcowner;
	static String dimension;
	static Float weight;
    static Short usbPorts;
    static Byte warrantycard;
    static Boolean hasGraphicsCard;
    static Character modelSeries;
	
	
	public static void main(String pc[]){
		
		System.out.println("Device Name: " + deviceName);
		System.out.println("Origin : "+origin);
		System.out.println("Device ID :  " +deviceId);
		System.out.println("Manufacturer : " +manufacturer);
        System.out.println("RAM: " + ramSizeGB + " GB");
		System.out.println("Operating System : " +operatingSystem);
		System.out.println("Price : " +price);
		System.out.println("Processor : " +processor);
		System.out.println("Hard Disk size : " +hardDisk);
        System.out.println("Processor Speed: " + processorSpeedGHz + " GHz");
        System.out.println("Screen Size: " + screenSizeInches + " inches");
		System.out.println("Storage Type : " +storageType);
        System.out.println("Serial Number: " + serialNumber);
		System.out.println("Purchased Date : " +purchaseDate);
		System.out.println("Owner : " + pcowner);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Warranty: " + warrantycard + " years");
        System.out.println("Graphics Card: " + hasGraphicsCard);
        System.out.println("Model Series: " + modelSeries);
	
		String deviceName = "Dell";
		String origin = "India";
		String deviceId = "DELL-7080-XY123456";
		String manufacturer = "Dell Technologies";
		Integer ramSizeGB = 16;
		String operatingSystem = "Windows 11 Pro 64-bit";
		String price = "Rs. 90000";
		String processor="Intel core i5";
		String hardDisk = "3.5 inch ";
		double processorSpeedGHz = 3.6;
		Float screenSizeInches = 24.0f;
		String storageType = "SSD + HDD";
		Long serialNumber = 987654321012L;
		String purchaseDate = "19-06-2025";
		String pcowner = "Deeksha";
		String dimension = "36 x 17 x 43 cm ";
		Float weight = 8.5f;
		Short usbPorts = 4;
		Byte warrantycard = 3;
		Boolean hasGraphicsCard = true;
		Character modelSeries = 'T';
	
	
		System.out.println("Device Name: " + deviceName);
		System.out.println("Origin : "+origin);
		System.out.println("Device ID :  " +deviceId);
		System.out.println("Manufacturer : " +manufacturer);
        System.out.println("RAM: " + ramSizeGB + " GB");
		System.out.println("Operating System : " +operatingSystem);
		System.out.println("Price : " +price);
		System.out.println("Processor : " +processor);
		System.out.println("Hard Disk size : " +hardDisk);
        System.out.println("Processor Speed: " + processorSpeedGHz + " GHz");
        System.out.println("Screen Size: " + screenSizeInches + " inches");
		System.out.println("Storage Type : " +storageType);
        System.out.println("Serial Number: " + serialNumber);
		System.out.println("Purchased Date : " +purchaseDate);
		System.out.println("Owner : " + pcowner);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Warranty: " + warrantycard + " years");
        System.out.println("Graphics Card: " + hasGraphicsCard);
        System.out.println("Model Series: " + modelSeries);
	
		
	}
}
	