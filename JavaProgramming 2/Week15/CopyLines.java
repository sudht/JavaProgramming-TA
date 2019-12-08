package Week15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyLines {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		System.out.print("한 문장 입력: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();

		try {
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			inputStream = new BufferedReader(new FileReader("output.txt"));
			outputStream.println(str);
			outputStream.flush();
			
			String l;
			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);
			}

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}