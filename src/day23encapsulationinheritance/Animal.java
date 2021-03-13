package day23encapsulationinheritance;

public class Animal {
	
	/*
	 1) Why do we need inheritance?
	 
	 2) What are the benefits of inheritance?
	 	a) No repetition
	 	b) less coding
	 	c) Easy update
	 	d) Easy maintenance
	 	
	 3) We store common class members(variables or method) into parents "Super" Class
	 	
	 4) We store specific class members into Child "Sub" classes
	 	
	 5) Private class members in Super Class cannot be used by Sub class
	 	
	 6) If Sub Class and Super Class are in same package then Sub Class can use the default
	 	class members in Super Class
	 	
	 7) Sub Classes can use all protected class members in Super class
	 	
	 8) For public and protected access modifiers inheritance works without any issue
	 	
	 9) For private access modifiers there is no inheritance
	 	
	 10) For default access modifiers you should be careful
	 	
	 */
	
	
		public void eat() {
			System.out.println("They eat...");
		}
		
		public void drink() {
			System.out.println("They drink...");
		}
	

	
	
	
	
	
	
	
}
