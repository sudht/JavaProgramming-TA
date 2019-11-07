package Week3;

public class Marine {
	static private int weapon = 5;
	static private int armor = 0;
	private int hp;

	Marine() {
		this.hp = 40;
	}

	public void upgradeWeapon() {
		weapon++;
	}

	public void upgradeArmor() {
		armor++;
	}

	public void stimPack() {
		if (this.hp > 10)
			this.hp -= 10;
		else
			System.out.println("Not enough life remaining");
	}

	public String toString() {
		return "Weapon: " + weapon + ", Armor: " + armor + ", Hp: " + hp;
	}

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();

		m1.upgradeArmor();
		m2.upgradeWeapon();

		m1.stimPack();
		m1.stimPack();
		m1.stimPack();
		m1.stimPack();

		System.out.println(m1);
		System.out.println(m2);
	}
}