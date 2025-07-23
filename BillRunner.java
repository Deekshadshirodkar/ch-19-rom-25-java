class BillRunner{

	public static void main(String a[]) {
	
		System.out.println("Main started");
		
		Bill ref = new Bill();
		ref.billId = 1;
		ref.planType = "Quaterly plan";
		ref.billAmountWithTax = 230.89;

		System.out.println("The first Bill is :"+ ref.billId);
		System.out.println("The Bill amount is :"+ ref.billAmountWithTax);
		
		Bill ref1 = new Bill();
		ref1.billId = 2;
		ref1.planType = "Monthly plan";
		ref1.billAmountWithTax = 170.89;

		System.out.println("The second Bill is :"+ ref1.billId);
		System.out.println("The Bill amount is :"+ ref1.billAmountWithTax);
		
		Bill ref2 = new Bill();
		ref2.billId = 3;
		ref2.planType = "Data only plan";
		ref2.billAmountWithTax = 29.00;

		System.out.println("The third Bill is :"+ ref2.billId);
		System.out.println("The Bill amount is :"+ ref2.billAmountWithTax);
		
		Bill ref3 = new Bill();
		ref3.billId = 4;
		ref3.planType = "Existing Active plan";
		ref3.billAmountWithTax = 51.00;
		
		System.out.println("The fourth Bill ID is: " + ref3.billId);
		System.out.println("The Bill amount is :"+ ref3.billAmountWithTax);

		Bill ref4 = new Bill();
        ref4.billId = 5;
        ref4.billAmountWithTax = 120.89;
		
        ref4.planType = "Basic Plan";
        System.out.println("The fifth Bill ID is: " + ref4.billId);
		System.out.println("The Bill amount is :"+ ref4.billAmountWithTax);

        Bill ref5 = new Bill();
        ref5.billId = 6;
        ref5.billAmountWithTax = 230.78;
        ref5.planType = "Standard Plan";
		
        System.out.println("The sixth Bill ID is: " + ref5.billId);
		System.out.println("The Bill amount is :"+ ref5.billAmountWithTax);

        Bill ref6 = new Bill();
        ref6.billId = 7;
        ref6.billAmountWithTax = 310.50;
        ref6.planType = "Premium Plan";
		
        System.out.println("The seventh Bill ID is: " + ref6.billId);
		System.out.println("The Bill amount is :"+ ref6.billAmountWithTax);

        Bill ref7 = new Bill();
        ref7.billId = 8;
        ref7.billAmountWithTax = 150.00;
        ref7.planType = "Monthly Saver";
		
        System.out.println("The eight Bill ID is: " + ref7.billId);
		System.out.println("The Bill amount is :"+ ref7.billAmountWithTax);

        Bill ref8 = new Bill();
        ref8.billId = 9;
        ref8.billAmountWithTax = 275.65;
        ref8.planType = "Quarterly Gold";
		
        System.out.println("The ninth Bill ID is: " + ref8.billId);
		System.out.println("The Bill amount is :"+ ref8.billAmountWithTax);

        Bill ref9 = new Bill();
        ref9.billId = 10;
        ref9.billAmountWithTax = 399.99;
        ref9.planType = "Annual Prime";
		
        System.out.println("tenth: " + ref9.billId);
		System.out.println("The Bill amount is :"+ ref9.billAmountWithTax);

        Bill ref10 = new Bill();
        ref10.billId = 11;
        ref10.billAmountWithTax = 89.50;
        ref10.planType = "Student Plan";
        System.out.println("The eleventh Bill ID is: " + ref10.billId);
		System.out.println("The Bill amount is :"+ ref10.billAmountWithTax);

        Bill ref11 = new Bill();
        ref11.billId = 12;
        ref11.billAmountWithTax = 199.00;
        ref11.planType = "Weekly Plan";
        System.out.println("The twelfth Bill ID is: " + ref11.billId);
		System.out.println("The Bill amount is :"+ ref11.billAmountWithTax);

        Bill ref12 = new Bill();
        ref12.billId = 13;
        ref12.billAmountWithTax = 305.10;
        ref12.planType = "Corporate Plan";
        System.out.println("The thirteenth Bill ID is: " + ref12.billId);
		System.out.println("The Bill amount is :"+ ref12.billAmountWithTax);

        Bill ref13 = new Bill();
        ref13.billId = 14;
        ref13.billAmountWithTax = 123.45;
        ref13.planType = "Eco Plan";
        System.out.println("The fourteenth Bill ID is: " + ref13.billId);
		System.out.println("The Bill amount is :"+ ref13.billAmountWithTax);

        Bill ref14 = new Bill();
        ref14.billId = 15;
        ref14.billAmountWithTax = 256.90;
        ref14.planType = "Silver Plan";
        System.out.println("The fifteenth Bill ID is: " + ref14.billId);
		System.out.println("The Bill amount is :"+ ref14.billAmountWithTax);

        Bill ref15 = new Bill();
        ref15.billId = 16;
        ref15.billAmountWithTax = 378.88;
        ref15.planType = "Platinum Plan";
        System.out.println("The sixteenth Bill ID is: " + ref15.billId);
		System.out.println("The Bill amount is :"+ ref15.billAmountWithTax);

        Bill ref16 = new Bill();
        ref16.billId = 17;
        ref16.billAmountWithTax = 142.00;
        ref16.planType = "Internet Combo";
        System.out.println("The seventeenth Bill ID is: " + ref16.billId);
		System.out.println("The Bill amount is :"+ ref16.billAmountWithTax);

        Bill ref17 = new Bill();
        ref17.billId = 18;
        ref17.billAmountWithTax = 289.30;
        ref17.planType = "Home Pack";
        System.out.println("The eighteenth Bill ID is: " + ref17.billId);
		System.out.println("The Bill amount is :"+ ref17.billAmountWithTax);

        Bill ref18 = new Bill();
        ref18.billId = 19;
        ref18.billAmountWithTax = 412.20;
        ref18.planType = "Entertainment Max";
        System.out.println("The nineteenth Bill ID is: " + ref18.billId);
		System.out.println("The Bill amount is :"+ ref18.billAmountWithTax);

        Bill ref19 = new Bill();
        ref19.billId = 20;
        ref19.billAmountWithTax = 110.00;
        ref19.planType = "Family Share";
        System.out.println("The twenty Bill ID is: " + ref19.billId);
		System.out.println("The Bill amount is :"+ ref19.billAmountWithTax);

        Bill ref20 = new Bill();
        ref20.billId = 21;
        ref20.billAmountWithTax = 198.70;
        ref20.planType = "Talktime Unlimited";
        System.out.println("The 21th Bill ID is: " + ref20.billId);
		System.out.println("The Bill amount is :"+ ref20.billAmountWithTax);

        Bill ref21 = new Bill();
        ref21.billId = 22;
        ref21.billAmountWithTax = 329.40;
        ref21.planType = "International Roaming";
        System.out.println("The 22th Bill ID is: " + ref21.billId);
		System.out.println("The Bill amount is :"+ ref21.billAmountWithTax);

		System.out.println("Main Ended");


	}

}