package Week2;

import java.util.Scanner;

public class Dozen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pencil, dozen, rest;
		
		System.out.print("연필의 갯수를 입력하세요: ");
		pencil = input.nextInt();
		
		dozen = pencil / 12;
		rest = pencil % 12;
		
		System.out.println();
		System.out.println("다스: " + dozen);
		System.out.println("나머지 연필: " + rest);
		
		input.close();
	}
}
