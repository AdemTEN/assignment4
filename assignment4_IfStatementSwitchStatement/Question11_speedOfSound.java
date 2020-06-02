package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question11_speedOfSound {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the medium of the sound: ");
		String medium = scan.nextLine();
		
		System.out.print("Enter the distance of sound that travel in the medium: ");
		double distance = scan.nextDouble();
		double time = 0;
		
		switch (medium) {
		case "air":	
			time = distance / 1100;
			System.out.println("The amount of time it takes sound to travel in the air: "  + time);
			break;
		
		case "water":
			time = distance / 4900;
			System.out.println("The amount of time it takes sound to travel in the water: "  + time);
			break;
		case  "steel":
			time = distance / 16400;
			System.out.println("The amount of time it takes sound to travel in the steel: "  + time);
			break;
		default:
			System.out.println("Invalid medium!!! Please enter right medium...");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
