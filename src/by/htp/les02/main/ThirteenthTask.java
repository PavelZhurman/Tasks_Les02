package by.htp.les02.main;

import java.util.Scanner;

public class ThirteenthTask {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = 0;
		int x = 1;
		int sum = 0;

		System.out.println("Введите число");
		if (in.hasNextInt()) {
			a = in.nextInt();

			in.close();
			if (a < 0) {
				System.out.println("Число должно быть положительным");
			} else {

				System.out.print("Сумма чисел от 1 до " + a + " включительно = ");
				while (x <= a) {

					sum += x;
					x++;

				}

				System.out.println(sum);
			}
		} else {
			System.out.println("Число должно быть целым");
		}
	}
}
