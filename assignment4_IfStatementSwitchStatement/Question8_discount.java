package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question8_discount {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter  the number of packages: ");
		int numberOfPackages = scan.nextInt();
		double discount = 0;
		double price = 99;
		double totalAmount = numberOfPackages * price;
		
		if (numberOfPackages < 10) {
			discount = 0;
			totalAmount = totalAmount;
		}else if (numberOfPackages < 20) {
			discount = totalAmount  * 0.2;
			totalAmount = totalAmount - discount;
		
		}else if(numberOfPackages < 50) {
			discount = totalAmount  * 0.3;
			totalAmount = totalAmount - discount;
		
		}else if(numberOfPackages < 100) {
			discount = totalAmount  * 0.4;
			totalAmount = totalAmount - discount;
		
		}else {
			discount = totalAmount  * 0.5;
			totalAmount = totalAmount - discount;
		
		}
		
		System.out.println("The amount of disscount is: $" + discount);
		System.out.println("The total amount of purchase is: $" + totalAmount);
		
		
		
		
	}

}
