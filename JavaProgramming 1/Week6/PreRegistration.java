package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class PreRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String [] subject = {"�ǻ���뿵��1", "C���α׷���2", "�ڹ����α׷���2", "Ȯ�������", "IT��������", "�������Ͱǰ�", "â���Թ�", "��ȸ����"};
		int [] credit = {2, 3, 3, 3, 3, 3, 3, 1};
		ArrayList<String> list = new ArrayList<>();
		System.out.println("���� ������û ���α׷��Դϴ�.");
		
		System.out.print("�����б� ��������� �Է��� �ּ���: ");
		double beforeCredit = in.nextDouble();
		int limit = 0;
		
		// �����б� ������ 3.75 �̻��Ͻ� limit = 21, 1.75 �̻��Ͻ� limit = 18, ������ limit = 15
		if(beforeCredit >= 3.75)				
			limit = 21;
		else if(beforeCredit >= 1.75) 
			limit = 18;
		else 
			limit = 15;	
		
		System.out.println(limit + "�������� ��û �����մϴ�.");
		
		System.out.println("��ȣ\t����\t�����\t\t����");
		System.out.println("------------------------------------");
		System.out.println("0\t����\t�ǻ���뿵��1\t2");
		System.out.println("1\t�뱳\tC���α׷���2\t3");
		System.out.println("2\t�뱳\t�ڹ����α׷���2\t3");
		System.out.println("3\t�뱳\tȮ�������\t\t3");
		System.out.println("4\t�뱳\tIT��������\t\t3");
		System.out.println("5\t�ձ�\t�������Ͱǰ�\t3");
		System.out.println("6\t�ڼ�\tâ���Թ�\t\t3");
		System.out.println("7\tƯȭ\t��ȸ����\t\t1");
		
		int sum = 0;
		while(true) {
			System.out.print("��ȣ�� �Է��� �ּ���. -1 �Է½� ����: ");
			int n = in.nextInt();
			if(n == -1 || sum + credit[n] > limit) {		// -1�� �Է��ϰų� ��û������ ���� ������ �ʰ��ϸ� ����.
				break;
			}
			list.add(subject[n]);							// Arraylist�� ������ �������.
			sum += credit[n];								// �հ迡 �� ���� ���� ������ �� ��.
			System.out.println(subject[n] + " " + sum + "���� ��û");
		}
		
		System.out.print("���� ������û�� ���� ��: ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");			// Arraylist�� get�Լ��� �Ἥ �����. 184�� ����.
		}
		System.out.println("\n��û�� ����: " + sum);			// ��û������ ���.
		in.close();
	}
}
