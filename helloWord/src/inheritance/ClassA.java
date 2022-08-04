package inheritance;

public class ClassA {

	public String name; // variable
	public int age ;     // 
	public String address ;  // 
	
	public ClassA (String name, int age, String address) { // constractor must have the same name as class
		 // name1 age address are called parameters 
		
		 this.name = name; // calling parameter from public name
		 this.age = age;
		 this.address = address;
		 
		 System.out.println(name);
}}
