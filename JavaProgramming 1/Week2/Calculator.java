package Week2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x, y;
		double add, sub, mul, div;
		
		System.out.println("-----CALCULATOR-----");
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		x = input.nextDouble();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		y = input.nextDouble();
		
		add = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;
		
		System.out.println();
		System.out.println("------RESULT------");
		System.out.println("Add: " + add);
		System.out.println("Sub: " + sub);
		System.out.println("Mul: " + mul);
		System.out.println("Div: " + div);
		
		input.close();
	}
}
