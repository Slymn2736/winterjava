package day07stringmethods;

import java.util.Scanner;

public class StringMaipulation01 {

	public static void main(String[] args) {
		
		String str ="Java is Java";
		
		// 12. endsWith() is used to check the last character in a String.
		//     endsWith() is used with Strings do not use it with chars.
		//       "        can be used with multiple characters as well
		//       "        returns boolean.
		System.out.println(str.endsWith("a")); // true
		System.out.println(str.endsWith("x")); // false
		System.out.println(str.endsWith("ava")); // true

		//13. startsWith is used to check the first character in a String.
		//     endsWith() is used with Strings do not use it with chars.
		//       "        can be used with multiple characters as well
		//       "        returns boolean.
		
		System.out.println(str.startsWith("J")); // true
		System.out.println(str.startsWith("Java")); // true
		
		//if you want to check the character in a specific index do the following
		System.out.println(str.startsWith("i", 5)); //true
		System.out.println(str.startsWith("is", 5)); //true
		
		//14. isEmpty() is used to check if a String has zero character or not
		//  if a String has no any character isEmpty() return true, otherwise returns false
		System.out.println(str.isEmpty()); //false
		String str2 = "";
		System.out.println(str2.isEmpty()); // true);
		
		//15 replace() is used to change a specific character/s to another one.		
		System.out.println(str.replace("a", "x"));
		System.out.println(str.replace("ava", "x"));
		System.out.println(str.replace("a", "xxxxxx"));
		// replace() method can be used to delete character/s.
		System.out.println(str.replace("a", ""));
		// in this method char and String can used, both can be char or both can be String
		System.out.println(str.replace('a', 'x'));
		
		//16. replaceAll() does the same with replace method
		// there are some differences 
		//1 in replaceAll you can not use chars, in replace() you can.
		//2 in replaceAll you can use regular expressions.
		System.out.println(str.replaceAll("a", "x"));
		
		String str3 = "Java123 learn, earn_money!!  .";
		
		/*Regular Expressions==> 1. \\s:Space character
								 2. \\S: all characters except space character
								 3. \\w: a->z     A->Z     _     0->9	
								 4. \\W: All character except a->z     A->Z     _     0->9	
								 5. \\d: 0->9
								 6. \\D: All characters except 0->9
		*/
		
		System.out.println(str3.replaceAll("\\s", "*"));
		System.out.println(str3.replaceAll("\\S", "*"));
		System.out.println(str3.replaceAll("\\w", "*"));
		System.out.println(str3.replaceAll("\\W", "&"));
		System.out.println(str3.replaceAll("\\d", "@"));
		System.out.println(str3.replaceAll("\\D", "+"));
		
		//17. replaceFirst() changes just the first occurence of the character
		System.out.println(str3.replaceFirst("a", "*"));
		
		//18. substring() is used to get a part of the String by using indexes.
		String str4 = "Java is the best";
		System.out.println(str4.substring(3));
		System.out.println(str4.substring(7));
		// if you use last index it return s last character because indexes used in substring() are inclusive
		System.out.println(str4.substring(15));
		//System.out.println(str4.substring(0)); and System.out.println(str4.); are same
		System.out.println(str4.substring(0));
		// if you use length in substring method it return "nothing"
		System.out.println(str4.substring(16));
		// if you use any index greater than the length it return "StringIndexOutOfBoundsException"
//		System.out.println(str4.substring(17));
		
		
		/*
		 Ask user to enter a String 
		 if the first end the last character of the String are same 
		 print "Wooow!"
		 otherwise print "Hmmmm"
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scan.nextLine();	
		// length()-1 everytime gives you the last index
		String last = s.substring(s.length()-1);
		// substring() can be used with 2 parameter.
		// First parameter is starting index(inclusive), second parameter is ending index(exclusive)
		String first = s.substring(0,1);
		
		if(last.equals(first)) {
			System.out.println("Wooow!");
		}else {
			System.out.println("Hmmmmm");
		}
		
		String str5 ="Java is an OOP language";
		System.out.println(str5.substring(5,14));// is an OOP
		
		System.out.println(str5.substring(2,3)); // v
		// if start and end is same you get nothing
		System.out.println(str5.substring(2,2));// nothing
		// in substring method starting index cannot be larger then ending index.
	//	System.out.println(str5.substring(3,2));
		
		/*
		 When we type codes we may get 2 types of error message
		 1) While you type code you may get "red underline" this type of error is called "compile Time Error"
		 2) While you type code you don not get any red underline,
		 but when you run the code you will get some red messages on the console.
		 that kind of errors are called "Run Time Error"
		 
		 */
		
	
		
		
		}
	 
	}


