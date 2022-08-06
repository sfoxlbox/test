package nonprimitive;

public class springmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbr = new StringBuffer("facebook");
		
		sbr.append(" is Blue");
		System.out.println(sbr);
		
		sbr.delete(2, 5); // delete index from String
		System.out.println(sbr); 
		sbr.delete(2, 4); // delete index from String
		System.out.println(sbr); 
		System.out.println(sbr.length()); 
		sbr.insert(5, " app"); // insert index to a stringbuffer.
		System.out.println(sbr);
		sbr.delete(0, 15); // delete the whole string based on the number of indexes.
		System.out.println(sbr);
		sbr.insert(0,"Facebook is Blue"); // replace string with new String 
		System.out.println(sbr);
		System.out.println(sbr.length()); 
		sbr.insert(16, " Color"); // add string after the last index. 
		System.out.println(sbr);
		
		
	    
	}


	}
