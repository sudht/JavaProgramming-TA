package Week7;

import java.util.Scanner;

public class DebugTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i <10; i++) {
			sum += (int)(Math.random()*100);
		}
		
		System.out.print("���� 10���� ���� �Է��Ͻÿ�: ");
		int n = in.nextInt();
		if(n == sum)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("����׸� �ٽ� �����غ��ô�.");
		
		in.close();
	}

}