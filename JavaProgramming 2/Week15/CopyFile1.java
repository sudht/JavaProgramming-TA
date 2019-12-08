package Week15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;

		try {
			in = new FileInputStream("input.txt");

			int c;
			int count = 0;

			while ((c = in.read()) != -1) {
				if (c == ' ')
					count++;
			}
			System.out.println(count);
		} finally {
			if (in != null)
				in.close();
		}
	}
}