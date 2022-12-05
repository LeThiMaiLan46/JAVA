package LyThuyet;

import java.util.Scanner;

public class HocSinh {
	private String mhs;
	private String tenHs;
	private int tuoi;
	private LopHoc lopHoc = new LopHoc();
	private static Scanner sc = new Scanner(System.in);
		
	public String getMhs() {
		return mhs;
	}
	public void setMhs(String mhs) {
		this.mhs = mhs;
	}
	public String getTenHs() {
		return tenHs;
	}
	public void setTenHs(String tenHs) {
		this.tenHs = tenHs;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public HocSinh() {}
//	public HocSinh(String msv, String tenSv, int tuoi, LopHoc lophoc) {
//		this.mhs = mhs;
//		this.tenHs = tenHs;
//		this.tuoi = tuoi;
//		this.lophoc = new LopHoc();
//	}
	
//	public HocSinh(String msv, String tenSv, int tuoi) {
//		this.mhs = mhs;
//		this.tenHs = tenHs;
//		this.tuoi = tuoi;
//	}
//	
	
	public void input() {
		System.out.println("Nhap vao ma hoc sinh");
		setMhs(sc.nextLine());
		System.out.println("Nhap vao ten hs:");
		setTenHs(sc.nextLine());
		System.out.println("Nhap vao tuoi:");
		setTuoi(sc.nextInt());
		sc.nextLine();
		
		//goi den ham input cua doi tuong
		lopHoc.input();
	}
	
	public void output() {
		System.out.println("Ma hoc sinh: " + getMhs());
		System.out.println("Ten hoc sinh: " + getTenHs());
		System.out.println("Tuoi: " + getTuoi());
		lopHoc.output();
	}
	public static void main(String[] args) {

		HocSinh hs = new HocSinh();
		hs.input();
		hs.output();
	}
}
