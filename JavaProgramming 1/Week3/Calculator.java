package Week3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double n1, n2, result;
		String op;

		System.out.println("계산기 프로그램");
		System.out.print("첫 번째 숫자 입력: ");
		n1 = scan.nextDouble();
		System.out.print("두 번째 숫자 입력: ");
		n2 = scan.nextDouble();
		System.out.print("원하는 연산 입력: ");
		op = scan.next();
		System.out.println("----------------");

		switch(op) {
		case "+":
			result = n1 + n2;
			System.out.println("'" + op + "' 연산 결과: " + result);
			break;
		case "-":
			result = n1 - n2;
			System.out.println("'" + op + "' 연산 결과: " + result);
			break;
		case "*":
			result = n1 * n2;
			System.out.println("'" + op + "' 연산 결과: " + result);
			break;
		case "/":
			result = n1 / n2;
			System.out.println("'" + op + "' 연산 결과: " + result);
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			
			scan.close();
		}
	}
}