package Week4;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ãþ ¼ö ÀÔ·Â: ");
		int n = in.nextInt();
		System.out.println();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				int combi = 1;
				for(int k = 0; k < j; k++) {
					combi = combi * (i - k) / (k + 1);
				}
				System.out.print(combi + " ");
			}
			System.out.println();
		}
		in.close();
	}
}