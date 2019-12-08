package Week14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int number;
	String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Student s) {
		return number - s.number;
	}
}

public class SortTest {
	public static void main(String[] args) {
		Student array[] = { new Student(20090001, "±èÃ¶¼ö"), new Student(20090002, "ÀÌÃ¶¼ö"), new Student(20090003, "¹ÚÃ¶¼ö"), };
		List<Student> list = Arrays.asList(array);
		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);
	}
}