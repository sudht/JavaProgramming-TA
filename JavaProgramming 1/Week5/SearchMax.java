package Week5;

public class SearchMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = {20, 19, 4, 44, 3, 6, 28, 15};
		int max;
		int index = 0;
		
		max = s[0];
		
		for (int i=0; i < s.length; i++) {
			if(s[i] > max) {
				max = s[i];
				index = i;
			}
		}
		System.out.println("최대값인 " + max + "는 " + index + "번째 위치에 있습니다.");
	}
}
