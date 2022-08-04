package ClassesAndMethods;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		add(2,3);
        //int answer = add1(4,8);
      
      System.out.println("Enter The First Number:");
      for (int i=1; i<=2; i++)
         try { Scanner input = new Scanner(System.in);
		
		
		  int x = input.nextInt();
		  System.out.println("Enter The Second Number :");
		  int y = input.nextInt();
    	
		
     // System.out.println(answer);
      System.out.println("Printing a method w : (y-x)/2");
      System.out.println(w(x,y)); // printing a method w
      System.out.println("Printing a method add1 :  X+Y");
      System.out.println(add1(x,y)); // printing method add1
     
         }catch ( Exception e)
         {
        	if (i<=1) {
        		System.out.println("Try One Last time again");
        		
        	}else {
        		System.out.println("Sorry, you missed your chance.");
        	}
         } 
         }
	
	public static void add(int x, int y) {
		// System.out.println(x + y);
	}
	int z;
	public static int add1(int x,int y) { // creating a method
		 int  z = x+y;
		return z; 
		
	}
	public static double w(int x,int y) { // creating a method
		double z = (y-x)/2;
		return z;
		
	}
	public int addition(int x, int y) {
		int total = x+y;
		return total;
		
	}
	public int addition1(int x, int y) {
		int total = x+y;
		return total;	
	}
	public double salary( double baseSalaryPerHour, double regularHours, double overTimeHours, 
			double priceOfTheProduct, double numberOfSales, double commissionsPercentage, double tax ) {
		
		double baseSalary = baseSalaryPerHour * regularHours;
		System.out.println("Base Salary is: " + baseSalary);
		
		double overTimeSalary = (baseSalaryPerHour * 1.5 * overTimeHours);
		System.out.println("overtime is : " + overTimeSalary);
		
		double commissionEarnings = (numberOfSales * priceOfTheProduct * commissionsPercentage);
		System.out.println("commission is: " + commissionEarnings);
		
		double grossIncome = baseSalary + overTimeSalary + commissionEarnings;
		System.out.println("gross income is: " + grossIncome);
		
		double netIncome = grossIncome * (1-tax);
		System.out.println("net income is: " + netIncome * tax);
		
		return netIncome;

	}
	
	
	}   
      


