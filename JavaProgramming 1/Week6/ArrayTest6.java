package Week6;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[][] array = { 
			{ 10, 20, 30, 40 }, 
			{ 50, 60, 70, 80 },
			{ 90, 100, 110, 120 } 
		};
		int rowSum = 0, colSum = 0;

		for (int r = 0; r < array.length; r++) {
			rowSum = 0;
			for (int c = 0; c < array[r].length; c++) {
				rowSum += array[r][c];
			}
			System.out.println(r + "행의 합: " + rowSum);
		}
		
		System.out.println();
		for (int c = 0; c < array[0].length; c++) {
			colSum = 0;
			for (int r = 0; r < array.length; r++) {
				colSum += array[r][c];
			}
			System.out.println(c + "열의 합: " + colSum);
		}
	}
}
