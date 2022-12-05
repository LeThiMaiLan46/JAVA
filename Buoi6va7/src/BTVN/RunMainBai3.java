package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMainBai3 {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<HocSinh> hocSinhs = new ArrayList<>();
	
	public static void main(String[] args) {
		do {
			System.out.println("1. Them hoc sinh moi");
			System.out.println("2. Xuat ra thong tin hoc sinh");
			System.out.println("3. Hien thi cac hoc sinh 20 tuoi");
			System.out.println("4. So luong cac hoc sinh co tuoi la 23 va que o DN");
			System.out.println("5. Sap xep sinh vien tang dan theo que quan");
			System.out.println("6. Ket thuc chuong trinh");
			System.out.println("Nhap vao lua chon:");
			int choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					themHocSinh();
					break;
				case 2:
					xuatHocSinh();
					break;
				case 3:
					hienThiHs20Tuoi();
					break;
				case 4:
					soLuongHs23TuoiDaNang();
					break;
				case 5:
					sapXepTangDanTheoQueQuan();
					break;
				case 6:
					System.out.println("Thoat chuong trinh");
					System.exit(0);
				default:
					System.out.println("Khong hop le");
					break;
			}
		} while (true);
	}

	private static void themHocSinh() {
		// TODO Auto-generated method stub
		System.out.println("Nhap thong tin hoc sinh:");
		HocSinh hs = new HocSinh();
		hs.input();
		hocSinhs.add(hs);
	}

	private static void tieuDe() {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ho va ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
	}
	
	private static void xuatHocSinh() {
		// TODO Auto-generated method stub
		if(kiemTra()) {
			tieuDe();
			for (int i = 0; i < hocSinhs.size(); i++) {
				hocSinhs.get(i).output();
			}
		} else {
			System.out.println("Chua co hoc sinh nao");
		}
	}

	private static void hienThiHs20Tuoi() {
		// TODO Auto-generated method stub
		if(kiemTra()) {
			tieuDe();
			for (int i = 0; i < hocSinhs.size(); i++) {
				if(hocSinhs.get(i).getTuoi() == 20) {
					hocSinhs.get(i).output();
				}
			}
		} else {
			
		}
	}

	private static void soLuongHs23TuoiDaNang() {
		// TODO Auto-generated method stub
		if (kiemTra()) {
			int dem = 0;
			for (int i = 0; i < hocSinhs.size(); i++) {
				if(hocSinhs.get(i).getTuoi() == 23 && hocSinhs.get(i).getQueQuan().compareTo("Da Nang") == 0) {
					dem++;
				}
			}
			System.out.println("Co " + dem + " hoc sinh 23 tuoi que o Da Nang");
		} else {
			System.out.println("Chua co sinh vien nao");
		}
	}

	private static void sapXepTangDanTheoQueQuan() {
		// TODO Auto-generated method stub
		for (int i = 0; i < hocSinhs.size() - 1; i++) {
			for (int j = i + 1; j < hocSinhs.size(); j++) {
				if(hocSinhs.get(i).getQueQuan().compareTo(hocSinhs.get(j).getQueQuan()) < 0) {
					HocSinh temp = hocSinhs.get(i);
					hocSinhs.set(i, hocSinhs.get(j));
					hocSinhs.set(j, temp);
				}
			}
		}
		xuatHocSinh();
	}
	
	private static boolean kiemTra() {
		if(hocSinhs.size() != 0) {
			return true;
		} else {
			return false;
		}
	}
}
