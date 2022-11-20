package BTVN;

import java.util.Scanner;

public class LopSV {
	private static int msv = 1;
	private int maSv;
	private String hoTen;
	private String diaChi;
	private long dienThoai;
	private double diem;
	private static Scanner sc = new Scanner(System.in);
	
	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public long getDienThoai() {
		return dienThoai;
	}


	public void setDienThoai(long dienThoai) {
		this.dienThoai = dienThoai;
	}


	public double getDiem() {
		return diem;
	}


	public void setDiem(double diem) {
		this.diem = diem;
	}

	public LopSV() {
		this.maSv = msv++;
	}
	
	public LopSV(int maSv, String hoTen, String diaChi, long dienThoai, double diem) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.diem = diem;
	}
	
	public static void sapXepDiem(int n, LopSV SV[]) {
		for (int i = 0; i < SV.length - 1; i++) {
			for (int j = i + 1; j < SV.length; j++) {
				if(SV[i].getDiem() > SV[j].getDiem()) {
					LopSV temp = SV[i];
					SV[i] = SV[j];
					SV[j] = temp;
				}
			}
		}
		for (int i = 0; i < SV.length; i++) {
			System.out.println(SV[i].toString());
		}
	}
	
	public static void timKiemTen(int n, LopSV SV[], String ten) {
		ten = sc.nextLine();
		for (int i = 0; i < SV.length; i++) {
			if(SV[i].getHoTen().contains(ten)) {
				System.out.println(SV[i].toString());
			}
		}
	}
	
	public static int index(String s) {
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static char chuCaiDau(String s, int index) {
		return s.charAt(index + 1);
	}
	
	public static void sapXepTen(int n, LopSV[] SV) {
		for (int i = 0; i < SV.length - 1; i++) {
			for (int j = i + 1; j < SV.length; j++) {
				if(chuCaiDau(SV[i].getHoTen(), index(SV[i].getHoTen())) > chuCaiDau(SV[j].getHoTen(), index(SV[j].getHoTen()))) {
					LopSV temp = SV[i];
					SV[i] = SV[j];
					SV[j] = temp;
				}
			}
		}
		for (int i = 0; i < SV.length; i++) {
			System.out.println(SV[i].toString());
		}
	}
	
	@Override
	public String toString() {
		return  maSv + "\t" + hoTen + "\t" + diaChi + "\t" + dienThoai + "\t" + diem;
	}
	
	public void Nhap() {
		sc.nextLine();
		System.out.println("Ho ten:");
		setHoTen(sc.nextLine());
		System.out.println("Dia chi:");
		setDiaChi(sc.nextLine());
		System.out.println("So dien thoai:");
		setDienThoai(sc.nextLong());
		System.out.println("Diem:");
		setDiem(sc.nextDouble());
	}

	public static void main(String[] args) {
		System.out.println("Nhap so sinh vien trong lop:");
		int n = sc.nextInt();
		LopSV[] SV = new LopSV[n];
		for (int i = 0; i < SV.length; i++) {
			SV[i] = new LopSV();
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			SV[i].Nhap();
		}
		for (int i = 0; i < SV.length; i++) {
			System.out.println(SV[i].toString());
		}
		
		System.out.println("1: In ra man hinh theo thu tu tang dan cua diem: ");
        System.out.println("2: Tim kiem theo ten: ");
        System.out.println("3: Sap xep danh sach theo thu tu bang chu cai: ");
        System.out.println("4: Thoat chuong trinh: ");
        System.out.println("Chon: ");
        String ten;
		int k = 2;
		int m;
		do {
			m = sc.nextInt();
			switch (m) {
			case 1: {
				sapXepDiem(n, SV);
				System.out.println("Chon: ");
				break;
			}
			case 2: {
				System.out.println("Nhap ten can tim: ");
				ten = sc.nextLine();
				timKiemTen(n, SV, ten);
				System.out.println("Chon: ");
				break;
			}
			case 3: {
				sapXepTen(n, SV);
				System.out.println("Chon: ");
				break;
			}
			case 4: {
				return;
			}
			default:
				System.out.println("Chon lai");
				break;
			}
			k = 2;
		} while (k > 0);
	}
}

