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
		System.out.println("홈팀은 " + name + "입니다.");
	}

	public void setAwayTeam(String name) {
		System.out.println("어웨이팀은 " + name + "입니다.");
	}

	public void setBaseballStadium(String name) {
		System.out.println("장소는 " + name);
	}

	public void homeBallScore(int points) {
		System.out.println("홈팀 점수: " + points);
	}

	public void awayBallScore(int points) {
		System.out.println("어웨이팀 점수: " + points);
	}

	public void inning(int inning) {
		System.out.println("이닝: " + inning + "회");
	}

	public static void main(String[] args) {
		KBO k = new KBO();
		k.setHomeTeam("한국");
		k.setAwayTeam("일본");
		k.setBaseballStadium("잠실종합운동장");
		k.homeBallScore(5);
		k.awayBallScore(2);
		k.inning(3);
	}
}