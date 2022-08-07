package collection;

import java.util.HashMap;


public class hashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		String arr1[][] = {{"A","B","C","D"},{"Aa","Bb","Cc","Dd"},{"Aaa","Bbb","Ccc","Ddd"},{"A1","B1","C1","D1"},{"A2","B2","C2","D2"}};
		map.put(arr1[0][1], "x");  // blue is key and x is value
		map.put(arr1[1][0], "y");   
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
			String blue = map.get(arr1[0][1]);			
			System.out.println("The value of Blue is : "+  blue); // we can get values from keys.
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
