package Week14;

import java.util.*;

public class EnglishDic {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();

		st.put("map", "����");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���ϴ� �۾� �Է�(1:�˻� 2:�߰� 3:����) ");
			int input = sc.nextInt();
			String word = "";
			if (input == 3)
				break;
			else {
				switch (input) {
				case 1:
					System.out.print("���� �ܾ �Է��Ͻÿ�: ");
					word = sc.next();
					if (st.containsKey(word))
						System.out.println("�ܾ��� �ǹ̴� " + st.get(word));
					else
						System.out.println("������ ���� �ܾ��Դϴ�.");
					break;
				case 2:
					System.out.print("���� �ܾ �Է��Ͻÿ�: ");
					word = sc.next();
					System.out.print("���� �Է��Ͻÿ�: ");
					String mean = sc.next();
					st.put(word, mean);
					break;

				}
			}
		}
		System.out.println("�ܾ����� �����մϴ�.");

		sc.close();
	}
}