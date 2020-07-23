package by.htp.les02.main;

public class EighthTask {
	public static void main(String[] args) {
		int a = 12;
		int b = 23;

		int x = 11;
		int y = 22;
		int z = 22;

		if (a > x & b > y | a > y & b > x | a > z & b > y | a > y & b > z | a > x & b > z | a > z & b > x) {
			System.out.println("Кирпич пройдёт через отверстие");
		} else {
			System.out.println("Кирпич через отверстие не пройдёт");
		}

	}
}
