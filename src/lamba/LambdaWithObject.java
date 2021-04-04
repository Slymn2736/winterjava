package lamba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithObject {

	public static void main(String[] args) {
		
		//Create 4 objects by using Course class
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
				
		//Add them into a list
		List<Course> list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		
	//	System.out.println(list);
		System.out.println(checkAvg(list));//false
		System.out.println(containDay(list));//false
		System.out.println(numberStudent(list));//true
		System.out.println(numberStudentHoundred(list));//true
		sortNatural(list);
		System.out.println("==============");
		sortRev(list);
		System.out.println("==============");
		sortRevName(list);
		

	}
	
	//Check if all average scores are less than 98
	public static boolean checkAvg(List<Course> list) {
		return list.stream().allMatch(t->t.getAverageScore()>98);	
	}
	//Check if all course names contain “Day” word

	public static boolean containDay(List<Course> list) {
		return list.stream().allMatch(t->t.getCourseName().contains("Day"));
		
	}
	//Check if any number of students is 154
	public static boolean numberStudent(List<Course> list) {
		return list.stream().anyMatch(t->t.getNumberOfStudents()==154);
		
	}
	//Check if no number of students is 100
	public static boolean numberStudentHoundred(List<Course> list) {
		return list.stream().noneMatch(t->t.getNumberOfStudents()==100);
		
	}
	//Sort the elements in natural order according to the average score
	public static void sortNatural(List<Course> list) {
		
		list.stream().sorted(Comparator.comparing(Course::getAverageScore))
		.forEach(t->System.out.println(t));
		
	}
	//Sort the elements in reverse order according to the number of students
	public static void sortRev(List<Course> list) {
		
		list.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
		.forEach(System.out::println);
		
	}
	//Sort the elements in reverse order according to the course name
	public static void sortRevName(List<Course> list) {
		
		list.stream().sorted(Comparator.comparing(Course::getCourseName).reversed())
		.forEach(System.out::println);
	}

}
