package Week6;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] numbers = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			int r = (int) (Math.random() * 100);
			numbers[i] = r;
		}

		System.out.print("������ ����Ʈ: ");
		for (int r : numbers)
			System.out.print(r + " ");
		Arrays.sort(numbers);

		System.out.print("\n���ĵ� ����Ʈ: ");
		for(int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
