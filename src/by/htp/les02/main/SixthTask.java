package by.htp.les02.main;

public class SixthTask {
	public static void main(String[] args) {
		int a = 45;
		int b = 45;
		int c;
		int summ = 180;
		int ab;

		String notExist = "Треугольник не существует";
		String exist = "Треугольник существует";
		Boolean m = true;

		c = summ - a - b;
		ab = a + b;

		System.out.println("c = " + c);
		System.out.println("ab = " + ab);

		if (ab > 180 | c <= 0) {
			m = false;
			System.out.println(notExist);
		} else {
			System.out.println(exist);
		}

		if (m == true) {
			if (a == 90 | b == 90 | c == 90) {
				System.out.println("Треугольник прямоугольный");
			}
		}
	}
}
