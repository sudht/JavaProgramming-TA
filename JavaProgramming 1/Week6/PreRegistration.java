package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class PreRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String [] subject = {"의사소통영어1", "C프로그래밍2", "자바프로그래밍2", "확률및통계", "IT미적분학", "스포츠와건강", "창업입문", "사회봉사"};
		int [] credit = {2, 3, 3, 3, 3, 3, 3, 1};
		ArrayList<String> list = new ArrayList<>();
		System.out.println("예비 수강신청 프로그램입니다.");
		
		System.out.print("직전학기 평균학점을 입력해 주세요: ");
		double beforeCredit = in.nextDouble();
		int limit = 0;
		
		// 직전학기 평점이 3.75 이상일시 limit = 21, 1.75 이상일시 limit = 18, 나머지 limit = 15
		if(beforeCredit >= 3.75)				
			limit = 21;
		else if(beforeCredit >= 1.75) 
			limit = 18;
		else 
			limit = 15;	
		
		System.out.println(limit + "학점까지 신청 가능합니다.");
		
		System.out.println("번호\t구분\t과목명\t\t학점");
		System.out.println("------------------------------------");
		System.out.println("0\t기초\t의사소통영어1\t2");
		System.out.println("1\t대교\tC프로그래밍2\t3");
		System.out.println("2\t대교\t자바프로그래밍2\t3");
		System.out.println("3\t대교\t확률및통계\t\t3");
		System.out.println("4\t대교\tIT미적분학\t\t3");
		System.out.println("5\t균교\t스포츠와건강\t3");
		System.out.println("6\t자선\t창업입문\t\t3");
		System.out.println("7\t특화\t사회봉사\t\t1");
		
		int sum = 0;
		while(true) {
			System.out.print("번호를 입력해 주세요. -1 입력시 종료: ");
			int n = in.nextInt();
			if(n == -1 || sum + credit[n] > limit) {		// -1을 입력하거나 신청학점이 제한 학점을 초과하면 종료.
				break;
			}
			list.add(subject[n]);							// Arraylist에 과목을 집어넣음.
			sum += credit[n];								// 합계에 그 과목에 대한 학점을 더 함.
			System.out.println(subject[n] + " " + sum + "학점 신청");
		}
		
		System.out.print("예비 수강신청한 강좌 명: ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");			// Arraylist의 get함수를 써서 출력함. 184쪽 참고.
		}
		System.out.println("\n신청한 학점: " + sum);			// 신청학점을 출력.
		in.close();
	}
}
