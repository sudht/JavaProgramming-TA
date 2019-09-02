package Week6;

public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0;
		boolean tile [][] = new boolean[10][10];
		int steps = 0;
		
		tile[x][y] = true;
		while (!tile[9][9]) {
			int direction = (int) (Math.random() * 4);
			if (direction == 0 && x > 0)
				x--;
			else if(direction == 1 && x < 9) 
				x++;
			else if(direction == 2 && y > 0)
				y--;
			else if(y<9)
				y++;
			tile[y][x] = true;
			
			System.out.println("-------------------------");
			for(int i=0; i < 10; i++) {
				for(int j=0; j<10; j++) {
					if(tile[i][j] == true)
						System.out.print("# ");
					else
						System.out.print(". ");
				}
				System.out.println();
			}
			System.out.println("-------------------------");
			steps++;
		}
		System.out.println("전체 이동 수는 = " + steps);
	}
}
