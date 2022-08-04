package mystring;

public class mystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 1;
		int y = 3;
		String num1 ="1";
		String num2 ="3";
		String name1 ="Adam";
		String name2 ="Jeff";
		
		
		System.out.println(x+y);
		System.out.println(num1+num2);
		System.out.println(name1 +" " + name2);
		System.out.println(x +" " + name2);
		
		String str =" i am starting Selenium Course "; // String can be using for everything.
		String str1 = "i am starting Selenium Java";
		String hi ="hey what is up";
		String hello ="hello world how are you ";
		String word[] = hello.split("d"); // split the string in to array where there is a space " ".
		String hello1 = hello.replace("hello", "Hi"); // replace a word in a string
		String hello2 = hello1.replaceAll(hello1, hi ); // replace the whole sting
		
		
		System.out.println(str);
		System.out.println(str.length()); // to know the length - it starts from 1.
		System.out.println(str.charAt(6)); // asking the index character in the string starting from 0.
		System.out.println(str.indexOf("s"));
		System.out.println(str.lastIndexOf("i")); 
		System.out.println(str.equals(str1)); // compare 2 strings. // true or false result
		System.out.println(str.endsWith("e")); // true or false result.
		System.out.println(str.trim()); // delete the space in the beginning and end.
		System.out.println(word[0]); // print index 0
		System.out.println(word.length);
		System.out.println(str.replace("world", "Team"));
		System.out.println(hello1);
		System.out.println(hello2);
		
		
		
	}

}
