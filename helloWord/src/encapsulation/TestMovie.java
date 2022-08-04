package encapsulation;

import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie movie = new Movie();
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter Title :");
		  String x = input.nextLine();
		  System.out.println("Enter Rating :");
		  String y = input.nextLine();
		
		  movie.setTitle(x);
		  movie.setRating(y);
		
		System.out.println(movie.getTitle());
		System.out.println(movie.getRating());
		
		
	}

}
