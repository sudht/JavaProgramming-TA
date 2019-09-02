package Week3;

import java.util.Scanner;

public class Pass_Or_Failure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int db, ec, os, se, dc;
		int avg;

		System.out.println("정보처리기사 합불 여부 진단 프로그램입니다.");
		System.out.println("각 과목의 점수를 입력해주세요.\n");
		System.out.print("데이터 베이스: ");
		db = in.nextInt();
		System.out.print("전자계산기 구조: ");
		ec = in.nextInt();
		System.out.print("운영 체제: ");
		os = in.nextInt();
		System.out.print("소프트웨어 공학: ");
		se = in.nextInt();
		System.out.print("데이터 통신: ");
		dc = in.nextInt();

		System.out.println();
		avg = (db + ec + os + se + dc) / 5;


		if(avg >= 60 && db >= 40 && ec >= 40 && os >= 40 && se >= 40 && dc >= 40) 
			System.out.println("합격입니다.");
		else 
			System.out.println("불합격입니다.");
		
		in.close();
	}
}