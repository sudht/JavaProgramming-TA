package Week3;

import java.util.Scanner;

public class Pass_Or_Failure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int db, ec, os, se, dc;
		int avg;

		System.out.println("����ó����� �պ� ���� ���� ���α׷��Դϴ�.");
		System.out.println("�� ������ ������ �Է����ּ���.\n");
		System.out.print("������ ���̽�: ");
		db = in.nextInt();
		System.out.print("���ڰ��� ����: ");
		ec = in.nextInt();
		System.out.print("� ü��: ");
		os = in.nextInt();
		System.out.print("����Ʈ���� ����: ");
		se = in.nextInt();
		System.out.print("������ ���: ");
		dc = in.nextInt();

		System.out.println();
		avg = (db + ec + os + se + dc) / 5;


		if(avg >= 60 && db >= 40 && ec >= 40 && os >= 40 && se >= 40 && dc >= 40) 
			System.out.println("�հ��Դϴ�.");
		else 
			System.out.println("���հ��Դϴ�.");
		
		in.close();
	}
}