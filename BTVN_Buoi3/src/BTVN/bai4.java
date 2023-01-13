package BTVN;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, dung = 0;
		do {
			System.out.print("Nhap n = ");
			n = scanner.nextInt();
		} while (n <= 0);
		int[] a = new int[n];
		
		//nhap mang
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (soNguyenTo(a[i]) == 1 && soSieuNguyenTo(a[i]) == 1) {
				dung = 1;
				System.out.print(a[i] + "   ");
			}
		}
		if (dung == 0) {
			System.out.println("NO");
		}
	}
	// ham tim so nguyen to
	public static int soNguyenTo(int x) {
		if (x == 1) {
			return 0;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	// ham tim so sieu nguyen to
	public static int soSieuNguyenTo(int x) {
		while (x > 0) {
			if (soNguyenTo(x % 10) == 0) {
				return 0;
			}
			x = x / 10;
		}
		return 1;
	}
}
