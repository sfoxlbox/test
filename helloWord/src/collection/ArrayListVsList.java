package collection;

import java.util.List;

import java.util.ArrayList;

public class ArrayListVsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array= new String [] {"Mortgage Calculator Verified", 
				"Amortization Calculator Verified",
				"Mortgage Payoff Calculator Verified",
				"House Affordability Calculator Verified",
				"Rent Calculator Verified",
				"Debt-to-Income Ratio Calculator Verified",
				"Real Estate Calculator Verified",
				"Refinance Calculator Verified",
				"Rental Property Calculator Verified",
				"APR Calculator Verified",
				"FHA Loan Calculator Verified",
				"VA Mortgage Calculator Verified",
				"Down Payment Calculator Verified",
				"Rent vs. Buy Calculator Verified",
				"Auto Loan Calculator Verified",
				"Cash Back or Low Interest Calculator Verified",
				"Auto Lease Calculator Verified",
				"Interest Calculator Verified"}; // array :
		List<String> list2 = new ArrayList<String>();
	      for(String text:array) {
	         list2.add(text);}
	      System.out.println(array[2]); 
		System.out.println(list2);
		
		List <Integer> arraylist = new ArrayList<>();
		
		arraylist.add(8);
		arraylist.add(5);
		arraylist.add(11);
		arraylist.add(6); 
		// you can add index to array on arraylist as much as you can not like array when the index is fixed.
		
	    System.out.println(arraylist);
	    System.out.println("arraylist.remove(0);");
	    arraylist.remove(0); 
	    System.out.println("System.out.println(arraylist.get(0));");
	    System.out.println(arraylist.get(0)); // get the value of index 0
	    arraylist.add(0,8);
	    System.out.println(arraylist);
	   List <Integer> arraylist1 = new ArrayList<>();
	
	   arraylist1.add(11);
	   arraylist1.add(6);
	   arraylist1.add(11);
	   arraylist1.add(0,7); //add to first index
	   arraylist1.add(1,7); // add to second index
	   arraylist1.add(4,55); // add to 4th index
	   
	   
	   System.out.println(arraylist1);
	   System.out.println("displaying array elements");
	   for (int x : arraylist1) {
	   System.out.print(x+ " " );
	  
	  
	   }
	   System.out.println();
	   System.out.println("System.out.print(arraylist.get(0) + \" \"+ arraylist1.get(4));");
	   System.out.print(arraylist.get(0) + " "+ arraylist1.get(4));
		
	}

}
