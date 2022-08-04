package abstration;

import java.time.LocalDate;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		honda  myhonda= new honda();
		ModernCar mymoderncar = new ModernCar();
		Motor mymotor = new Motor();
		
		
		myhonda.carShape();
		myhonda.start();
		myhonda.stop();
		
		System.out.println("--------");
		
		mymoderncar.carShape();
		mymoderncar.start();
		mymoderncar.stop();
		
		System.out.println("--------");
		
		mymotor.carShape();
		mymotor.start();
		mymotor.stop();
		
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
		
		
		
		
	}

}
