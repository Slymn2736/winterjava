package day22stringbuilderencapsulation;

public class StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("1ava");
		StringBuilder sb2 = new StringBuilder("3ava");
		//equals in StringBuilder returns false even the values are same.
		//Because equals method in StringBuilder uses "==" in it
		System.out.println(sb1.equals(sb2));//false

		//How can we compare the values of StringBuilder?
		// 1.Way: concert StringBuilder to String then use equals method
		System.out.println(sb1.toString().equals(sb2.toString()));// true
		
		//2.Way: Use compareTo() method
		System.out.println(sb1.compareTo(sb2));//0 ==> StringBuildrs have same characters, Equals
		// If you get "0" be sure StringBuilder values are same 
		
		
		
	}

}
 