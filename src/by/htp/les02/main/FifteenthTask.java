package by.htp.les02.main;

public class FifteenthTask {
	public static void main(String[] args) {

		int a = 12;
		int b = 680;
		int x;

		System.out.print("Наибольший общий делитель чисел " + a + " и " + b + " = ");

		while (b != 0) {
			x = a % b;
			a = b;
			b = x;
		}
		System.out.println(a);
	}

}
