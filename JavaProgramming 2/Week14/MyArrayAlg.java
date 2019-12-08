package Week14;

public class MyArrayAlg {
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static <T extends Comparable> void sort(T[] a) {
		T min;
		int minIdx;
		for (int i = 0; i < a.length - 1; i++) {
			min = a[i];
			minIdx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(min) < 0) {
					min = a[j];
					minIdx = j;
				}
			}
			swap(a, i, minIdx);
		}
	}

	public static void main(String[] args) {
		String[] language = { "D", "A", "B", "C" };
		Integer[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		MyArrayAlg.sort(language);
		MyArrayAlg.sort(numbers);
		for (String value : language)
			System.out.print(value + " ");
		System.out.println();
		for (Integer value : numbers)
			System.out.print(value + " ");
	}
}
