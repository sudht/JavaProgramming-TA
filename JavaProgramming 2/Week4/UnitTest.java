package Week4;

class Unit {
	private int hp;
	static private int armorIncrease = 0;
	
	Unit(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {		return hp;	}
	public void setHp(int hp) {		this.hp = hp;	}
	public static int getArmorIncrease() {		return armorIncrease;	}
	
	public void upgradeArmor() {
		armorIncrease++;
	}
}

class Marine extends Unit {
	static private int weapon = 5;
	Marine() {
		super(40);
	}
	
	public int getArmor() {		return getArmorIncrease();	}
	
	public void upgradeWeapon() {
		weapon++;
	}
	
	public void stimPack() {
		if (getHp() > 10)
			setHp(getHp() - 10);
		else
			System.out.println("Not enough life remaining");
	}
	
	public String toString() {
		return "Hp: " + getHp() + ", Weapon: " + weapon + ", Armor: " + getArmor();
	}
}

class Medic extends Unit {
	private int mp;
	Medic() {
		super(60);
		this.mp = 1;
	}
	
	public int getArmor() {		return 1 + getArmorIncrease();	}

	public void heal() {
		if (mp > 0)
			mp -= 1;
		else
			System.out.println("Not enough energy");
	}
	
	public String toString() {
		return "Hp: " + getHp() + ", Armor: " + getArmor() + ", Mp: " + mp;
	}
}

public class UnitTest {
	public static void main(String[] args) {
		Marine ma1 = new Marine();
		Marine ma2 = new Marine();
		Medic me1 = new Medic();
		Medic me2 = new Medic();

		ma1.upgradeArmor();
		ma1.stimPack();
		ma1.upgradeWeapon();
		me1.upgradeArmor();
		me1.heal();
		me1.heal();
		
		System.out.println(ma1);
		System.out.println(ma2);
		System.out.println(me1);
		System.out.println(me2);
	}
}