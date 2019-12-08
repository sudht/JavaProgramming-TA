package Week13;

import java.util.Scanner;

class TooSmallException extends Exception {
	public TooSmallException() {
		super("TooSmall 예외 발생");
	}
}

class TooBigException extends Exception {
	public TooBigException() {
		super("TooBig 예외 발생");
	}
}

public class ExceptionTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("수를 입력하시오");
			String str = in.next();
			int num = stringToInt(str);
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		in.close();
	}

	public static int stringToInt(String str) 
			throws TooBigException, TooSmallException {
		int num = Integer.parseInt(str);
		if (num > 1000)
			throw new TooBigException();
		if (num < 0)
			throw new TooSmallException();
		return num;

	}
}