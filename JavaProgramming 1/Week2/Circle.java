package Week2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		double circumference;
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		circumference = 2 * 3.14 * radius;
		
		System.out.println("원의 면적은 " + area + ", 둘레는  " + circumference + "입니다.");
		
		input.close();
	}
}
