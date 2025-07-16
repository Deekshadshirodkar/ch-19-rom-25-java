class GamingPcRunner {

    public static void main(String[] args) {
	
        System.out.println("Processor: " + GamingPc.getProcessor());
        System.out.println("RAM: " + GamingPc.getRam());
        System.out.println("Clock Speed: " + GamingPc.getClockSpeed());
        System.out.println("Is RGB Enabled: " + GamingPc.getIsRGBEnabled());
        System.out.println("USB Ports: " + GamingPc.getUsbPorts());
        System.out.println("Storage: " + GamingPc.getStorage());
        System.out.println("Serial: " + GamingPc.getSerial());
    }
}
