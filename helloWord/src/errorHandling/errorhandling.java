package errorHandling;

import java.util.Scanner;

public class errorhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number:");
		System.out.println("You Have 3 Chances");
		// System.out.println("This is your try Number #"+ i );
		for ( int i=1 ; i<= 4; i++) {
		try{
			Scanner input = new Scanner(System.in);
			
		int Enter = input.nextInt();
		
		System.out.println("You Entered The Number : "+ Enter);
		break;
		
		
	}
        catch ( Exception e) {
        	
        	if(i <=1 && i <=2) {
        		System.out.println();
        		System.out.println("<< Exception has happened. >>");
        		System.out.println();
        	}
        
		if(i <=2 ) {
        	System.out.println("This is your try Number #"+ i + " Try Again");
		} else if (i <=3){
			System.out.println("This is your try Number #"+ i + " Try one Last time");
		}
        	 else if ( i>= 3) {
   			System.out.println("you have tried 3 times. please Reset your accout");
   		 }
        }}}
		
        
	
	}


	

