package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question1_bmi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your wight in pounds:");
		double weightInPound = scan.nextDouble();
		System.out.print("Enter your height in feet followed by a space then additonal inches:");
		double heightInFeet = scan.nextDouble();
		double heightInInches= scan.nextDouble();
		
		double weightInKilograms = weightInPound / 2.2;
		double heightInMeters = ((heightInFeet * 12) + heightInInches) * 0.0254;
		
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		System.out.println("Your BMI is: " + (int)(bmi * 1000) / 1000.0);
		
		if (bmi < 18.5) {
			System.out.println("Your risk factory is: Underweight");
		}else if (bmi < 25) {
			System.out.println("Your risk factory is: Normal Weight");
		}else if(bmi < 30) {
			System.out.println("Your risk factory is: Overweight");
		}else {
			System.out.println("Your risk factory is: Obese");
		}
		
		
		
		
		
		
	}

}
