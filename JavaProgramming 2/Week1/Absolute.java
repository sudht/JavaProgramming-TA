package Week1;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요: ");
		int var1 = in.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요: ");
		int var2 = in.nextInt();
		
		
		if(var1 * var1 > var2 * var2)
			System.out.println("절대값이 더 큰 수는 " + var1 + "입니다.");
		else
			System.out.println("절대값이 더 큰 수는 " + var2 + "입니다.");
		
		in.close();
	}
}