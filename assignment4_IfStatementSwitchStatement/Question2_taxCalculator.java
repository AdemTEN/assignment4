package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question2_taxCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
	    System.out.println("Enter your annual income:");
	    double income = scan.nextDouble();
	    double taxAmaunt = 0;
	    
	    if (income <= 150_000_000) {
	    	taxAmaunt = income * 0.25;
	    }else if (income <= 300_000_000) {
	    	taxAmaunt = (150_000_000 * 0.25) + (income - 150_000_000) * 0.30;
	    }else if (income <=600_000_000) {
	    	taxAmaunt = (150_000_000 * 0.25) + (300_000_000- 150_000_000) * 0.30 + (income - 300_000_000) * 0.35;
	    }else if (income <= 1_200_000_000) {
	    	taxAmaunt = (150_000_000 * 0.25) + (300_000_000- 150_000_000) * 0.30 + (600_000_000 - 300_000_000) * 0.35
	    			+ (income- 600_000_000) * 0.40;
	    }else {
	    	taxAmaunt =  (150_000_000 * 0.25) + (300_000_000- 150_000_000) * 0.30 + (600_000_000 - 300_000_000) * 0.35
	    			+ (1_200_000_000 - 600_000_000) * 0.40 + (income - 1_200_000_000) * 0.50;
	    }
		
		System.out.println("Your tax amount you have to pay:" + taxAmaunt);
	}

}
