package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<>();

	public static void main(String[] args) {
		do {
			System.out.println("1. Nhap ten   2. Bat dau tim kiem");
			System.out.println("Moi nhap lua chon");
			int choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				nhap();
				break;
			case 2:
				timKiem();
				break;
			default:
				System.out.println("Tam biet");
			}
		} while (true);
	}
	private static void nhap() {
		System.out.println("Moi nhap ten:");
		String name = sc.nextLine();
		names.add(name);
	}
	private static void timKiem() {
		if(names.size() != 0) {
			System.out.println("Nhap ten can tim:");
			String ten = sc.nextLine();
			for (int i = 0; i < names.size(); i++) {
				if(names.get(i).contains(ten)) {
					System.out.println(names.get(i));
				}
			}
		} else {
			System.out.println("Chua ton tai ten nao.");
		}
	}
}
