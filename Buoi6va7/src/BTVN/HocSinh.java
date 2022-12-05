package BTVN;

import java.util.Scanner;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	private LopHoc lopHoc = new LopHoc();
	private static Scanner sc = new Scanner(System.in);
	
	public HocSinh() {
	}
	
	public HocSinh(String hoTen, int tuoi, String queQuan) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}

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
	
	public void input() {
		System.out.println("Ho ten:");
		setHoTen(sc.nextLine());
		System.out.println("Tuoi:");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Que quan:");
		setQueQuan(sc.nextLine());
		lopHoc.input();
	}
	
	public void output() {
		System.out.printf("%-15s %-15d %-15s ", getHoTen(), getTuoi(), getQueQuan());
		lopHoc.output();
	}
}
