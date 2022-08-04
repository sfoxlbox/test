package nonprimitive;

import java.util.Scanner;

public class test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int month;
		
		for (int i = 0; i<= 3; i++) { 	
		 
		try {
			
		System.out.println("            ************************");
		System.out.println("            Enter The Month Number:");
		System.out.println("            ************************");
		
		try (Scanner input = new Scanner(System.in)) {
			month = input.nextInt(); // month will go to array
		}
			String seasons[] = {"Fall" ,"Spring", "Summer","winter"};
		String names[] = {"Jan","Feb","march","April","May","Aug"};
		String names2[] = {"June","July","Sep","Oct","Nov","Dec"};
		
    	
		if (month >0 && month <= 6) {
			 System.out.println("            You entered: " + month + " which is " + (names[month-1]));
			 System.out.println("  ");
		}
		else if (month >6 && month <=12 ){
			
	         System.out.println("            You entered: " + month + " which is " + (names2[month-7]));
	         System.out.println("  ");
	 	             
		}
		else if ( month<  0 || month >= 13) {
			 System.out.println("            You entered: " + month + " which is  N/A");
			 System.out.println("  ");
		}
		
	        	if (month >= 9 && month < 12) { 
	        	System.out.println("            this is " + seasons[0]);
	        	 System.out.println("  ");
	        	 
	        	
	        }
	        	else if (month>=6 && month<9) {
	        	System.out.println("            this is " + seasons[2]); 
	        	 System.out.println("  ");
	        	 
	        
	        }
	        	else if (month>=3 && month<6) {
	        	System.out.println("            this is " + seasons[1]); 
	        	 System.out.println("  ");
	        	
	        
	        	}
	        	else if (month>=1 && month<3) {
	        	System.out.println("            this is " + seasons[3]);
	        	 System.out.println("  ");
	        	 
	        
	        		
	        	}
	        
	        	for (int j = 0; month >= 9 && month <= 12; j++ )
	        	{
	        		System.out.println( "            It is getting cold");
	        		 System.out.println("  ");
	        		 break;
	        	}
	        
		}
		
	        	
			catch (Exception e) {
				if ( i <= 0 ) {
					
					System.out.println("            You can only try 3 Times.");
					
			    }
				else  {
					System.out.println("  "); 
					System.out.println("            You can only try 3 Times.");
					System.out.println("              Something went wrong.");
					System.out.println("            This is your try # : " + (i+1));
				    System.out.println("              Enter a Number Again");
				    System.out.println("  ");	
				}
			}}}}


