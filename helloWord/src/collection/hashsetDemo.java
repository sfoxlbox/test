package collection;

import java.util.HashSet;
import java.util.Set;

public class hashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hashset = new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		
		boolean r1 = hashset.add("C"); // add C to array
		System.out.println(r1);
		hashset.add("C");
		
		boolean r2 = hashset.add("C"); // add C to array again
		System.out.println(r2);        // false cause it will not take C twice. it cant not add duplicated values
		hashset.add("C");
		
		boolean r3 = hashset.add("D"); // add D to array
		System.out.println(r3);        // True cause it will take C twice. it cant not add duplicated values
		hashset.add("D");
		
		boolean r4 = hashset.add("D"); // add D to array again
		System.out.println(r4);        // false cause it will not  take D twice. it cant not add duplicated values
		hashset.add("D");
		
		
		
		System.out.println(hashset);
		System.out.println(hashset.size());
		System.out.println("Does hashset has E ? " + hashset.contains("E")); // we can only use hashset to verify a value not to count how many are there.
		
		hashset.remove("C");
		

		for ( String x : hashset) {    // assign hashset to x ( item : container)
			System.out.print(x + " "); //how we print hashset through x 
			
		}
		System.out.println();
		hashset.add("C");
		System.out.println(hashset);
		
		
		
		}
		
	}

	


