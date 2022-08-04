package contiditions;

import java.util.Scanner;

public class switchstatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//try (Scanner Entry1 = new Scanner(System.in)) {
		    	
		    	//System.out.println("Enter Number:");

				// String input
		
		// int day = Entry1.nextInt();
		int day =5;
		 
		String currentDay;
		
		switch (day) {
		case 1 :currentDay ="Monday";
		break;
		case 2 :currentDay ="Tuesday";
		break;
		case 3 :currentDay ="Wed";
		break;
		case 4 :currentDay ="Thursday";
		break;
		case 5 :currentDay ="Friday";
		break;
		case 6 :currentDay ="Saturday";
		break;
		case 7 :currentDay ="Sunday";
		break;
		default: currentDay = "incorrct Day";
		}
		System.out.println(currentDay);
		
		
}
}