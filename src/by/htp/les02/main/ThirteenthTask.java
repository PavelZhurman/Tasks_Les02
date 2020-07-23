package by.htp.les02.main;

import java.util.Scanner;

public class ThirteenthTask {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = 0;
		int x = 1;
		int sum = 0;

		System.out.println("Ââåäèòå ÷èñëî");
		if (in.hasNextInt()) {
			a = in.nextInt();

			in.close();
			if (a < 0) {
				System.out.println("×èñëî äîëæíî áûòü ïîëîæèòåëüíûì");
			} else {

				System.out.print("Ñóììà ÷èñåë îò 1 äî " + a + " âêëþ÷èòåëüíî = ");
				while (x <= a) {

					sum += x;
					x++;

				}

				System.out.println(sum);
			}
		} else {
			System.out.println("×èñëî äîëæíî áûòü öåëûì");
		} 
	}
}
