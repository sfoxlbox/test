package loop;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{2,5,9},{7,2,6},{8,4,1},{0,3,7},{45,74,56}};
		
		System.out.println("The array length is: " + arr.length);
		System.out.println("***************************");
		for(int row=0; row<5; row++) {
		for( int column=0; column<3; column++) {
			// System.out.print(arr[row][column] + "  ");
		 if (row >=4) {
			 System.out.print(" "+ arr[row][column] +" ");
		 }
		 else {
			 System.out.print("  "+ arr[row][column] + " ");
		}
			} 
		System.out.println();
		
	
		
		}
		    System.out.println();
		    System.out.println("*** This is how you print it Manually ***");
			System.out.print(" " + arr[0][0] + "  ");
			System.out.print(" " +arr[0][1] + "  ");
			System.out.println(" " +arr[0][2] + "  ");
			System.out.print(" " +arr[1][0] + "  ");
			System.out.print(" " +arr[1][1] + "  ");
			System.out.println(" " +arr[1][2] + "  ");
			System.out.print(" " +arr[2][0] + "  ");  
			System.out.print(" " +arr[2][1] + "  ");
			System.out.println(" " +arr[2][2] + "  ");
			System.out.println();
			
			String arr2[][]= {{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"}};
			
			System.out.println("The array length is: " + arr2.length);
			
			System.out.println("***************************");
			for(int x=0; x<4; x++) {
			for( int y=0; y<3 ; y++) {
				
				System.out.println(" x =" + x + " , y= " + y);
				
				
				}
			System.out.println();
			}
			System.out.println("***************************");
			
			String arrt[][] = {{" "," "," "," "," "," "},{" "," "," "," "," ","*"},{" "," "," "," ","*","*"},{" "," "," ","*","*","*"},{" "," ","*","*","*","*"},{" ","*","*","*","*","*"}};
			
			System.out.println("Array indexes are : " +arrt.length);
			int k =0;
			int x = 5;
			// int count = 3;
			while ( k<x) {
				
			for(int z=0; z<5; z++) {
				for( int y=0; y<6 ; y++) {
				
				System.out.print(arrt[z][y]);
				System.out.print(arrt[z][y].trim());
				
				}
			 System.out.println(); 
			
			 
			}
			
			for(int z=4; z>-1; z--) {
				for( int y=0; y<=5 ; y++) {
					
					
					System.out.print(arrt[z][y]);
					System.out.print(arrt[z][y].trim());
					}
				System.out.println();
				 k++;}
			
			}
			    System.out.println(" ");
			    System.out.println("*** This is how you print it Manually ***");
			    System.out.println();
				System.out.print(arr2[0][0] + "  ");
				System.out.print(arr[0][1] + "  ");
				System.out.println(arr2[0][2] + "  ");
				System.out.print(arr[1][0] + "  ");
				System.out.print(arr2[1][1] + "  ");
				System.out.println(arr[1][2] + "  ");
				System.out.print(arr2[2][0] + "  ");
				System.out.print(arr[2][1] + "  ");
				System.out.println(arr2[2][2] + "  ");
			
				//for(int xx=10; xx<50; xx++) {
				//	for( int y=5; y<=xx; y++) {
				//		if ( xx-y <=0 ) {
				//			System.out.print( "X");
				//			break;
				//		} else {
				//			System.out.print( " ");
				//			break;
						}
			}

