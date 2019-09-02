package Week4;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n; 
		double sum = 0; //정수들의 합을 구할 변수
		int i = 0; 
		System.out.print("평균 구하기 프로그램. 종료를 원하면 0을 입력하세요.\n\n ");
		do {  
			System.out.print("정수를 입력해주세요 : ");
			n = input.nextInt();
			i++;
			sum += n;

		} while (n!= 0); // 
		System.out.println("입력된 정수의 평균은  " + sum / (i - 1));
		input.close();
	}

}

