package Week4;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Ãþ ¼ö ÀÔ·Â: ");
		n = in.nextInt();
		System.out.println();
		
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			for(int z = n * 2; z > x * 2 + 1; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}