package BTVN;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n, dem = 1;
			do {
				System.out.print("Nhap n (n >= 2) = ");
				n = scanner.nextInt();
			} while (n < 2);
			int[] a = new int[n];
			nhapMang(a, n);
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				dem = 1;
				for (int j = i + 1; j < a.length; j++) {
					if(a[i] == a[j]) {
						dem++;
						i++;
					}
				}
				System.out.println(a[i] + " : " + dem);
			}
		}
	}
	
	// ham nhap
	public static void nhapMang(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			a[i] = new Scanner(System.in).nextInt(); 
		}
	}
}