package Week1;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �� �Է�: ");
		int num = in.nextInt();
		
		if(num > 0) {
			double avg = 0;
			
			for (int i=0; i<num; i++) {
				System.out.print(i+1 + "��° ������ ������ �Է��� �ּ���(0 ~ 4.5): ");
				double score = in.nextDouble();
				if(score <0 || score > 4.5) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					i--;
					continue;
				}
				avg += score;
			}
			
			System.out.println("��������� " + (avg/num) + "�Դϴ�.");
		}
		else
			System.out.println("���� ���� �߸� �Է��ϼ̽��ϴ�.");
		
		System.out.println("���α׷��� �����մϴ�.");
		in.close();
	}
}