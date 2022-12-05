package LyThuyet;

public class NapChongPhuongThuc {
	public static int tinhTong(int a, int b) {
		return a + b;
	}
	
	public static int tinhTong(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double tinhTong(double a, double b) {
		return a + b;
	}
	//cách sử dụng:
	//1. số lượng tham số truyền vào hàm khác nhau thì hàm được gọi sẽ khác nhau
	//2. kiểu dữ liệu của tham số mà mình truyền vào hàm
	
	public static void main(String[] args) {
		System.out.println(tinhTong(2, 3));
		System.out.println(tinhTong(2, 3, 4));
		System.out.println(tinhTong(2.3f, 4.5f));
	}
}
