package Week3;
import java.util.Scanner;

public class Multiple_Of_Three {
	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		number = input.nextInt();

		if (number % 3 == 0) {
			System.out.println("�Էµ� ������ 3�� ����Դϴ�.");
		} else {
			System.out.println("�Էµ� ������ 3�� ����� �ƴմϴ�.");
		}

		System.out.println("���α׷��� ����Ǿ����ϴ�. ");
		
		input.close();
	}
}