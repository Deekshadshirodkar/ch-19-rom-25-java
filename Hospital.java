class Hospital {


    public static void main(String[] args) {
		
		String doctorNames[] = {"Dr. Ramesh Kumar","Dr. Priya Sharma","Dr. Anil Mehta","Dr. Sneha Patil","Dr. Arjun Singh","Dr. Neha Joshi","Dr. Vivek Desai","Dr. Kavita Rao","Dr. Rajeev Nair","Dr. Aarti Kulkarni"};

		
		System.out.println("Doctor Names:" );
		for(String doctorName : doctorNames){
				System.out.println(doctorName);
		}
		
        //System.out.println("Doctors Available in the Hospital:" + doctorNames[0] + " " + doctorNames[1] + " " + doctorNames[2] + " " + doctorNames[3] + " " + doctorNames[4] + " " + doctorNames[5] + " " + doctorNames[6] + " " + doctorNames[7] + " " + doctorNames[8] + " " + doctorNames[9]);
    }
}