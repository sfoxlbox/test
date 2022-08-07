package collection;

import java.util.ArrayList;
import java.util.List;

public class collection {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	int arr[][]= {{2,5,9,4},{7,2,6,5},{8,4,1,5},{0,3,7,7},{5,6,0,4}};
	String arr1[][] = {{"A","B","C","D"},{"Aa","Bb","Cc","Dd"},{"Aaa","Bbb","Ccc","Ddd"},{"A1","B1","C1","D1"},{"A2","B2","C2","D2"}};
		arr1.equals(arr);
		System.out.println("The array length is: " + arr.length);
		System.out.println("=====================================");
		for(int row=0; row<5; row++) {
		for( int column=0; column<4; column++) {
	    System.out.print(arr[row][column] + "  ");
	    System.out.print(arr1[row][column] + "  ");
	    
	     }
		System.out.println();
		}
		System.out.println("=====================================");
		
		List <Integer> arrayList = new ArrayList<Integer>(); // declaring array list is 5
		System.out.println(arrayList);
	
		for (int i = 0; i <= 7; i++) {
			arrayList.add(i);
		}
			System.out.println(arrayList);
			
			System.out.println("Remove value 0 from an index 0");
	     arrayList.remove(0);
	     System.out.println(arrayList);
	     
	     arrayList.add(0,0);
	     System.out.println("add value 0 to an undex 0");
	     System.out.println(arrayList);
	     System.out.println("add value 8 to 8th index 8");
	     arrayList.add(8,8);
	     System.out.println(arrayList);
	     System.out.println(arrayList.size());
	     
	     for (int i = 0; i <= 7; i++) {
	     System.out.print(arrayList.get(i) + " "); 
	     }
	     
		}}
	


