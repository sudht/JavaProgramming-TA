package Week3;

import java.util.Scanner;

public class EnglishMonth {
	public static void main(String[] args) {
		int monthNumber;

		Scanner scan = new Scanner(System.in);
		System.out.println("월별 영어 단어를 알려주는 프로그램입니다.");
		System.out.print("숫자 1~12 중 하나를 입력해주세요: ");
		monthNumber = scan.nextInt();

		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Wrong");
			break;
		}
		scan.close();
	}
}