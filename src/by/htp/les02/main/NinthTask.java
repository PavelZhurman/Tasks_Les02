package by.htp.les02.main;

public class NinthTask {
	public static void main(String[] args) {

		double x = 3;
		double y;

		if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
		} else {
			y = Math.pow(x, 2) - 3 * x + 9;

		}
		System.out.println("F(" + x + ") = " + y);

	}
}
