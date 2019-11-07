package Week2;

public class Student {
	int studentID;
	String name;
	
	Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	boolean isSamePeriod(Student s) {
		return studentID/100000 == s.studentID/100000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(201912345, "������");
		Student s2 = new Student(201812345, "��ǻ��");
		Student s3 = new Student(201954321, "�������");
		
		System.out.println("s1 == s2 : " + s1.isSamePeriod(s2));
		System.out.println("s2 == s3 : " + s2.isSamePeriod(s3));
		System.out.println("s1 == s3 : " + s1.isSamePeriod(s3));
	}
}
