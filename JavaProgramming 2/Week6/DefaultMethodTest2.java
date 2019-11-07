package Week6;

interface OperateCar2 {
	default public void fly() {
		System.out.println("인터페이스의 디폴트 메소드!");
	}

	static void print() {
		System.out.println("인터페이스의 정적 메소드!");
	}
}

class OldCar implements OperateCar2 {
	@Override
	public void fly() {
		System.out.println("Override한 디폴트 메소드!");
	}

//	@Override
//	public void print() {
//		System.out.println("정적 메소드를 Override 할 수 없는 이유에 대하여 주석 작성.");
//	}
}

public class DefaultMethodTest2 {
	public static void main(String[] args) {
		OldCar obj = new OldCar();
		obj.fly();
		OperateCar2.print();
	}
}