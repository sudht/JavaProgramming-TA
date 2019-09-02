package Week7;

public class TelevisionTest {
	public static void main(String[] args) {

		Television  tv = new Television(); 	
		tv.channel = 7;	
		tv.volume = 9;	
		tv.onOff = true;
		tv.brand = "강원대학교";
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 "+
			tv.volume + "이고 제품 회사는 " + tv.brand + "입니다.");
	}
}