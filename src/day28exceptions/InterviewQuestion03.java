package day28exceptions;

public class InterviewQuestion03 {
	
	/*
	 	Create a method like;
	 	"aabbbbaaad" ==> a2b4a3d1
	*/

	public static void main(String[] args) {
		
		String str = "aabbbbaaadddddd";
		System.out.println(getCharAndNum(str));
	}
	
	public static String getCharAndNum(String str) {
		
		int count = 1;
		String result = "";
		
		for(int i=1; i<str.length(); i++) {
			
			if(str.substring(i-1,i).equals(str.substring(i,i+1))) {
				count++;
			}else {
				result = result + str.substring(i-1,i) + count;
				count = 1;
			}
	
		}
		return result;
		
	}
		

	
}
