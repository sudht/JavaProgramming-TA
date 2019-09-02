package Week3;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3;
		int temp;
		
		System.out.println("숫자 세게 입력");
		System.out.print("1 : ");
		n1 = in.nextInt();
		System.out.print("2 : ");
		n2 = in.nextInt();
		
		if(n1 < n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		System.out.print("3 : ");
		n3 = in.nextInt();
		
		if(n2 < n3) {
			temp = n3;
			n3 = n2;
			n2 = temp;
		}
		if(n1 < n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		System.out.println("\n졍렬 결과");
		System.out.println(n1 +  " " + n2 + " " + n3);
		
		in.close();
	}
}
