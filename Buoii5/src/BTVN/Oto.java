package BTVN;

import java.util.Scanner;

public class Oto {
	private String chuSoHuu;
	private String tenXe;
	private String hang;
	private double gia;
	private int namMua;
	private double giaTri;
	private static Scanner sc = new Scanner(System.in);
	
	public String getChuSoHuu() {
		return chuSoHuu;
	}
	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}
	
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	public int getNamMua() {
		return namMua;
	}
	public void setNamMua(int namMua) {
		this.namMua = namMua;
	}
	
	public double getGiaTri() {
		int nam = 2022 - getNamMua();
		if (getGia() < 1000.00) {
			giaTri = gia - (gia * 0.07 * nam);
		} else if (getGia() >= 1000.00 && getGia() <= 2000.00) {
			giaTri = gia - (gia * 0.05 * nam);
		} else if (getGia() > 2000.00) {
			giaTri = gia - (gia * 0.03 * nam);
		}
		
		if (giaTri < 0) {
			giaTri = 0;
		}
		return giaTri;
	}
	
	public void Nhap() {
		System.out.println("Nhap ten chu so huu:");
		setChuSoHuu(sc.nextLine());
		System.out.println("Nhap ten xe:");
		setTenXe(sc.nextLine());
		System.out.println("Nhap hang xe:");
		setHang(sc.nextLine());
		System.out.println("Nhap gia mua:");
		setGia(sc.nextDouble());
		System.out.println("Nhap nam mua:");
		setNamMua(sc.nextInt());
		sc.nextLine();
	}
	
	public void XuatOtoHetGT(Oto x) {
		if (x.getGiaTri() == 0) {
			x.Xuat();
		}
	}
	public void Xuat() {
		System.out.printf("%-15s %-15s %-15s %-15f %-15d %-15f \n", getChuSoHuu(), getTenXe(), getHang(), getGia(), 2022 - getNamMua(), getGiaTri() );
	}
	public static void main(String[] args) {
		System.out.println("Nhap so o to trong danh sach:");
		int soOTo = sc.nextInt();
		sc.nextLine();
		Oto[] oto = new Oto[soOTo];
		for (int i = 0; i < oto.length; i++) {
			oto[i] = new Oto();
			oto[i].Nhap();
		}
		
		System.out.println("Truoc khi sap xep:");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai" );
		for (int i = 0; i < oto.length; i++) {
			oto[i].Xuat();
		}
		
		System.out.println("\n\n Sau khi sap xep:");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai" );
		SapXep(oto.length, oto);
		for (int i = 0; i < oto.length; i++) {
			oto[i].Xuat();
		}
		System.out.println("\n\n Cac o to da het gia tri:");
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai" );
		for (int i = 0; i < oto.length; i++) {
			oto[i].XuatOtoHetGT(oto[i]);
		}
	}
	
	public static void SapXep(int n, Oto oto[]) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if(oto[i].getGiaTri() < oto[j].getGiaTri()) {
					Oto temp = oto[i];
					oto[i] = oto[j];
					oto[j] = temp;
				}
			}
		}
	}
	
}
