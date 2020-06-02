package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question10_percentageOfCalories {

	public static void main(String[] args) {

		Scanner scan =new Scanner (System.in);
		System.out.print("Enter number of calories: ");
		double totalCalories = scan.nextDouble();
		System.out.print("Enter fat gram: ");
		double fatOfGram = scan.nextDouble();
		
		double caloriesFromFat = fatOfGram * 9;
		double percentageOfCalories = caloriesFromFat / totalCalories;
		
		if (percentageOfCalories < 0.3) {
			System.out.println("The food is low in fat");
		}else if (caloriesFromFat > totalCalories){
			System.out.println("Invalid value");
		}else {
			System.out.println("The food is high in food");
		}
		
		
		
		
		
		
		
	}

}
