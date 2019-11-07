package Week2;

class Television {
	int channel;		// 채널 번호
	int volume;			// 볼륨
	boolean onOff;	// 전원 상태
	String company;
	
	public static void main(String[] args){
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.company = "강원대학교";
		
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "이고 제품 회사는 " + tv.company + "입니다.");
	}
}
