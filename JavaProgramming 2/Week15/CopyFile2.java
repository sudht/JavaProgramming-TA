package Week15;

import java.io.FileReader;
import java.io.IOException;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;

		try {

			inputStream = new FileReader("Text.txt");
			StringBuilder sb = new StringBuilder();

			int c;
			while ((c = inputStream.read()) != -1) {
				sb.append((char) c);
			}
			for (int i = sb.length() - 1; i >= 0; i--) {
				System.out.print(sb.charAt(i));
			}

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}