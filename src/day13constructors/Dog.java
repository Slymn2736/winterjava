package day13constructors;

public class Dog {
	
	public String name;
	public int weigth;
	public int heigth;
	
	// I created a constructor below
	// The constructor has no any parameter
	// The constructor has nothing inside the body
	// That kind of constructor are same with the default constructors.
	// Note: If you create a constructor Java delete the "default one"
	public Dog() {
		
	}

	public Dog(String name) {
		this.name = name;
		
	}
	
	public Dog(int weigth, int heigth) {
		
	}
	
	public Dog(String name, int weigth, int heigth) {
		this.name = name;
		this.weigth = weigth;
		this.heigth = heigth ;
		
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Joe", 50, 75);
		System.out.println(dog1.name);
		System.out.println(dog1.weigth);
		System.out.println(dog1.heigth);
		dog1.sound();
		
		System.out.println("==============");
		
		Dog dog2 = new Dog("Bobby", 24, 67);
		System.out.println(dog2.name);
		System.out.println(dog2.weigth);
		System.out.println(dog2.heigth);
		dog2.sound();
		
		/*
		 NOTE:
		 If you want to access class members, you should create object from the class
		 */
		
	}

	
	public static void sound() {
		System.out.println("Dogs bark...");
		
	}
	
	
	
	
	
	
}
