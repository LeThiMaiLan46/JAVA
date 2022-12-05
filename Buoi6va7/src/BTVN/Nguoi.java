package BTVN;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	private long maSoGv;
	private CBGV cbgv = new CBGV();
	private static Scanner sc = new Scanner(System.in);
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public long getMaSoGv() {
		return maSoGv;
	}
	public void setMaSoGv(long maSoGv) {
		this.maSoGv = maSoGv;
	}
	
	public Nguoi() {
	}
	
	public Nguoi(String hoTen, int tuoi, String queQuan, long maSoGv) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
		this.maSoGv = maSoGv;
	}
	
	public void input() {
		System.out.print("Ma so giao vien: ");
		setMaSoGv(sc.nextLong());
		sc.nextLine();
		System.out.print("Ho va ten: ");
		setHoTen(sc.nextLine());
		System.out.print("Tuoi: ");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.print("Que quan: ");
		setQueQuan(sc.nextLine());
		
		cbgv.input();
	}
	
	public void output() {
		System.out.printf("%-15d %-15s %-15d %-15s ", getMaSoGv(), getHoTen(), getTuoi(), getQueQuan());
		cbgv.output();
	}
}
