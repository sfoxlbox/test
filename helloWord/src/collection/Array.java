package collection;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The number of Friends");
		int num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt(); // num will go to array
		
		String[] Friends = new String[num]; // Assigned num to array.
		for(int x = 0 ; x < num; x++ ) { // num is the number of entries to calculate.
			System.out.println("Enter names " + (x+1));
			Friends[x] = input.next();  // input the names from num to the array
			
		}
	
		
		System.out.println("you have " + num + " Friends.");
		System.out.println("");
		System.out.println("Their names are : ");
		for(int x = 0 ; x < num; x++ ) { // print array using x 
		System.out.println("-" + Friends);
		
		}}}

	


	

