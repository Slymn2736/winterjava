package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	/*
 	one more String method
 	split() method use used to split a String by using specific character/s
 	split() method puts the splitter parts into an array
	 */

	public static void main(String[] args) {
		String str = "JavaGood";
		String arr[] = str.split("a");

		System.out.println(Arrays.toString(arr));//[J, v, Good]
		
		String brr[] = str.split("");
		System.out.println(Arrays.toString(brr));//[J, a, v, a, G, o, o, d]
		
		System.out.println(brr.length);//8
		
		String str2 = "Ali can come here no I dont wanna come";
		String crr [ ] =str2.split(" ");
		System.out.println(Arrays.toString(crr));//[Ali, can, come, here, no, i, dont, wanna, come] 
		System.out.println(crr.length);//9
		
	}

}
