package day23encapsulationinheritance;

public abstract class Encapsulation01 {
	
	private String name = "Ali Can";
	private int age = 21;
	private boolean retired = false;
	private char initial = 'A';
	private String address = "Miami Florida";
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
	//void is used a )When you print something on the console b) When you do just an action
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//For getters of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	//Make initial variable just readable, you should not create "setter", create "getter"
	public char getInitial() {
		return initial;
	}
	
	//Make address just updatable. you should not create "getter", you should create "setter"
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 1) If you want not to update any value, do not create any setter method.
	 	If you do not create any setter method it means no value can be updated, and the class
	 	is called "immutable class"
	 	Immutable class ==> make all value private and do not make any setter and getter
	 	
	 	Question: how can you make a class immutable class?
	 	Answer: Make all variables private then do not create any setter and getter
	 */


	
}
