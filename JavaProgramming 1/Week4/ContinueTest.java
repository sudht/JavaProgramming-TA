package Week4;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int character = 0;
		System.out.print("문장 입력: ");
		String s = in.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				continue;

			character++;
		}
		System.out.println("공백을 제외한 글자의 개수: " + character);
		in.close();
	}
}