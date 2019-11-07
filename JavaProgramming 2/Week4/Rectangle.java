package Week4;

class Shape {
	int x;
	int y;

	public int getX() {		return x;	}
	public void setX(int x) {		this.x = x;	}
	public int getY() {		return y;	}
	public void setY(int y) {		this.y = y;	}
	
	void print() {
		System.out.println("x좌표: " + x + " y좌표: " + y);
	}
}

class Circle extends Shape {

	final double pi = 3.14;
	private int radius;
	public int getRadius() {		return radius;	}
	public void setRadius(int radius) {		this.radius = radius;	}

	double area() {
		return pi * radius * radius;
	}

	void draw() {
		System.out.println("원의 중심: (" + this.getX() + "," + this.getY()
							+ ") 반지름: " + radius + " 넓이: " + area());
	}
}

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public int getWidth() {		return width;	}
	public void setWidth(int width) {		this.width = width;	}
	public int getHeight() {		return height;	}
	public void setHeight(int height) {		this.height = height;	}
	
	double area() {
		return (double)width * height;
	}

	void draw() {
		System.out.println("사각형의 중심: (" + this.getX() + "," + this.getY() + ") 가로: " + width + " 세로: " + height);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Circle c1 = new Circle();
		
		c1.setX(1);
		c1.setY(2);
		c1.setRadius(5);
		
		r1.setX(5);
		r1.setY(3);
		r1.setWidth(10);
		r1.setHeight(20);
		
		r2.setX(8);
		r2.setY(9);
		r2.setWidth(10);
		r2.setHeight(20);
		
		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
		
		c1.print();
		c1.draw();
	}
}