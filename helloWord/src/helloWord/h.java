package helloWord;

import java.util.Scanner;

class h {
	public static void main(String[] args) {
		// TODO Auto-generated method stub {
    try (Scanner Entry1 = new Scanner(System.in)) {
    	System.out.println("  ");
    	System.out.println("Enter name:");

		// String input
		String name = Entry1.nextLine();
		System.out.println("you entered: " + name); 
		// Numerical input
		try(Scanner Entry2 = new Scanner(System.in)) {
			System.out.println("  ");
			System.out.println("Enter age:");
		
	    String age = Entry2.nextLine();
	    System.out.println("you entered:  " + age); 
	 
	    
		
	   
		try (Scanner Obj2 = new Scanner(System.in)) {
			System.out.println("  ");
			System.out.println("Enter salary:");
		double salary = Obj2.nextDouble();
		System.out.println("you entered : " + salary);
	
		
		// Output input by user
		System.out.println("  ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		
		}
	   
	}
    }}}

	




