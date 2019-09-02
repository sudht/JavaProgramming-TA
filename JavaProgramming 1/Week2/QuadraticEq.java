package Week2;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.5;
		double b = -4.5;
		double c = -5;
		
		double disc = b * b - 4.0 * a * c;
		double sqr = Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2.0 / a;
		double r2 = (-b - sqr) / 2.0 / a;
		
		System.out.println("근은 " + r1);
		System.out.println("근은 " + r2);
	}
}
