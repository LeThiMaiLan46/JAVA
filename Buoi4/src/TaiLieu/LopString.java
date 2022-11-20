package TaiLieu;

import java.util.Locale;

public class LopString {
	public static void main(String[] args) {
		String name = "Nguyen1 Van1 A";
		String str = new String("Nguyen Van A"); //cach khai bao khac
		// charAt(i): lay ra ki tu thu i trong chuoi
		System.out.println(name.charAt(4));
		
		//indexOf("ki tu"): lay gia vi tri dau tien ma ki tu xuat hien 
		System.out.println(name.indexOf("1"));
		
		//lastIndexOf("ki tu"): lay gia vi tri dau tien ma ki tu xuat hien 
		System.out.println(name.lastIndexOf("1"));
		
		
		String str1 ="Nguyen Van B";
		//toUpperCase: chuyen toan bo chuoi thanh viet hoa
		System.out.println(str1.toUpperCase(Locale.ROOT));
		
		//toLowerCase: chuyen toan bo chuoi thanh viet thuong
		System.out.println(str1.toLowerCase(Locale.ROOT));
		
		
		String str2 = "Hello moi nguoi";
		//substring(i): lay tu i den het
		System.out.println(str2.substring(6));
		
		//substring(vtri bat dau, vtri ket thuc)
		System.out.println(str2.substring(6, 9));
		
		
		String str3 = "        Nguyen Van  C    ";
		//trim(): xoa dau cach o dau va cuoi
		System.out.println(str3.trim()); //1 chuoi copy, 0 phai thay doi tren chuoi str3, muon thay doi can gan lai bang 1 chuoi khac
		
		String str5 = "Hello, Hello, Hello, hehe";
		//replace(ki tu cu, ki tu moi): thay the
		System.out.println(str5.replace("Hello", "Hi")); //1 chuoi copy, 0 phai thay doi tren chuoi str5
		
		//chuoi1.compateTo(chuoi2): so sanh 2 chuoi
		//chuoi1.compareToIgnoreCase(chuoi2): 0 so sanh hoa thuong
		String name1 = "Nguyen Van A";
		String name2 = "nguyen Van A";
		if(name1.compareTo(name2) == 0) {
			System.out.println("Name1 lon hon Name2");
		} else {
			System.out.println("Name1 nho hon Name2");
		}

	}
}
