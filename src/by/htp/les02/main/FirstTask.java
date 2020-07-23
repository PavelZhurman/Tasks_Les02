package by.htp.les02.main;

public class FirstTask {
	public static void main(String[] args) {

		double a = 111.1;
		double b = 222.2;
		double c = 333.3;
		double x;

		x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.printf("%.3f", x);
	}
}
