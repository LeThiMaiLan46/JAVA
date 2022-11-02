package BTVN;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, dem = 1, max1 = 0, max2 = 0;
		do {
			System.out.print("Nhap n = ");
			n = scanner.nextInt();
		} while (n <= 0);
		int[] a = new int[n];
		//nhap mang
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] < a[i + 1]) {
				dem++;
				max1 = dem;
			} else {
				if(max2 < max1) {
					max2 = max1;
				}
				dem = 1;
			}
		}
		if (max1 > max2) {
			System.out.println("ket qua = " + max1);
		} else {
			System.out.println("ket qua = " + max2);
		}
	}
}
