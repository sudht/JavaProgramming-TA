package Week13;

import java.util.Scanner;

class MyException extends Exception {
	public MyException() {
		super("사용자 정의 예외");
	}
}

public class ExceptionTest1 {
	public static void main(String args[]) {
		try {
			method1();
		} catch (MyException e) {
			System.err.println(e.getMessage());
			System.err.println("호출 스택 내용:");
			e.printStackTrace();
		}
	}

	public static void method1() throws MyException {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = in.nextInt();
		if (n > 1000)
			throw new MyException();
	}
}
