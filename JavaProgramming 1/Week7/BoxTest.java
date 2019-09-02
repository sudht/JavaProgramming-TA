package Week7;

import java.util.Scanner;

public class BoxTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box  b;
		b = new Box(); 

		System.out.print("상자의 가로 길이를 입력하시오: ");
		b.width = in.nextInt();	
		System.out.print("상자의 세로 길이를 입력하시오: ");
		b.length = in.nextInt();	
		System.out.print("상자의 높이 길이를 입력하시오: ");
		b.height = in.nextInt();
		System.out.println("상자의 부피는 " + b.width * b.length * b.height + "입니다.");
		
		in.close();
	}
}