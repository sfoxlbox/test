package Polymorphism;

public class Overloading {

	public void add ( int a, int b)
	{
		int total = a+ b;
		System.out.println(total);
	}
	public void add ( int a, int b, int c)
	{
		int total = a+ b + c;
		System.out.println(total);
	}
	public void add ( String a, String b, String c)
	{
		String total = a+ b + c;
		System.out.println(total);
	}
	
}
