package back_end_package;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private List<String> courses;

	public Student(List<String> list) {
		super(list.subList(0, 3));

		courses = new ArrayList<String>();
		courses.addAll(list.subList(3, list.size()));
	}

	public List<String> getCourses() {
		return this.courses;
	}

	public static void main(String[] args) {
		// List<String> list = new ArrayList<String>();
		// list.add("Jack-Van Thompson");
		// list.add("Jack@gmail.com");
		// list.add("123456789");
		// list.add("R21D21"); //CAT#
		// list.add("X32D21"); //CAT#
		// Student s = new Student(list);
		//
		// System.out.println(s.getCourses());
	}

}
