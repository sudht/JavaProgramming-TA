package Week3;
import java.util.Scanner;

public class Multiple_Of_Three {
	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = input.nextInt();

		if (number % 3 == 0) {
			System.out.println("입력된 정수는 3의 배수입니다.");
		} else {
			System.out.println("입력된 정수는 3의 배수가 아닙니다.");
		}

		System.out.println("프로그램이 종료되었습니다. ");
		
		input.close();
	}
}