package Week3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double n1, n2, result;
		String op;

		System.out.println("���� ���α׷�");
		System.out.print("ù ��° ���� �Է�: ");
		n1 = scan.nextDouble();
		System.out.print("�� ��° ���� �Է�: ");
		n2 = scan.nextDouble();
		System.out.print("���ϴ� ���� �Է�: ");
		op = scan.next();
		System.out.println("----------------");

		switch(op) {
		case "+":
			result = n1 + n2;
			System.out.println("'" + op + "' ���� ���: " + result);
			break;
		case "-":
			result = n1 - n2;
			System.out.println("'" + op + "' ���� ���: " + result);
			break;
		case "*":
			result = n1 * n2;
			System.out.println("'" + op + "' ���� ���: " + result);
			break;
		case "/":
			result = n1 / n2;
			System.out.println("'" + op + "' ���� ���: " + result);
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
			
			scan.close();
		}
	}
}