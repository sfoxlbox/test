package collection;

import java.util.HashMap;


public class hashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Blue", "x");  // blue is key and x is value
		map.put("Red", "y");   
		map.put("Orange", "z");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for (String i : map.keySet()) { // get they keys
			
			System.out.print(i+ " ");
			
		}
		System.out.println();
       for (String i : map.values()) { // get they values
			
  			System.out.print(i+ " "); 
        }
       System.out.println();
		if ( map.containsKey("Blue")) {
			String Blue = map.get("Blue");			
			System.out.println("The value of Blue is : "+  Blue); // we can get values from keys.
		}
		System.out.println();
		if ( map.containsValue("x")) {
			String x = map.get("x");			
			System.out.println("The key of x is : "+  x); // we cant get keys from values. 
		}
		
		//String [] array = new String[map.size()];
		//System.out.println(array.length);	
		
	}

}
