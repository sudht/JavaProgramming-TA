package Week1;

public class FindMaxAbsolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = {19, -17, 13, -2, 23, -31, 7, -37, -29, 33};
		int max;
		int index = 0;
		
		max = s[0];
		
		for (int i=0; i < s.length; i++) {
			if(s[i] * s[i] > max * max) {
				max = s[i];
				index = i;
			}
		}
		System.out.println("���밪�� ���� ū ������ " + max + "��(��) " + index + "��° ��ġ�� �ֽ��ϴ�.");
	}
}
