package Week7;

import java.util.Scanner;

public class BoxTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box  b;
		b = new Box(); 

		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.width = in.nextInt();	
		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.length = in.nextInt();	
		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.height = in.nextInt();
		System.out.println("������ ���Ǵ� " + b.width * b.length * b.height + "�Դϴ�.");
		
		in.close();
	}
}