package Week7;

import java.util.Scanner;

public class Drink {
	String name;
	int cost;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Drink dk[] = new Drink[5];
		for(int i = 0; i < dk.length; i++) {
			dk[i] = new Drink();
		}

		dk[0].name = "��ġ�� ����";
		dk[0].cost = 600;
		dk[1].name = "���̽ý�";
		dk[1].cost = 500;
		dk[2].name = "���Ǵ���";
		dk[2].cost = 700;
		dk[3].name = "����";
		dk[3].cost = 500;
		dk[4].name = "�ƽ���";
		dk[4].cost = 500;

		System.out.println("��� ��ǰ ���");
		for(int i = 0; i < dk.length; i++) {
			System.out.println(dk[i].name + "\t" + dk[i].cost + "��");
		}

		System.out.println("\n������ 500���� ��ǰ ���");
		for(int i = 0; i < dk.length; i++) {
			if(dk[i].cost == 500)
				System.out.println(dk[i].name + "\t" + dk[i].cost + "��");
		}
		in.close();
	}
}
