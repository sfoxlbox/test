package ClassesAndMethods;

import java.util.Scanner;

public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {	
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter base Salary Per Hour :");
		  int x = input.nextInt();
		  System.out.println("Enter regular Hours :");
		  int y = input.nextInt();
		  System.out.println("Enter over Time Hours :");
		  int z = input.nextInt();
		  System.out.println("Enter price Of The Product :");
		  int w = input.nextInt();
		  System.out.println("Enter number Of Sales :");
		  int o = input.nextInt();
		  System.out.println("Enter commissions Percentage :");
		  double r = input.nextDouble();
		  System.out.println("Enter tax :");
		  double p = input.nextDouble();
		  
		  
		  
		  
		Math Math2 = new Math(); // creater new Math Class
		System.out.println(Math2.salary(x,y,z,w,o,r,p)); // passing variables to salary from The class Math
		
		System.out.println("passing addition method from Math class.");
		System.out.println("Math.addition(x, y) " + Math2.addition(x, y)); //passing addition method from Math class.
	}
catch ( Exception e) {}
}
}
