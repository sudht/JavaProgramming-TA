package Week2;

import java.util.Scanner;

public class Box {
	public int width;
	public int weight;
	public int height;

	public String toString() {
		return "상자의 부피는 " + width * weight * height + "입니다.";
	}

	public static void main(String[] args) {
		Box b = new Box();
		Scanner in = new Scanner(System.in);
		
		System.out.print("상자의 가로 길이를 입력하시오: ");
		b.width = in.nextInt();
		
		System.out.print("상자의 세로 길이를 입력하시오: ");
		b.weight = in.nextInt();
		
		System.out.print("상자의 높이 길이를 입력하시오: ");
		b.height = in.nextInt();
		
		System.out.println(b);
		
		in.close();
	}
}
