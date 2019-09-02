package Week2;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String university = "강원대학교";
		String department = "컴퓨터학과";
		int stdID = 201912345;
		String stdName = "홍길동";
		double score = 98.7654321;
		
		String str = university + " " + department + "\n" + stdID + " " + stdName;
		System.out.println(str);
		System.out.printf("%.5f", score);
	}
}
