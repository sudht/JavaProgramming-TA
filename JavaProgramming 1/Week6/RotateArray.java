package Week6;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr1 = new int [5][5];
		int [][] arr2 = new int [5][5];
		int H = 10;
		
		System.out.println("90도 회전 전");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				H = H + 1;
				arr1[i][j] = H;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("90도 회전 후");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr2[i][j] = arr1[4 - j][i];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
