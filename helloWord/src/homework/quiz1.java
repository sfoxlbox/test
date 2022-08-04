package homework;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class quiz1 {
public static void main(String[] args) {
	  
	  
	try (Scanner Entry = new Scanner(System.in)) {
    	
    	System.out.println("Enter The 1st Word:");
    	String Word1 = Entry.nextLine();
    	System.out.println("Enter The 2nd Word:");
    	String Word2 = Entry.nextLine();
    	System.out.println("Enter The 3th Word:");
    	String Word3 = Entry.nextLine();
	 
    	HashSet<String> input = new HashSet<String>();
    	
    	input.add(Word1);
    	input.add(Word2);
    	input.add(Word3);
    	
        //System.out.println("You Entered : " + input);
        String[] array = new String[input.size()];
        input.toArray(array);
        System.out.println("You Entered : ");
        for(String x : array) {
			System.out.print(x+ " "); 	
		}
	
}
	catch ( Exception e) {
		System.out.println("Error!! try again");
	}
	
	
}}


