package Week4;

import java.util.Scanner;

public class KIOSK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		int n = 0, total = 0, chicken = 5, ramen = 3, sundae = 1;
		System.out.println("��ϰ� ���� �ı� �Ǹű��Դϴ�.");
		while(true) {
			System.out.println( );
			System.out.println("��ȣ\t�޴�\t����\t����");
			System.out.println("1\tġŲ�\t3300��\t" + chicken);
			System.out.println("2\t��϶��\t1500��\t" + ramen);
			System.out.println("3\t���뱹��\t4500��\t" + sundae);
			System.out.println("0\t����");
			System.out.println("---------------------");
			System.out.print("�޴� �Է�: ");
			n = in.nextInt();
			if(n==0)
				break;
			else {
				switch(n) {
				case 1:
					if(chicken == 0) 
						System.out.println("���� ������ �����ϴ�!");
					else {
						chicken--;
						total += 3300;
					}
					break;
				case 2:
					if(ramen == 0) 
						System.out.println("���� ������ �����ϴ�!");
					else {
						ramen--;
						total += 1500;
					}
					break;
				case 3:
					if(sundae == 0) 
						System.out.println("���� ������ �����ϴ�!");
					else {
						sundae--;
						total += 4500;
					}
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�!");
				}
			}
		}
		System.out.println("�� �ݾ�: " + total);
		in.close();
	}
}