package assignment4_IfStatementSwitchStatement;

import java.util.Scanner;

public class Question12_internetServicePrivider {

	public static void main(String[] args) {

	 Scanner scan = new Scanner (System.in);
	 System.out.print("Enter the package of the internet sevice provider: ");
	 char packege = scan.next().charAt(0);
	 
	 System.out.print("Enter the total hours that were used: ");
	 double hour = scan.nextDouble();
	 
	 double monthlyBill = 0;
	 
	  if (packege == 'A') {
		  if (hour < 10) {
			  monthlyBill = 9.95;
		  }else {
			  monthlyBill = 9.95 + (hour - 10 ) * 2;
		  }
	  }else if(packege == 'B') {
		  if (hour < 20) {
			  monthlyBill = 13.95;
		  }else {
			  monthlyBill = 13.95 + (hour - 20) * 1;
		  }
	  }else if(packege == 'C') {
		      monthlyBill = 19.95;
	  }else {
		  System.out.println("Invalid value");
	  }
		  
	  System.out.println("The cudtomer monthly bill is: $" + monthlyBill );
		  
		  
	 
		 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
