package Week5;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int STUDENTS;
		double total = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("�л� �� �Է�: ");
		STUDENTS = scan.nextInt();

		int[] scores = new int[STUDENTS];


		for (int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			scores[i] = scan.nextInt();
		}

		for (int i = 0; i < scores.length; i++)
			total += scores[i];

		System.out.printf("��� ������ %.2f���Դϴ�\n", total / STUDENTS);

		scan.close();
	}
}