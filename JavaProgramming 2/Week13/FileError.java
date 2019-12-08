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
			System.out.print("배열의 인덱스를 입력하세요 : ");
			int i = in.nextInt();
			System.out.println("배열 원소 " + i + " = " + list[i]);
			System.out.println("정상");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류");
			return;
		} finally {
			if (in != null)
				in.close();
			System.out.println("끝");
		}

	}

	public static void main(String[] args) {
		new FileError();
	}
}