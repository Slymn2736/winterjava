package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc05 {

	/*
	 1) "throws" keyword is used for"checked exception"
	 2) "throws" keyword is used when we do not want to handle exception
	 3) After "throws" keyword, you can use multiple Exception classes by putting comma between them
	 4) "throws keyword cannot be used in method body, It must be used in method name line
	 5)After throws keyword if you use child and parents exception classes together it works, but not recommended
	 	because when you use just parent it will cover the child.
	*/
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("\\Users\\gulsl\\eclipse-workspace\\Java Lessons\\winterjava\\src\\day26exceptions\\FileForExc");
		
		int k = 0;
	
		while((k = fis.read()) != -1) {
			
			System.out.print((char)k);
			
		}

	}

}
