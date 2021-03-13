package day22stringbuilderencapsulation;


public class StringBuilder03 {

	public static void main(String[] args) {
		
		
		//String is immutable, because of that when you want to update a string
		//JVM needs to do many tasks like creating a new controller, putting the updated value into it
		//then remove the previous String object
		String str = "Java";
		str.concat("X");
		
		//StringBuffer is created to update Strings easily but Java made the StringBuffer
		//thread-safe and synchronised but that features made the StringBuilder slow. Then
		//Java created StringBuilder which is not thread-safe and not synchronised.
		//So it worked faster than StringBuffer
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf);//JavaX
		
		//As a result If you are sure you will not need multi-threading just single threading enough for you 
		//use StringBuilder when you need to update a String. But if it is possible
		//you will use multithreading use StringBiffer
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb);//JavaX
				
		

		
	}
	
	
	
	
	
	

}
