package day34maps;

import java.util.HashMap;

public class Maps01 {

	/*
	 	============Maps============
	 	Maps uses {}
	 	Maps use key-value structure
	 	Keys have to be unique
	 	Values can be repeated
	 	Keys accept "null" but only once
	 	Values accept "null"
	 	
	 	====HashMaps====
	 	HashMaps put the elements in random order
	 	It is very fast
	 	HashMap is not "thread-safe" that is HashMap objects cannot be used in multi-threading
	 	HashMap is not synchronized
	 	Keys accept "null" but only once
	 	Values accept "null"
	 	
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(101, "Milk");
		hm1.put(102, "Cheese");
		hm1.put(103, "Meat");
		hm1.put(107, "Butter");
		hm1.put(110, "Honey");
		
		//try to use same key it will overwrite
		hm1.put(101, "Apple");
		System.out.println(hm1);
		
		//try to use same value
		hm1.put(111, "Honey");
		System.out.println(hm1);
		
		//try to use null as a key
		hm1.put(null,"Orange");
		System.out.println(hm1);
		
		//try to use null as a key one more time:
		hm1.put(null,"Olive");
		System.out.println(hm1);
		
		//try to use null as a value:
		hm1.put(120, null);
		System.out.println(hm1);
		hm1.put(130, null);
		System.out.println(hm1);
		
		System.out.println(hm1.keySet());
		//keySet() returns just key in Set Collection
		
		System.out.println(hm1.values());
		// values() returns just value it returns Collection
		
		System.out.println(hm1.get(102));
		//get() method returns the specific value, it works like index
		
		System.out.println(hm1.get(50));
		//If you use get() with non existing key it will return null
		
		System.out.println(hm1.getOrDefault(400, "The product that you look for does not exist"));
		System.out.println(hm1.getOrDefault(110, "The product that you look for does not exist"));
		// If you want to get a message non-existing key you can use getOrDefault() 
		
		System.out.println(hm1.containsKey(107));//true
		System.out.println(hm1.containsKey(707));// false
		//containsKey() return if the key exists
		
		System.out.println(hm1.containsValue("Honey"));//true
		System.out.println(hm1.containsValue("Banana"));//false
		//containsValuey() return if the key exists
		
		hm1.putIfAbsent(107, "Bread");
		System.out.println(hm1);
		hm1.putIfAbsent(507, "bread");
		System.out.println(hm1);
		//putIfAbsent(key, value) puts a value if key does
		//if key exist it will keep the old one.
		
		hm1.remove(101);
		System.out.println(hm1);
		
		
		
		
		
		
		
		
		
	}

}
