package day14constructorsstatickeywordarrays;

public class Animal {
/*
 
	 Constructor call must be done in the first line every time
	 	in a constructor you can do just a single constructor call.Because, if you do multiple 
		constructor call at least one of them will not be in the first line.That contradicts 
	 	with the first rule
	 
	 */
	
	public String name; 
	public int weight;
	public boolean herbivourous;
	

	public Animal() {
		this("Joe", 33, true);
		System.out.println("1st constructor is executed");	
	}
	public Animal(String name) {
		this();
		System.out.println("2nd constructor is executed");
		this.name = name;		
	}
	public Animal(String name, int weight) {
		System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;	
	}
	public Animal(String name, int weight, boolean herbivourous) {
		System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		this.herbivourous = herbivourous;	
	}
	public static void main(String[] args) {
		
		Animal dog1 = new Animal("Tom");
		System.out.println(dog1.name);
		System.out.println(dog1.weight);
		System.out.println(dog1.herbivourous);
		
		
	}
	
	
}
