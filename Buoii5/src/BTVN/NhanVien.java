package BTVN;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	private int hoursWorked;
	private double hoursRate;
	private double salary;
	private double tax;
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
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHoursRate() {
		return hoursRate;
	}
	public void setHoursRate(double hoursRate) {
		this.hoursRate = hoursRate;
	}
	public double getSalary() {
		if (getHoursWorked() < 45) {
			salary = getHoursRate() * getHoursWorked();
		} else {
			salary = getHoursRate() * (45 + (getHoursWorked() - 45) * (3/2)); 
		}
		return salary;
	}
	
	public double getTax() {
		tax = 0;
		if (getSalary() > 300) {
			tax = getSalary() * 20/100;
		}
		return tax;
	}
	
	public NhanVien() {	
		
	}
	
	public NhanVien(String hoTen, int tuoi, int hoursWorked, double hoursRate, double salary, double tax) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;
		this.salary = salary;
		this.tax = tax;
	}
	
	public static NhanVien[] NV(NhanVien nv[], NhanVien x) {
		NhanVien[] NV = new NhanVien[nv.length + 1];
		for (int i = 0; i < nv.length; i++) {
			NV[i] = new NhanVien();
			NV[i] = nv[i];
		}
		NV[nv.length] = x;
		return NV;
	}
	
	public static void timKiemTen(NhanVien nv[], String ten) {
		ten = sc.nextLine();
		for (int i = 0; i < nv.length; i++) {
			if(nv[i].getHoTen().contains(ten)) {
				nv[i].Xuat();;
			}
		}
	}
	
	public static void topBa(NhanVien nv[]) {
		for (int i = 0; i < nv.length - 1; i++) {
			for (int j = i + 1; j < nv.length; j++) {
				if (nv[i].getHoursWorked() < nv[j].getHoursWorked()) {
					NhanVien temp = nv[i];
					nv[i] = nv[j];
					nv[j] = temp;
				}
			}
		}
		int k = 0;
		for (int i = 0; i < nv.length; i++) {
			nv[i].Xuat();
			k++;
			if (k == 2) {
				break;
			}
		}
	}
	
	public void Nhap() {
		sc.nextLine();
		System.out.println("Ho ten:");
		setHoTen(sc.nextLine());
		System.out.println("Tuoi:");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Gioi tinh:");
		setGioiTinh(sc.nextLine());
		System.out.println("Dia chi:");
		setDiaChi(sc.nextLine());
		System.out.println("Hours Worked:");
		setHoursWorked(sc.nextInt());
		System.out.println("Hours Rate:");
		setHoursRate(sc.nextDouble());
	}
	
	public void Xuat( ) {
		System.out.printf("%-10s %-10d %-15s %-15s %-15d %-15f %-15f %-15f \n", getHoTen(), getTuoi(), getGioiTinh(), getDiaChi(), getHoursWorked(), getHoursRate(), getSalary(), getTax());
	}
	
	public static void main(String[] args) {
		System.out.println("Nhap so nhan vien:");
		int n = sc.nextInt();
		NhanVien[] nv = new NhanVien[n];
		for (int i = 0; i < nv.length; i++) {
			nv[i] = new NhanVien();
			nv[i].Nhap();
		}
		
		System.out.println("1: Them moi nhan vien: ");
        System.out.println("2: Hien thi danh sach thong tin: ");
        System.out.println("3: Hien thi top 3 nhan vien cham chi nhat: ");
        System.out.println("4: Tim kiem theo ho ten: ");
        System.out.println("5: Thoat khoi chuong trinh: ");
        System.out.println("Chon: ");
        String ten;
		int k = 2;
		int m;
		do {
			m = sc.nextInt();
			switch (m) {
			case 1: {
				System.out.println("Nhap thong tin nhan vien them moi:");
				NhanVien x = new NhanVien();
				x.Nhap();
				nv = NV(nv, x);
				System.out.println("Chon: ");
				break;
			}
			case 2: {
				System.out.printf("%-10s %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Ho ten", "Tuoi", "Gioi tinh", "Dia chi", "Hours worked", "Hours rate", "Salary", "Tax");
				for (int i = 0; i < nv.length; i++) {
					nv[i].Xuat();
				}
				System.out.println("Chon: ");
				break;
			}
			case 3: {
				System.out.println("top 3 nhan vien cham chi nhat:");
				System.out.printf("%-10s %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Ho ten", "Tuoi", "Gioi tinh", "Dia chi", "Hours worked", "Hours rate", "Salary", "Tax");
				topBa(nv);
				System.out.println("Chon: ");
				break;
			}
			case 4: {
				System.out.println("Nhap ten can tim: ");
				ten = sc.nextLine();
				timKiemTen(nv, ten);
				System.out.println("Chon: ");
				break;
			}
			case 5: {
				return;
			}
			default:
				System.out.println("Chon lai:");
				break;
			}
			k = 2;
		} while (k > 0);
	}
}
