package Week4;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int character = 0;
		System.out.print("���� �Է�: ");
		String s = in.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				continue;

			character++;
		}
		System.out.println("������ ������ ������ ����: " + character);
		in.close();
	}
}