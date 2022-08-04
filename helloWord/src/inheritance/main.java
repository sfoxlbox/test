package inheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		father F = new father();
		human H = new human();
		grandfather GF = new grandfather();
		son S = new son();
		ClassA A = new ClassA("", 5,"");
		
		System.out.println("calling eyecolor method from father class "+ "F.eyecolor()");
		F.eyecolor();
		System.out.println();
		System.out.println("calling son from human class "+"S.eyecolor1()");
		S.eyecolor1();
		System.out.println();
		System.out.println("calling father from grandfather class "+"F.rich()");
		F.rich();
		System.out.println("calling father from grandfather method "+"F.poor()");
		F.poor();
		System.out.println("calling communication method from human class "+"H.communitation()");
		H.communitation();
		System.out.println("calling rich method from grandfather class "+"GF.rich()");
		GF.rich();
		System.out.println("calling  grandfather  from human class "+"GF.communitation()");
		GF.communitation();
		System.out.println("calling son from grandfather "+"S.poor()");
		S.poor();
		System.out.println("calling son from grandfather "+"S.rich()");
		S.rich();
		System.out.println("calling son from human "+"S.communitation()");
		S.communitation();
		System.out.println("--------");
		S.Son();
		System.out.println(A.address);
		
		
	
		
	}

}
