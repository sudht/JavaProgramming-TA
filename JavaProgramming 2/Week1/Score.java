package Week1;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("과목 수 입력: ");
		int num = in.nextInt();
		
		if(num > 0) {
			double avg = 0;
			
			for (int i=0; i<num; i++) {
				System.out.print(i+1 + "번째 과목의 학점을 입력해 주세요(0 ~ 4.5): ");
				double score = in.nextDouble();
				if(score <0 || score > 4.5) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					i--;
					continue;
				}
				avg += score;
			}
			
			System.out.println("평균평점은 " + (avg/num) + "입니다.");
		}
		else
			System.out.println("과목 수를 잘못 입력하셨습니다.");
		
		System.out.println("프로그램을 종료합니다.");
		in.close();
	}
}