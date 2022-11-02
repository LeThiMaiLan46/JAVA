package BTVN;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, khoangCach, dung = 0;
		do {
			System.out.print("Nhap n = ");
			n = scanner.nextInt();
		} while (n <= 0);
		int[] a = new int[n];
		
		// nhap
		System.out.println("Nhap vao mang so nguyen tang dan:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 1; i < a.length; i++) {
			khoangCach = a[i] - a[i - 1];
			if (khoangCach > 1) {
				dung = 1;
				for (int j = 1; j < khoangCach ; j++) {
					System.out.print(a[i - 1] + j + "  ");
				}
			}
		}
		if (dung == 0) {
			System.out.println("YES");
		}
	}
}
