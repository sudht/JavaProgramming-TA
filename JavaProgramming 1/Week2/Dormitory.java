package Week2;

import java.util.Scanner;

public class Dormitory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grade, total;
		int volunteerTime, bonusPoint;
		Scanner input = new Scanner(System.in);

		System.out.print("성적을 입력하시오: ");
		grade = input.nextDouble();
		System.out.print("봉사시간을 입력하시오: ");
		volunteerTime = input.nextInt();
		System.out.print("가산점을 입력하시오: ");
		bonusPoint = input.nextInt();
		total = grade * 60 / 4.5 + volunteerTime / 2 + bonusPoint;
		System.out.printf("당신의 기숙사 선발 배정점수는 %.2f%n점 입니다." + "입니다.", total);
		
		input.close();
	}
}
