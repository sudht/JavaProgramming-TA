package Week6;

interface OperateCar2 {
	default public void fly() {
		System.out.println("�������̽��� ����Ʈ �޼ҵ�!");
	}

	static void print() {
		System.out.println("�������̽��� ���� �޼ҵ�!");
	}
}

class OldCar implements OperateCar2 {
	@Override
	public void fly() {
		System.out.println("Override�� ����Ʈ �޼ҵ�!");
	}

//	@Override
//	public void print() {
//		System.out.println("���� �޼ҵ带 Override �� �� ���� ������ ���Ͽ� �ּ� �ۼ�.");
//	}
}

public class DefaultMethodTest2 {
	public static void main(String[] args) {
		OldCar obj = new OldCar();
		obj.fly();
		OperateCar2.print();
	}
}