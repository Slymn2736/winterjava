package day24inheritanceoverriding;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		 System.out.println(dog1.height);
		 System.out.println(dog1.weight);
		 System.out.println(dog1.haveBaby);
		 System.out.println(dog1.smellwell);
		 
		 Audi audi1 = new Audi() ;
		 audi1.move();
		 
	}

}
