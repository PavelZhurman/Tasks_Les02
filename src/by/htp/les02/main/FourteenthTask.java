package by.htp.les02.main;

import java.util.Scanner;

public class FourteenthTask {
	public static void main(String[] args) {
		int a;
		int x = 2;
		long factorial = 1L;
		Scanner in = new Scanner(System.in);

		System.out.println("������� �����");
		if (in.hasNextInt()) {
			a = in.nextInt();

			if (a < 0) {
				System.out.println("����� ������ ���� �������������");
			} else {

				in.close();

				while (x <= a) {
					factorial *= x;
					x++;
				}
				System.out.println("��������� ����� " + a + " = " + factorial);
			}
		} else {
			System.out.println("���������� ������� ������������� �����");
		}
	}
}
