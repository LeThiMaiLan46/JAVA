package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMainBai2 {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<ThiSinh> thiSinhs = new ArrayList<>();
	
	public static void main(String[] args) {
		do {
			System.out.println("1. Them moi thi sinh");
			System.out.println("2. Hien thi thong tin cua thi sinh va khoi thi cua thi sinh");
			System.out.println("3. Tim kiem theo so bao danh");
			System.out.println("4. Thoat khoi chuong trinh");
			System.out.println("Moi nhap lua chon:");
			int choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				nhap();
				break;
			case 2:
				hienThi();
				break;
			case 3:
				timKiem();
				break;
			case 4:
				System.out.println("Thoat khoi chuong trinh");
				System.exit(0);
			default:
				System.out.println("Khong co chuc nang");
				break;
			}
		} while (true);
	}

	private static void tieuDe() {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "So bao danh", "Ho ten", "Dia chi", "Muc uu tien", "Khoi");
	}
	
	private static void timKiem() {
		int k = 0;
		if(kiemTra()) {
			System.out.println("Moi nhap so bao danh can tim:");
			long search = sc.nextLong();
			tieuDe();
			for (int i = 0; i < thiSinhs.size(); i++) {
				if (thiSinhs.get(i).getSbd() == search) {
					k = 1;
					thiSinhs.get(i).output();
				}
			}
			if (k == 0) {
				System.out.println("Khong co thong tin thi sinh can tim");
			}
		} else {
			System.out.println("Chua co thi sinh duoc nhap vao");
		}
	}

	private static void hienThi() {
		if (kiemTra()) {
			tieuDe();
			for (int i = 0; i < thiSinhs.size(); i++) {
				thiSinhs.get(i).output();
			}
		} else {
			System.out.println("Chua co thi sinh duoc nhap vao");
		}
	}

	private static void nhap() {
		System.out.println("Nhap vao thong tin thi sinh");
		ThiSinh thiSinh = new ThiSinh();
		thiSinh.input();
		thiSinhs.add(thiSinh);
	}
	
	private static boolean kiemTra() {
		if(thiSinhs.size() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
