package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question3_leapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if ( leapYear) {
			System.out.println(year + " Leap Year");
		}else {
			System.out.println(year + " NOT a Leap Year");
		}
		
		
		
		
		
	}

}
