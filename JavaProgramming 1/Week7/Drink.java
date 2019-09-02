package Week7;

import java.util.Scanner;

public class Drink {
	String name;
	int cost;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Drink dk[] = new Drink[5];
		for(int i = 0; i < dk.length; i++) {
			dk[i] = new Drink();
		}

		dk[0].name = "잔치집 식혜";
		dk[0].cost = 600;
		dk[1].name = "아이시스";
		dk[1].cost = 500;
		dk[2].name = "컨피던스";
		dk[2].cost = 700;
		dk[3].name = "가나";
		dk[3].cost = 500;
		dk[4].name = "맥스웰";
		dk[4].cost = 500;

		System.out.println("모든 제품 출력");
		for(int i = 0; i < dk.length; i++) {
			System.out.println(dk[i].name + "\t" + dk[i].cost + "원");
		}

		System.out.println("\n가격이 500원인 제품 출력");
		for(int i = 0; i < dk.length; i++) {
			if(dk[i].cost == 500)
				System.out.println(dk[i].name + "\t" + dk[i].cost + "원");
		}
		in.close();
	}
}
