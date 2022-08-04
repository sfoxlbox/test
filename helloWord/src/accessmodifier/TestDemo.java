package accessmodifier;

//public class TestDemo extends TestmodifirePrivate{
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestNomodifier tn = new TestNomodifier();
		
		TestmodifirePrivate  P = new TestmodifirePrivate();
		
		
      
      System.out.println(P.displayCar());
      System.out.println(P.displayBus());
      System.out.println(P.displayPlane());
      
      
	}

}
