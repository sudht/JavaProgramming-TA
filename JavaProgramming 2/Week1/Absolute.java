package Week1;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է����ּ���: ");
		int var1 = in.nextInt();
		
		System.out.print("�� ��° ������ �Է����ּ���: ");
		int var2 = in.nextInt();
		
		
		if(var1 * var1 > var2 * var2)
			System.out.println("���밪�� �� ū ���� " + var1 + "�Դϴ�.");
		else
			System.out.println("���밪�� �� ū ���� " + var2 + "�Դϴ�.");
		
		in.close();
	}
}