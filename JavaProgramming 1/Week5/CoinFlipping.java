package Week5;

public class CoinFlipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 2;
		int freq[] = new int[SIZE];

		for(int i = 0; i < 10000; i++) {
			++freq[(int) (Math.random() * SIZE)];
		}
		
		System.out.println("====================");
		System.out.println("��\t��");
		System.out.println("====================");
		
		for(int i = 0; i < SIZE; i++) {
			if(i==0) 
				System.out.println("�ո�\t" + freq[i]);
			else
				System.out.println("�޸�\t" + freq[i]);
		}
	}
}
