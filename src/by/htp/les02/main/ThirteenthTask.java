package by.htp.les02.main;

import java.util.Scanner;

public class ThirteenthTask {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = 0;
		int x = 1;
		int sum = 0;

		System.out.println("������� �����");
		if (in.hasNextInt()) {
			a = in.nextInt();

			in.close();
			if (a < 0) {
				System.out.println("����� ������ ���� �������������");
			} else {

				System.out.print("����� ����� �� 1 �� " + a + " ������������ = ");
				while (x <= a) {

					sum += x;
					x++;

				}

				System.out.println(sum);
			}
		} else {
			System.out.println("����� ������ ���� �����");
		}
	}
}
