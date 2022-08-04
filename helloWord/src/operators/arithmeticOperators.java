package operators;

public class arithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Operator " = "
		int x =1;
		int y = 2;
		int result = x+y;
		int result1 = x+y; 
		int Original_result;

		System.out.println("Result is x + y = " + result);
		
		result = result -1; 
		Original_result = result;
		
		System.out.println("Result is result -1 = " + Original_result);
		
		result = result * 2;
		Original_result = result; 
		
		System.out.println("result is result * 2 = " + Original_result);
		
		result = result / 2;
		Original_result = result;
		
		System.out.println("result is result / 2 = " + Original_result);
		
		Original_result = result1;
		System.out.println("Result is x + y = " + result );
		System.out.println("Result is x + y = " + result1 );
		
	}		
}
