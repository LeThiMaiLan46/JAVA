package BTVN;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, dem = 1;
		int max = dem;
		do {
			System.out.print("Nhap n = ");
			n = scanner.nextInt();
		} while (n <= 1);
		int[] a = new int[n];
		//nhap mang
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] <= a[i + 1]) {
				dem++;
				max = dem;
			} else {
				max = Math.max(max,  dem);
				dem = 1;
			}
		}
		max = Math.max(dem, max);
		System.out.println(max);
	}
}
