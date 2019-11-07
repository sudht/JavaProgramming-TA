package Week6;

@FunctionalInterface
interface MyInterface {
	public void calculate(int x, int y);

	default void add(int x, int y) {
		System.out.println(x + y);
	}
}

public class LambdaTest2 {

	public static void main(String[] args) {
		MyInterface hello = (a, b) -> {
			int result = a * b;
			System.out.println("계산 결과는 : " + result);
		};

		hello.calculate(10, 20);
		hello.add(10, 20);
	}
}