package Week6;

interface Sport {
	public void setHomeTeam(String name);

	public void setAwayTeam(String name);
}

interface Place {
	public void setBaseballStadium(String name);
}

interface Baseball extends Sport, Place {
	public void homeBallScore(int points);

	public void awayBallScore(int points);

	public void inning(int inning);
}

public class KBO implements Baseball {
	public void setHomeTeam(String name) {
		System.out.println("Ȩ���� " + name + "�Դϴ�.");
	}

	public void setAwayTeam(String name) {
		System.out.println("��������� " + name + "�Դϴ�.");
	}

	public void setBaseballStadium(String name) {
		System.out.println("��Ҵ� " + name);
	}

	public void homeBallScore(int points) {
		System.out.println("Ȩ�� ����: " + points);
	}

	public void awayBallScore(int points) {
		System.out.println("������� ����: " + points);
	}

	public void inning(int inning) {
		System.out.println("�̴�: " + inning + "ȸ");
	}

	public static void main(String[] args) {
		KBO k = new KBO();
		k.setHomeTeam("�ѱ�");
		k.setAwayTeam("�Ϻ�");
		k.setBaseballStadium("������տ��");
		k.homeBallScore(5);
		k.awayBallScore(2);
		k.inning(3);
	}
}