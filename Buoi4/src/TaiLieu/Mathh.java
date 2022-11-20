package TaiLieu;

import java.util.Scanner;

public class Mathh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double E = Math.E;
		System.out.println(E);
		
		double P = Math.PI;
		System.out.println(P);
		
		int a = -5;
		int b = Math.abs(a);
		System.out.println(b);
		
		int c = 4, d = 6;
		int max = Math.max(c, d);
		System.out.println(max);
		
		//tinh chu vi va dien tich hinh tron
		System.out.print("Nhap R = ");
		double R = sc.nextDouble();
		System.out.printf("Chu vi = %.2f", chuVi(R));
		System.out.println(" ");
		System.out.printf("Dien tich = %.2f", dienTich(R));
	}
	
	public static double chuVi(double R) {
		return 2 * Math.PI * R;
	}
	
	public static double dienTich(double R) {
		return Math.PI * Math.pow(R, 2);
	}
}
