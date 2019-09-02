package Week4;

import java.util.Scanner;

public class KIOSK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		int n = 0, total = 0, chicken = 5, ramen = 3, sundae = 1;
		System.out.println("백록관 무인 식권 판매기입니다.");
		while(true) {
			System.out.println( );
			System.out.println("번호\t메뉴\t가격\t수량");
			System.out.println("1\t치킨까스\t3300원\t" + chicken);
			System.out.println("2\t백록라면\t1500원\t" + ramen);
			System.out.println("3\t순대국밥\t4500원\t" + sundae);
			System.out.println("0\t종료");
			System.out.println("---------------------");
			System.out.print("메뉴 입력: ");
			n = in.nextInt();
			if(n==0)
				break;
			else {
				switch(n) {
				case 1:
					if(chicken == 0) 
						System.out.println("남은 수량이 없습니다!");
					else {
						chicken--;
						total += 3300;
					}
					break;
				case 2:
					if(ramen == 0) 
						System.out.println("남은 수량이 없습니다!");
					else {
						ramen--;
						total += 1500;
					}
					break;
				case 3:
					if(sundae == 0) 
						System.out.println("남은 수량이 없습니다!");
					else {
						sundae--;
						total += 4500;
					}
					break;
				default:
					System.out.println("잘못 입력하셨습니다!");
				}
			}
		}
		System.out.println("총 금액: " + total);
		in.close();
	}
}