package by.htp.les02.main;

public class EleventhTask {
	public static void main(String[] args) {
		double a = -20.23;
		double b = 12;
		double h = 0.5;
		double y;
		double x = 1;

		if (x > 2) {
			while (a <= b) {

				a = a + h;
				x = a;
				y = x;
				System.out.println(y);
			}
		} else {
			while (a <= b) {

				a = a + h;
				x = a;
				y = -x;
				System.out.println(y);
			}
		}
	}
}
