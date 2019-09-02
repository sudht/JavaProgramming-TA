package Week5;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int STUDENTS;
		double total = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수 입력: ");
		STUDENTS = scan.nextInt();

		int[] scores = new int[STUDENTS];


		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}

		for (int i = 0; i < scores.length; i++)
			total += scores[i];

		System.out.printf("평균 성적은 %.2f점입니다\n", total / STUDENTS);

		scan.close();
	}
}