package Week4;

class Animal {
	void sound() {
		System.out.println("Animal Ŭ������ sound()");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("�߿�");
	}
}

public class DynamicCallTest {
	public static void main(String args[]) { 
	    Animal animal[] = new Animal[3];
	    animal[0] = new Animal();
	    animal[1] = new Dog(); 
	    animal[2] = new Cat(); 
	 
	    Animal obj;  
	 
	    obj = animal[0];  
		obj.sound(); 
	 
	    obj = animal[1];  
		obj.sound(); 
	 
	    obj = animal[2];  
		obj.sound(); 
	} 
}