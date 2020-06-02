package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question4_telephoneBill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the  monthly total calls: ");
		int calls = scan.nextInt();
		double telephoneBill = 0;
		if (calls <= 100) {
			telephoneBill = 200;
		}else if(calls <= 150) {
			telephoneBill = 200 + (calls - 100) * 0.6;
		}else if (calls <= 200) {
			telephoneBill = 200 + (50) * 0.6 + (calls -150) * 0.5; 
		}else {
			telephoneBill = 200 + (50) * 0.6 + (50) * 0.5 + (calls - 200) * 0.4;
		}
		
		System.out.println("The monthly telophone bills: $" + telephoneBill);
		
		
	}

}
