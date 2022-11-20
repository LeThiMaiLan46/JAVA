package BTVN;

import java.util.Scanner;

public class CongTi {
	private String iD;
	private String hoTen;
	private String kieuNv;
	private int soNgay;
	private int namVao;
	private double luong;
	private double phuCap;
	private double tongTien; 
	private static Scanner sc = new Scanner(System.in);
	
	
	public String getId() {
		return iD;
	}
	public void setId(String iD) {
		this.iD = iD;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getKieuNv() {
		return kieuNv;
	}
	public void setKieuNv(String kieuNv) {
		this.kieuNv = kieuNv;
		String s1 = "San xuat";
		String s2 = "Van phong";
		if(kieuNv.compareToIgnoreCase(s1) == 0) {
			this.kieuNv = s1;
		}
		if(kieuNv.compareToIgnoreCase(s2) == 0) {
			this.kieuNv = s2;
		}
	}
	
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	public int getNamVao() {
		return namVao;
	}
	public void setNamVao(int namVao) {
		this.namVao = namVao;
	}
	
	public double getLuong() {
		String s1 = "San xuat";
		String s2 = "Van phong";
		if(getKieuNv().compareToIgnoreCase(s1) == 0) {
			luong = 0.35 * getSoNgay();
		}
		if(getKieuNv().compareToIgnoreCase(s2) == 0) {
			luong = 0.4 * getSoNgay();
		}
		return luong;
	}
	
	public double getPhuCap() {
		phuCap = 0.1 + 0.2 * (2022 - getNamVao());
		return phuCap;
	}
	
	public double getTongTien() {
		tongTien = getLuong() + getPhuCap();
		return tongTien;
	}
	
	
	public void Nhap() {
		System.out.print("Nhap id: ");
		setId(sc.nextLine());
		System.out.print("Nhap ho ten: ");
		setHoTen(sc.nextLine());
		System.out.println("Nhap kieu nhan vien: ");
		setKieuNv(sc.nextLine());
		System.out.println("Nhap so ngay lam: ");
		setSoNgay(sc.nextInt());
		System.out.println("Nhap nam vao lam: ");
		setNamVao(sc.nextInt());
		sc.nextLine();

	}
	
	public void Xuat() {
		System.out.printf("   %-5s %-17s %-15s %-16d %-15d %-15f %-15f %-15f \n", getId(), getHoTen(), getKieuNv(), getSoNgay(), getNamVao(), getLuong(), getPhuCap(), getTongTien());
	}
	
	public static void main(String[] args) {
		CongTi[] NV = new CongTi[5];
		for (int i = 0; i < NV.length; i++) {
			NV[i] = new CongTi();
			NV[i].Nhap();
		}
		System.out.printf("   %-7s %-13s %-15s %-15s %-18s %-15s %-15s %-15s \n", "ID", "Ho va ten", "Kieu nhan vien", "So ngay lam", "Nam vao lam", "Luong", "Phu cap", "Tong tien");
		for (int i = 0; i < NV.length; i++) {
			NV[i].Xuat();
		}
	}
}
