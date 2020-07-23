package by.htp.les02.main;

public class FifthTask {
	public static void main(String[] arguments) {
		double a = 15;
		double b = 19;

		if (a < b) {
			System.out.print("a меньше b");
		} else {
			if (b < a) {
				System.out.print("b меньше а");
			} else {
				if (a == b) {
					System.out.print("числа a и b равны");
				}
			}
		}
	}
}
