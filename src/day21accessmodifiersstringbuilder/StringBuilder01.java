package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		//How to: create a String by using "StringBuilder Class"
		//1. Way
		StringBuilder sb1 = new StringBuilder();
		//If you will add new characters constantly int you String use 1st way
		System.out.println(sb1); //Empty String
		
		System.out.println(sb1.capacity());// 16 is the default capacity
		
		sb1.append("Ali Can");
		sb1.append(" is a student");
		System.out.println(sb1); //Ali Can
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		//If you will create an ordinary String use 2nd way
		System.out.println(sb2);
		
		//3. Way:
		
		StringBuilder sb3 = new StringBuilder(5); //If you are sure about the length of the String use 3rd way
		sb3.append("Javax");
		
		System.out.println(sb3.capacity());//5 <== it returns the capacity of the StringBuilder field
		
		System.out.println(sb3.length());//4 <== it returns the number of characters
		
		
		//StringBuilder Methods
		//1.appands in method chain
		StringBuilder sb4 = new StringBuilder("Java");
		sb4.append("x").append("y").append("z");
		System.out.println(sb4);//javaxyz
		
		//2. 
		sb4.append("mnr", 1, 2); // If you want to add some characters from a String use append() method like that
		System.out.println(sb4); //Javaxyzn
		
		System.out.println(sb4.charAt(5));//y
		
		sb4.append("$12.99", 1, 6); 
		System.out.println(sb4); //Javaxyzn12.99
		
		
		sb4.delete(4, 8);
		System.out.println(sb4); //Java12.99
		
		sb4.deleteCharAt(6);
		System.out.println(sb4); //Java1299
		
		StringBuilder sb5 = new StringBuilder("Java1299");
		
		//StringBuilder equals() method is different form String equals() method.
		//StringBuilder equals method returns true just for same objects.
		//If you use StrigBuilder method with different objects whose values are same, you will get false
		System.out.println(sb5.equals(sb5));
		
		System.out.println(sb4.indexOf("1")); //4
		
		sb4.insert(3, "CCCCCC"); // 3 is the starting index
		System.out.println(sb4); //JavCCCCCCa1299
		
		sb4.insert(11, "Program", 1, 4);
		System.out.println(sb4); //JavCCCCCCa1rog299
		
		sb4.replace(3, 9, "***");
		System.out.println(sb4);//Jav***a1rog299
		
		sb5.reverse();
		System.out.println(sb5); //9921avaJ
		
		sb4.setCharAt(7, '9');
		System.out.println(sb4); //Jav***a9rog299
		
	
		System.out.println(sb4.subSequence(3, 6));//***
		System.out.println(sb4); //Jav***a9rog299
		
		sb4.trimToSize(); // Attempts to reduce storage used for the character sequence.
		
		
		
		
		
		
		
		
		
	}

}
