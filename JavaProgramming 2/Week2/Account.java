package Week2;

public class Account {

	private int balance;
	private String name;
	
	Account(String name) {
		this.name = name;
		balance = 0;
	}

	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public String toString() {
		return name + " �ܾ�: " + balance;
	}

	boolean sendMoney(Account a, int money) {
		if(money <= 0) {
			System.out.println("�۱� ���� ����: �߸��� �ݾ� �Է�");
			return false;
		}
		else if(this.balance < money) {
			System.out.println("�۱� ���� ����: �ܾ� ����");
			System.out.println("���� �ܾ�: " + this.balance);
			return false;
		}
		else {
			a.deposit(money);
			this.balance -= money;
			return true;
		}
	}
	
	public static void main(String[] args) {
		Account a1 = new Account("������");
		Account a2 = new Account("����");
		
		a1.deposit(10000);
		a2.deposit(10000);
		
		if(a1.sendMoney(a2, 5000)) {
			System.out.println(a1);
			System.out.println(a2);
		}
		
		if(a1.sendMoney(a2, Integer.MAX_VALUE)) {
			System.out.println(a1);
			System.out.println(a2);
		}
		
		if(a1.sendMoney(a2, Integer.MIN_VALUE)) {
			System.out.println(a1);
			System.out.println(a2);
		}
	}
}