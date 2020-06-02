package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question14_bookSellers {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the books number of customer: ");
		int numberOfCustomerBooks = scan.nextInt();
		int pointsOfCustomer = 0;
		
		if (numberOfCustomerBooks == 0) {
			pointsOfCustomer = 0;
		}else if (numberOfCustomerBooks == 1) {
			pointsOfCustomer = 5;
		}else if(numberOfCustomerBooks == 2) {
			pointsOfCustomer = 15;
		}else if (numberOfCustomerBooks == 3) {
			pointsOfCustomer = 30;
		}else if(numberOfCustomerBooks >= 4) {
			pointsOfCustomer = 60;
		}else {
			System.out.println("invalid value!!!");
		}
		
		System.out.println("The points of customer is: " + pointsOfCustomer);
		
		
		
		
		
		
		
		
	}

}
