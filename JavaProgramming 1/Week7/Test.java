package Week7;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		int[][] array= {
				{0, 7, 1},
				{9, 1, 3},
				{3, 1, 2},
				{2, 3, 4} };
		
//		Arrays.sort(array, Comparator.comparingInt(a -> a[1]));
		Arrays.sort(array, (a, b) -> Double.compare(a[1], b[1]));
		Arrays.sort(array, Comparator.comparing(b -> b[1]));
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++)
				System.out.print (array[i][j] + " ");
			System.out.println();
		}
			
	}
}