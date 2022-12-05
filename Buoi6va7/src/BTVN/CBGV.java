package BTVN;

import java.util.Scanner;

public class CBGV {
	private long luongCung;
	private long luongThuong;
	private long luongPhat;
	private static Scanner sc = new Scanner(System.in);
	
	public long getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(long luongCung) {
		this.luongCung = luongCung;
	}
	public long getLuongThuong() {
		return luongThuong;
	}
	public void setLuongThuong(long luongThuong) {
		this.luongThuong = luongThuong;
	}
	public long getLuongPhat() {
		return luongPhat;
	}
	public void setLuongPhat(long luongPhat) {
		this.luongPhat = luongPhat;
	}
	public long getLuongThuc() {
		long luongThuc = getLuongCung() + getLuongThuong() - getLuongPhat();
		return luongThuc;
	}
	
	public void input() {
		System.out.print("Luong cung: ");
		setLuongCung(sc.nextLong());
		System.out.print("Luong thuong: ");
		setLuongThuong(sc.nextLong());
		System.out.print("Luong phat: ");
		setLuongThuong(sc.nextLong());
	}
	
	public void output() {
		System.out.printf("%-15d \n", getLuongThuc());
	}
}
