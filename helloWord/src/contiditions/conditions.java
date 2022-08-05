package contiditions;
import java.util.Scanner;
public class conditions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (Scanner Entry1 = new Scanner(System.in)) {
		    	System.out.println("Enter Score:");
		int score = Entry1.nextInt();
		char grade;
		System.out.println("You entred " + score);
			
		if (score >= 90) {
			grade ='A';
			System.out.println(grade);
		}
			else if(score >= 80) {
				grade ='B';
				System.out.println(grade);
			}
			else if(score >= 70) {
				grade ='C';
				System.out.println(grade);
			}
			else if (score <70) {
				grade ='D';
				System.out.println(grade + " u failed");
			}
			else {
				System.out.println("F");
			}
		}
		 }
	}


