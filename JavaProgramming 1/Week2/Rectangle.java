package Week2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width, depth, height, area, volume;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ü �ظ��� ���θ� �Է��Ͻÿ�: ");
		width = input.nextDouble();
		
		System.out.print("������ü �ظ��� ���θ� �Է��Ͻÿ�: ");
		depth = input.nextDouble();
		
		System.out.print("������ü�� ���̸� �Է��Ͻÿ�: ");
		height = input.nextDouble();
		
		area = 2 * (width * depth + depth * height + height * width);
		volume = width * depth * height;
		
		System.out.println("������ü�� ǥ������ " + area + "\n������ü�� ���Ǵ� " + volume);
		
		input.close();
	}
}
