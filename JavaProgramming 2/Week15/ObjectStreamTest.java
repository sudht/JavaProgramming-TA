package Week15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());
			out.flush();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d1 = (Date) in.readObject();

			Date d2 = new Date();
			System.out.println("½Ã°£ Â÷: " + (d2.getTime() - d1.getTime()) + "ms");
		} catch (ClassNotFoundException e) {
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
