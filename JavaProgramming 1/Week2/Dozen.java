package Week2;

import java.util.Scanner;

public class Dozen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pencil, dozen, rest;
		
		System.out.print("������ ������ �Է��ϼ���: ");
		pencil = input.nextInt();
		
		dozen = pencil / 12;
		rest = pencil % 12;
		
		System.out.println();
		System.out.println("�ٽ�: " + dozen);
		System.out.println("������ ����: " + rest);
		
		input.close();
	}
}
