package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMainBai4 {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<Nguoi> teachers = new ArrayList<>();
	
	public static void main(String[] args) {
		do {
			System.out.println("1. Them giao vien");
			System.out.println("2. Hien thi thong tin giao vien");
			System.out.println("3. Xoa giao vien theo ma so");
			System.out.println("4. Thoat chuong trinh");
			System.out.print("Moi ban nhap lua chon: ");
			int choose = sc.nextInt();
			sc.nextLine();
			
			switch (choose) {
			case 1:
				them();
				break;
			case 2:
				xuat();
				break;
			case 3:
				xoa();
				break;
			case 4:
				System.out.println("Tam biet!");
				System.exit(0);
			default:
				System.out.println("Khong co chuc nang");
				break;
			}
		} while (true);
	}

	private static void xuat() {
		if (kiemTra()) {
			System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ma so giao vien", "Ho ten", "Tuoi", "Que quan", "Luong thuc linh");
			for (int i = 0; i < teachers.size(); i++) {
				teachers.get(i).output();
			}
		} else {
			System.out.println("Chua co giao vien nao. Moi nhap.");
		}
	}

	private static void xoa() {
		int k = 0;
		if (kiemTra()) {
			System.out.print("Nhap ma so giao vien can xoa:");
			long search = sc.nextLong();
			for (int i = 0; i < teachers.size(); i++) {
				if (teachers.get(i).getMaSoGv() == search) {
					k = 1;
					teachers.remove(i);
					System.out.println("Da xoa");
				}
			}
			if (k == 0) {
				System.out.println("Khong co giao vien tuong ung");
			}
		} else {
			System.out.println("Chua co giao vien nao. Moi nhap.");
		}
	}

	private static void them() {
		System.out.println("Nhap vao thong tin giao vien");
		Nguoi teacher = new Nguoi();
		teacher.input();
		teachers.add(teacher);
	}
	
	private static boolean kiemTra() {
		if (teachers.size() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
