package day21accessmodifiersstringbuilder;

import day20passbyvaluepassbyreferencedate.AccessModifier03;

public class AccessModifier02 {
	
	/*
	 1) To access a class member in another class you have 2 ways;
	 	a)You can use "class name" ==> Use that way for "static class members"
	 	b) You can use object of the class ==> Use that way for "non-static members"
	 2) If a class member is private you cannot access from another classes
	 3) If you do not type anything for access modifier, it means access modifier is "default"
	 NOTE: If a class member has "Default" access modifier, then you cannot access to it from another packages
	 		"default " and "package private" are synonyms
	 4) In java, some classes can be "child" of another classes
	 	If something is "protected", they can be accessed from child classes
	 */

	public static void main(String[] args) {
		
		AccessModifier01 obj1 = new AccessModifier01();
		System.out.println(obj1.name);
		
		System.out.println(obj1.schoolName);
		
		AccessModifier03 obj2 = new AccessModifier03();
		System.out.println(obj2.age); // age is public, because of that it is accessible from other packages
		
		
		

	}

}
