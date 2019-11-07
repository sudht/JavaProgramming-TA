package Week6;

public class Rectangle implements Comparable {
	private int width = 0;
	private int height = 0;

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}

	public int getArea() {
		return width * height;
	}

	public int sumOfEdge() {
		return (width + height) * 2;
	}

	@Override
	public int compareTo(Object other) {
		Rectangle otherRect = (Rectangle) other;
		if (this.sumOfEdge() < otherRect.sumOfEdge())
			return -1;
		else if (this.sumOfEdge() > otherRect.sumOfEdge())
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(200, 10);
		int result = r1.compareTo(r2);
		if (result == 1)
			System.out.println(r1 + "�� �� ��ϴ�.");
		else if (result == 0)
			System.out.println("�����ϴ�.");
		else
			System.out.println(r2 + "�� �� ��ϴ�.");

	}
}