class NewspapersRunner {


	public static void main(String[] args){

		System.out.println("Main Started");
		
			Newspapers newspaper = new Newspapers();
			
			System.out.println("The bill ID is : " + newspaper.newPaperId);
			System.out.println("The Company name is : " + newspaper.companyName);
			
			newspaper.newPaperId= 1;
			newspaper.noOfPages = 12;
			newspaper.languages = "English";
			newspaper.date="25-02-2025";
			newspaper.day="Tuesday";
			newspaper.companyName = "The Times Of India";
			
			System.out.println("The bill ID is : " + newspaper.newPaperId);
			System.out.println("The Company name is : " + newspaper.companyName);

			
			Newspapers newspaper1 = new Newspapers();
			newspaper1.newPaperId= 2;
			newspaper1.noOfPages = 20;
			newspaper1.languages = "Kannada";
			newspaper1.date="22-07-2025";
			newspaper1.day="Tuesday";
			newspaper1.companyName = "Karavali Munjavu";
			
			System.out.println("The bill ID is : " + newspaper1.newPaperId);
			System.out.println("The Company name is : " + newspaper1.companyName);
			
			
			Newspapers newspaper2 = new Newspapers();
			newspaper2.newPaperId= 3;
			newspaper2.noOfPages = 12;
			newspaper2.languages = "English";
			newspaper2.date="25-02-2025";
			newspaper2.day="Tuesday";
			newspaper2.companyName = "Deccan Herald";
			
			System.out.println("The bill ID is : " + newspaper2.newPaperId);
			System.out.println("The Company name is : " + newspaper2.companyName);
			
			Newspapers newspaper3 = new Newspapers();
			newspaper3.newPaperId= 4;
			newspaper3.noOfPages = 10;
			newspaper3.languages = "Hindi";
			newspaper3.date="25-02-2025";
			newspaper3.day="Tuesday";
			newspaper3.companyName = "Aaj Tak";
			
			System.out.println("The bill ID is : " + newspaper3.newPaperId);
			System.out.println("The Company name is : " + newspaper3.companyName);
			
			Newspapers newspaper4 = new Newspapers();
			newspaper4.newPaperId= 5;
			newspaper4.noOfPages = 12;
			newspaper4.languages = "English";
			newspaper4.date="25-02-2025";
			newspaper4.day="Tuesday";
			newspaper4.companyName = "Bngalore Times";
			
			System.out.println("The bill ID is : " + newspaper4.newPaperId);
			System.out.println("The Company name is : " + newspaper4.companyName);
			
		System.out.println("Main Ended");
		
	}

}