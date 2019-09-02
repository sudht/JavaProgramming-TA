package Week7;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television  myTv = new Television(); 	
		myTv.channel = 7;	
		myTv.volume = 10;	
		myTv.onOff = true;	
		myTv.brand = "강원대학교";	

		Television  yourTv = new Television(); 	
		yourTv.channel = 9;	
		yourTv.volume = 12;	
		yourTv.onOff = true;
		yourTv.brand = "컴퓨터학과";
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + 
			"이고 볼륨은 " + myTv.volume +  "이고 제품 회사는 " + myTv.brand + "입니다.");
		System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + 
			"이고 볼륨은 " + yourTv.volume +  "이고 제품 회사는 " + yourTv.brand + "입니다.");
	}
}