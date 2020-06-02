package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question5_magicDate {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter month of the year in numeric form :");
		int month = scan.nextInt();
		System.out.print("Enter day of the month: ");
		int day = scan.nextInt();
		System.out.print("Enter the last two digits of the year: ");
		int year = scan.nextInt();
		
		if ((month * day) == year) {
			System.out.println("The date " + month + "/" + day + "/" + year + " is magic");
		}else {
			System.out.println("The date " + month + "/" + day + "/" + year + " is  not magic");
	
		
		}

 }
}