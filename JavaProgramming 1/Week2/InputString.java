package Week2;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, department;
		int age;
		double height;

		Scanner input = new Scanner(System.in);


		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = input.nextLine();

		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = input.nextInt();

		input.nextLine();
		System.out.print("�Ҽ��а���? ");
		department = input.nextLine();

		System.out.print("Ű�� �Է��Ͻÿ�(cm): ");
		height = input.nextDouble();

		System.out.println(department + "�� " + name + "�� �ȳ��ϼ���! ���̰�"
				+ age + "���̰�, Ű�� " + height + "cm�̽ó׿�.");

		input.close();
	}
}
