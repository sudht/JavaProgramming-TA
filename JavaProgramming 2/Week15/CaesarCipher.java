package Week15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String plaintext = in.nextLine();
		in.close();

		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter("encode.txt"));
			pw.println(CaesarCipher.encode(plaintext, 3));
			pw.flush();
			pw.close();

			pw = new PrintWriter(new FileWriter("decode.txt"));
			br = new BufferedReader(new FileReader("encode.txt"));

			String l;
			while ((l = br.readLine()) != null) {
				pw.println(CaesarCipher.decode(l, 3));
			}

			pw.flush();
		} finally {
			if (pw != null) {
				pw.close();
			}
			if (br != null) {
				br.close();
			}
		}
	}

	// 아래 코드는 http://rosettacode.org/wiki/Caesar_cipher에서 가져왔습니다.
	public static String decode(String enc, int offset) {
		return encode(enc, 26 - offset);
	}

	public static String encode(String enc, int offset) {
		offset = offset % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encoded.append((char) ('A' + (i - 'A' + offset) % 26));
				} else {
					encoded.append((char) ('a' + (i - 'a' + offset) % 26));
				}
			} else {
				encoded.append(i);
			}
		}
		return encoded.toString();
	}
}