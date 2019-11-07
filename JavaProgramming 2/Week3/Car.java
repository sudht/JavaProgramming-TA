package Week3;

public class Car {
	private String model;
	private String color;
	private double speed;
	private int id;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNumbers() {
		return numbers;
	}

	public static void setNumbers(int numbers) {
		Car.numbers = numbers;
	}

	public static double getTotalSpeed() {
		return totalSpeed;
	}

	public static void setTotalSpeed(double totalSpeed) {
		Car.totalSpeed = totalSpeed;
	}

	private static int numbers = 0;
	private static double totalSpeed = 0;

	public Car(String m, String c, double s) {
		model = m;
		color = c;
		speed = s;
		id = ++numbers;
		totalSpeed += s;
	}

	// 정적 메소드
	public static int getNumberOfCars() {
		return numbers; // OK!
	}
	
	public static double getAvrageSpeed() {
		return totalSpeed / numbers; // OK!
	}

	public static void main(String args[]) {
		new Car("S600", "white", 80.65);
		new Car("E500", "blue", 17.12);
		int n = Car.getNumberOfCars();
		double avgSpeed = Car.getAvrageSpeed();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		System.out.printf("평균 속력= %.2f\n", avgSpeed);
	}
}