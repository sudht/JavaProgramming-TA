package Week13;

import java.util.Scanner;

public class FileError {
	private int[] list;
	private static final int SIZE = 10;

	public FileError() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = i;
		writeList();
	}

	public void writeList() {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			System.out.print("�迭�� �ε����� �Է��ϼ��� : ");
			int i = in.nextInt();
			System.out.println("�迭 ���� " + i + " = " + list[i]);
			System.out.println("����");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����");
			return;
		} finally {
			if (in != null)
				in.close();
			System.out.println("��");
		}

	}

	public static void main(String[] args) {
		new FileError();
	}
}