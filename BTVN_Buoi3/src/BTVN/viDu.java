package BTVN;

import java.util.Scanner;

public class viDu {
	public static void main(String[] args) {
		// khai bao mang
		int[] arr1 = new int[] {1, 3, 4, 5};
		float[] arr2 = new float[4];
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("n = ");
		n = scanner.nextInt();
		int[] arr3 = new int[n];
		
		// nhap mang
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("a[" + i + "] = ");
			arr3[i] = scanner.nextInt();
		}
		
		//sap xep tang dan
		for (int i = 0; i < arr3.length - 1; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if(arr3[i] > arr3[j]) {
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		
//		//xuat mang
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i] + "  ");
//		}
		
		//foreach
		for (int d : arr3) {
			System.out.print(d + "  ");
		}
		
	}
}
