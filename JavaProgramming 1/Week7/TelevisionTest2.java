package Week7;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television  myTv = new Television(); 	
		myTv.channel = 7;	
		myTv.volume = 10;	
		myTv.onOff = true;	
		myTv.brand = "�������б�";	

		Television  yourTv = new Television(); 	
		yourTv.channel = 9;	
		yourTv.volume = 12;	
		yourTv.onOff = true;
		yourTv.brand = "��ǻ���а�";
		System.out.println("���� �ڷ������� ä���� " + myTv.channel + 
			"�̰� ������ " + myTv.volume +  "�̰� ��ǰ ȸ��� " + myTv.brand + "�Դϴ�.");
		System.out.println("���� �ڷ������� ä���� " + yourTv.channel + 
			"�̰� ������ " + yourTv.volume +  "�̰� ��ǰ ȸ��� " + yourTv.brand + "�Դϴ�.");
	}
}