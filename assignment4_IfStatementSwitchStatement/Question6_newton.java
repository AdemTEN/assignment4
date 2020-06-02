package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question6_newton {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the amount of mass the object: ");
		double mass = scan.nextDouble();
		
		double weightInNewton = mass * 9.8;
		
		if (weightInNewton > 1000) {
			System.out.println("The weight of the object is: " + weightInNewton);
			System.out.println("The object is too heavy");
		}else if (weightInNewton < 10) {
			System.out.println("The weight of the object is: " + weightInNewton);
			System.out.println("The object is too leight");
		}
		
				
				
				
				
				
				
	}

}
