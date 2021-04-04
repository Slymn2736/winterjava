package day35maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertCsvToMap {
	/*
 	method to convert a csv file to a map
		Example: Name, Ali
	         Id, 101
	         City, Miami    ==>   {Name=Ali, Id=101, City=Miami}
	 */

	public static void main(String[] args) {
		convertCsvToMap();

	}
	public static Map<String, String> convertCsvToMap(){
		
		BufferedReader br;
		List<String> linesList = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		
		try {
			br = new BufferedReader(new FileReader("Users\\gulsl\\eclipse-workspace\\Java Lessons\\winterjava\\src\\day35maps\\myFile"));
			String lines = br.readLine();
			
			while(lines!=null) {
				linesList.add(lines);
				lines = br.readLine();
			}
		
		} catch (IOException e) {
			System.out.println("File could not be read" + e.getMessage());
		}
		System.out.println(linesList);
		
		for(String w : linesList) {
			String arr[] = w.split("");
			hm.put(arr[0].trim(), arr[1].trim());
		}
		System.out.println(hm);
		
		return hm;
	}
	

}
