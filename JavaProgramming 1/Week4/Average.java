package Week4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num, count = 0;
		double average = 0;
		System.out.println("평균 구하기 프로그램. 종료를 원하면 0을 입력해주세요.\n");
		
		do {
			System.out.print("정수를 입력해주세요: ");
			num = in.nextInt();
			count++;
			average += num;
		} while(num != 0);
		
		count--;
		average /= count;
		System.out.println("\n입력된 정수의 평균은 " + average);
		in.close();
	}
}
