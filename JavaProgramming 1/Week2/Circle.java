package Week2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		double circumference;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		circumference = 2 * 3.14 * radius;
		
		System.out.println("���� ������ " + area + ", �ѷ���  " + circumference + "�Դϴ�.");
		
		input.close();
	}
}
