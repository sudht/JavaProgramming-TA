package Week7;

import java.util.Scanner;

public class DebugTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i <10; i++) {
			sum += (int)(Math.random()*100);
		}
		
		System.out.print("난수 10개의 합을 입력하시오: ");
		int n = in.nextInt();
		if(n == sum)
			System.out.println("정답입니다.");
		else
			System.out.println("디버그를 다시 공부해봅시다.");
		
		in.close();
	}

}