package Week2;

import java.util.Scanner;

public class Box {
	public int width;
	public int weight;
	public int height;

	public String toString() {
		return "������ ���Ǵ� " + width * weight * height + "�Դϴ�.";
	}

	public static void main(String[] args) {
		Box b = new Box();
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.width = in.nextInt();
		
		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.weight = in.nextInt();
		
		System.out.print("������ ���� ���̸� �Է��Ͻÿ�: ");
		b.height = in.nextInt();
		
		System.out.println(b);
		
		in.close();
	}
}
