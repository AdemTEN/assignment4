package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question7_numberInSecond {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number in seceonds: ");
		int seconds = scan.nextInt();
		int minutes = 0, hours = 0, days = 0; 
		
		if (seconds < 3600) {
			minutes = seconds / 60;
			System.out.println("The number of minutes in " + seconds + " seconds is: " +  minutes + " miutes");
		}else if (seconds < 86400) {
			System.out.println("The number of days in " + seconds + " seconds is: " + hours + " hours") ;
			hours = seconds / 3600;
		}else {
			days = seconds / 86400; 
			System.out.println("The number of days in " + seconds + " seconds is: " + days + " days") ;
		}
		
		
	}

}
