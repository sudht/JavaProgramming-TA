package Week4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num, count = 0;
		double average = 0;
		System.out.println("��� ���ϱ� ���α׷�. ���Ḧ ���ϸ� 0�� �Է����ּ���.\n");
		
		do {
			System.out.print("������ �Է����ּ���: ");
			num = in.nextInt();
			count++;
			average += num;
		} while(num != 0);
		
		count--;
		average /= count;
		System.out.println("\n�Էµ� ������ ����� " + average);
		in.close();
	}
}
