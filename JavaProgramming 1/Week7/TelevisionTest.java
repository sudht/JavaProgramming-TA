package Week7;

public class TelevisionTest {
	public static void main(String[] args) {

		Television  tv = new Television(); 	
		tv.channel = 7;	
		tv.volume = 9;	
		tv.onOff = true;
		tv.brand = "�������б�";
		System.out.println("�ڷ������� ä���� " + tv.channel + "�̰� ������ "+
			tv.volume + "�̰� ��ǰ ȸ��� " + tv.brand + "�Դϴ�.");
	}
}