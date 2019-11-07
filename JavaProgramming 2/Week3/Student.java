package Week3;

public class Student {
	private int number;
	private String name;
	private int age;

	Student() {
		number = 100;
		name = "New Student";
		age = 18;
	}
	
	Student(String name) {
		this.name = name;
		this.number = name.length() * 10;
		this.age = (int)(Math.log10(this.number)+1);
	}

	Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		System.out.println("매개변수가 0개인 생성자: " + obj1);
		

		Student obj2 = new Student(111, "Kim", 25);
		System.out.println("매개변수가 3개인 생성자: " + obj2);
		
		Student obj3 = new Student("Kangwon");
		System.out.println("매개변수가 1개인 생성자: " +  obj3);
	}
}