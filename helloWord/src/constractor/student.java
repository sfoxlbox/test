package constractor;

public class student {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	public String name; // variable
	public int age;     // 
	public String address;  // 
	
	public student (String name1, int age, String address) { // constractor must have the same name as class
		 // name1 age address are called parameters 
		
		 name = name1; // calling parameter from public name
		 this.age = age;
		 this.address = address;
		 
	}
	//}

}
