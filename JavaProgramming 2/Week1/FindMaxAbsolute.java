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
		System.out.println("절대값이 가장 큰 숫자인 " + max + "은(는) " + index + "번째 위치에 있습니다.");
	}
}
