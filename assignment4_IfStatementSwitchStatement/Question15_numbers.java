package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question15_numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number:");
		int number = scan.nextInt();
		
		switch(number) {
		
		case 0: case 1: case 2: System.out.println("Low Number");break; 
		case 3: case 4: case 5: System.out.println("Medium Number");break;
	    default: System.out.println("Other Number"); break;
		
		
		
		
		
		
		
		
		
		}
		
		
		
	}

}
