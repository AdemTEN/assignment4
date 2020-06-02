package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;


public class Question13_bankServiceFees {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the mothly amount of checks: ");
		int checks = scan.nextInt();
		
		final int BASE_FEE = 10;
		double  totalFee = 10; ;
		
		if (checks < 20) {
			totalFee = BASE_FEE + (checks * 0.1);
		}else if (checks < 40) {
			totalFee = BASE_FEE + (checks * 0.08);
		}else if (checks < 60) {
			totalFee = BASE_FEE + (checks * 0.06);
		}else if (60 <= checks) {
			totalFee = BASE_FEE + (checks * 0.04);
		}else {
			System.out.println("invalid value!!!");
		}
		System.out.println("The bank's service total fee of the month: $" + totalFee);
		
		
		
		
		
		
	}

}
