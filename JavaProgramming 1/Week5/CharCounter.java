package Week5;

import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] alphabet = new int[26];

		System.out.print("문자열 입력: ");
		String str = in.nextLine();
		str = str.toLowerCase();

		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				++alphabet[str.charAt(i)-'a'];
		}

		for(int i = 0; i<alphabet.length; i++) {
			System.out.println((char)(i+'a') + "의 개수 : " + alphabet[i]);
		}
		in.close();
	}
}