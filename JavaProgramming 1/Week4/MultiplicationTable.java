package Week4;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n; 
		double sum = 0; //�������� ���� ���� ����
		int i = 0; 
		System.out.print("��� ���ϱ� ���α׷�. ���Ḧ ���ϸ� 0�� �Է��ϼ���.\n\n ");
		do {  
			System.out.print("������ �Է����ּ��� : ");
			n = input.nextInt();
			i++;
			sum += n;

		} while (n!= 0); // 
		System.out.println("�Էµ� ������ �����  " + sum / (i - 1));
		input.close();
	}

}

