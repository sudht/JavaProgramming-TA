package Week14;

import java.util.*;

public class EnglishDic {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();

		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("원하는 작업 입력(1:검색 2:추가 3:종료) ");
			int input = sc.nextInt();
			String word = "";
			if (input == 3)
				break;
			else {
				switch (input) {
				case 1:
					System.out.print("영어 단어를 입력하시오: ");
					word = sc.next();
					if (st.containsKey(word))
						System.out.println("단어의 의미는 " + st.get(word));
					else
						System.out.println("사전에 없는 단어입니다.");
					break;
				case 2:
					System.out.print("영어 단어를 입력하시오: ");
					word = sc.next();
					System.out.print("뜻을 입력하시오: ");
					String mean = sc.next();
					st.put(word, mean);
					break;

				}
			}
		}
		System.out.println("단어장을 종료합니다.");

		sc.close();
	}
}