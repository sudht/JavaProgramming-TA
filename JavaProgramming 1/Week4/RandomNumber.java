package Week4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n, countOdd = 0, countEven = 0;
		
		System.out.print("난수의 개수: ");
		n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			int number = rnd.nextInt(100);
			if(number % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("짝수는 " + countEven + "개, 홀수는 " + countOdd + "개입니다.");
		in.close();
	}
}
