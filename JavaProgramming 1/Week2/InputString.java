package Week2;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, department;
		int age;
		double height;

		Scanner input = new Scanner(System.in);


		System.out.print("이름을 입력하시오: ");
		name = input.nextLine();

		System.out.print("나이를 입력하시오: ");
		age = input.nextInt();

		input.nextLine();
		System.out.print("소속학과는? ");
		department = input.nextLine();

		System.out.print("키를 입력하시오(cm): ");
		height = input.nextDouble();

		System.out.println(department + "의 " + name + "님 안녕하세요! 나이가"
				+ age + "살이고, 키가 " + height + "cm이시네요.");

		input.close();
	}
}
