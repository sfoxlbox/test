package operators;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {
		
		int value1 = 1;
		int value2 = 2;
		if (( value1 == 1) && (value2 == 2)) // both have to true
		System.out.println( "value1 = " + value1 +" AND "+ " value2 = " + value2);
		
		if (( value1 == 1) || (value2 == 2)) // one of them is true
			System.out.println( "value1 = " + value1 +" OR "+ " value2 = " + value2);

}
}
