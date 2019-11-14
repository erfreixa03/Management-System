package back_end_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Department {
	private static final String STUDENT_STORAGE = "Data Storage/Students.txt";
	private static final String PROFESSOR_STORAGE = "Data Storage/Professors.txt";
	private static final String STAFF_STORAGE = "Data Storage/Staff.txt";
	private static final String COURSE_STORAGE = "Data Storage/Courses.txt";
	private static final String EXAM_STORAGE = "Data Storage/Exams.txt";

	private List<Student> students;

	public Department() {

	}

	/*
	 * Utilities
	 */

	// Returns a list, A, where each index is a list, B.
	// Each index in B is a data point such as: a name, room number, date, etc.
	public List<List<String>> read(String fileName) {
		List<List<String>> output = new ArrayList<List<String>>();
		List<String> linesOfData = new ArrayList<String>();

		try {
			FileReader fReader = new FileReader(fileName);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();

			while (line != null) {
				linesOfData.add(line);
				line = bReader.readLine();
			}

			bReader.close();
			fReader.close();
		} catch (Exception e) {
			throw new IllegalArgumentException("File Not Found");
		}

		for (String line : linesOfData) {
			output.add(a2l(line.split("\\|")));
		}

		return output;
	}

	//Writes to an existing file.
	//If append is true, then appends to the file on a new line.
	public void write(String fileName, String data, boolean append) {
		try {
			File file = new File(fileName);
			if (file.exists() == false) {
				throw new IllegalArgumentException("File Not Found");
			}

			FileWriter fWriter;
			if (append) {
				fWriter = new FileWriter(file, true);
				data = "\n" + data;
			}
			else {
				fWriter = new FileWriter(file);
			}
			BufferedWriter bWriter = new BufferedWriter(fWriter);

			bWriter.write(data);

			bWriter.close();
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Array to list converter
	public List<String> a2l(String[] a) {
		List<String> l = new ArrayList<String>();
		for (String s : a) {
			l.add(s);
		}
		return l;
	}

	/*
	 * Students
	 */

	public void addStudent(Student s) {

	}

	public void updateStudent() {

	}

	public void removeStudent() {

	}

	public void showStudents() {

	}

	public void showStudentInfo() {

	}

	public void findStudent() {

	}

	/*
	 * Professors
	 */

	public void addProf() {

	}

	public void updateProf() {

	}

	public void removeProf() {

	}

	public void showProfs() {

	}

	public void showProfInfo() {

	}

	public void findProf() {

	}

	/*
	 * Staff
	 */

	public void addStaff() {

	}

	public void updateStaff() {

	}

	public void removeStaff() {

	}

	public void showStaff() {

	}

	public void showStaffInfo() {

	}

	public void findStaff() {

	}

	/*
	 * Courses
	 */

	public void addCourse() {

	}

	public void updateCourse() {

	}

	public void removeCourse() {

	}

	public void showCourses() {

	}

	public void showCourseInfo() {

	}

	public void findCourse() {

	}

	/*
	 * Exams
	 */

	public void addExam() {

	}

	public void updateExam() {

	}

	public void removeExam() {

	}

	public void showExams() {

	}

	public void showExamInfo() {

	}

	public void findExam() {

	}

	public static void main(String[] args) {
		Department d = new Department();

		System.out.println(d.read("Test1.txt"));
		d.write("Test2.txt", "yo", true);
	}
}
