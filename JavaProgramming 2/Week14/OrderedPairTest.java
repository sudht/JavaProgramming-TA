package Week14;

class OrderedPair<K, V> {
	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public V getValue() {		return value;	}
	public K getKey() {		return key;	}
	public void setValue(V value) {		this.value = value;	}
	public void setKey(K key) {		this.key = key;	}

	@Override
	public String toString() {
		return "Key는 \"" + key + "\"이고, Value는 \"" + value + "\"입니다.";

	}

}

public class OrderedPairTest {

	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<String, 
				Integer>("mykey", 12345678);
		OrderedPair<String, String> p2 = new OrderedPair<String, 
				String>("java", "a progrmming language");
		
		p1.setKey("yourKey");
		p2.setValue("Programming2");
		System.out.println(p1);
		System.out.println(p2);
	}
}