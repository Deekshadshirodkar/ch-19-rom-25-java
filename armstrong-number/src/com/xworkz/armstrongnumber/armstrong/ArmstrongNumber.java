package com.xworkz.armstrongnumber.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] arm){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        int originalNum = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while(number > 0){
            int digit = number % 10;
            result += (int) Math.pow(digit, n);
            number /= 10;
        }

        if(result == originalNum) {

            System.out.println(originalNum + " is an Armstrong Number");
        }else{
            System.out.println(originalNum + " is not an Armstrong Number");

        }
        sc.close();
    }
}
