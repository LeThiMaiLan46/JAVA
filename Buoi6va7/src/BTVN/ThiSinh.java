package BTVN;

import java.util.Scanner;

public class ThiSinh {
	private long sbd;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	private KhoiThi khoi = new KhoiThi();
	private static Scanner sc = new Scanner(System.in);
	
	public long getSbd() {
		return sbd;
	}
	
	public void setSbd(long sbd) {
		this.sbd = sbd;
	}
	
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
	
	public int getMucUuTien() {
		return mucUuTien;
	}
	
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public ThiSinh() {
	}
	
	public ThiSinh(long sbd, String hoTen, String diaChi, int mucUuTien) {
		super();
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}
	
	public void input() {
		System.out.print("So bao danh: ");
		setSbd(sc.nextLong());
		sc.nextLine();
		System.out.print("Ho va ten: ");
		setHoTen(sc.nextLine());
		System.out.print("Dia chi: ");
		setDiaChi(sc.nextLine());
		System.out.print("Muc uu tien: ");
		setMucUuTien(sc.nextInt());
		khoi.input();
	}
	
	public void output() {
		System.out.printf("%-15d %-15s %-15s %-15d ", getSbd(), getHoTen(), getDiaChi(), getMucUuTien());
		khoi.output();
	}
	
	public static void main(String[] args) {
		
	}
}
