package Week2;

import java.util.Scanner;

public class Dormitory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grade, total;
		int volunteerTime, bonusPoint;
		Scanner input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		grade = input.nextDouble();
		System.out.print("����ð��� �Է��Ͻÿ�: ");
		volunteerTime = input.nextInt();
		System.out.print("�������� �Է��Ͻÿ�: ");
		bonusPoint = input.nextInt();
		total = grade * 60 / 4.5 + volunteerTime / 2 + bonusPoint;
		System.out.printf("����� ����� ���� ���������� %.2f%n�� �Դϴ�." + "�Դϴ�.", total);
		
		input.close();
	}
}
