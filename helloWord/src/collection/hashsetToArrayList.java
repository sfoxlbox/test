package collection;


import java.util.HashSet;


public class hashsetToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> h_set = new HashSet<String>();
		System.out.println("First h_set is empty :"+ h_set); // h_set is empty
		
		h_set.add("Red");
		h_set.add("Blue");
		h_set.add("Volvo");
		h_set.add("Orange");
		h_set.add("yellow");
		h_set.add("Black");
		
		System.out.println("Second, We added values : "+ h_set ); 
		System.out.println("We are getting  the size of the Hashset : "+ h_set.size() + " and creating new array with length 6");
		String [] new_array = new String[h_set.size()]; //getting the size of new_array from h_set
		System.out.println( );
		System.out.println("converting h_set to array  : h_set.toArray(new_array) "); 
		h_set.toArray(new_array);  // converting h_set to array
		System.out.println(new_array[2]);
		System.out.println("The length of the new array is size of Hashset : "+ new_array.length); 
		System.out.println();
		for(int x = 0 ; x < h_set.size() ; x++ ) {
			System.out.print(new_array[x]+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("As example, We are printing array at index 4 which is "+ new_array[4]);
		System.out.println("Dont forget Array starts with index 0.");
		System.out.println();
		System.out.println("here We will get the value of array after converting it with inhanced 'for loop' ");
		for(String x : new_array) {
			System.out.print(x+ " "); 	
		}
		
		
		
		
	}

}
