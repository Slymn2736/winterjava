package day13constructors;

public class Animal {
	
	/*
	 * Interview Question this explanation
	1.  Constructors must have same name with the class.
	2. Constructor names start with Upper cases(Because they match with the class names)
	 but method names start with lower cases,
	3. Methods must have "return type", but constructors must not.
	 
	 */
	
	public String name = "joe";
	public int weight = 78;
	public static boolean isHerbivourous = false;
	

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.isHerbivourous);
		
		dog.move();
		dog.eat();
		dog.drink();

	}
	
	public static void eat() {
		if(isHerbivourous) {
			System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
			
	}
	
	public static void drink() {
		System.out.println("Drinks water");
	}
	
	public static void move() {
		System.out.println("Moves");
	}
	
	
}
