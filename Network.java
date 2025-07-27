class Network {

    int networkId;
    String provider;
    String type;
    double speedMbps;
    double frequencyGHz;
    boolean is5G;
    String region;

    public void getNetworkInfo() {
		
        System.out.println("ID: " + networkId);
        System.out.println("Provider: " + provider);
        System.out.println("Type: " + type);
        System.out.println("Speed (Mbps): " + speedMbps);
        System.out.println("Frequency (GHz): " + frequencyGHz);
        System.out.println("5G Enabled: " + is5G);
        System.out.println("Region: " + region);
    }
}
