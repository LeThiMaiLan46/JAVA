package LyThuyet;

import java.util.ArrayList;

public class Array_Listt {
	public static void main(String[] args) {
		// Kiểu dữ liệu truyền vào phải là 1 wrapper class hoặc đối tượng
		
		//cách khai báo ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
				
		ArrayList<String> strs = new ArrayList<>();
		
		//ArayrList là 1 lớp riêng nên nó có lớp riêng(đã được tự định nghĩa)
		numbers.add(2); //thêm giá trị 2 vào cuối danh sách
		numbers.add(3);
		numbers.add(4);
		numbers.add(2, 0);
		
		System.out.println(numbers);
		
		ArrayList<Integer> number2 = new ArrayList<>();
		number2.add(5);
		number2.addAll(numbers); //thêm list1 vào cuối list 2
		System.out.println(number2);
		
		//contains: trả về true nếu tìm thấy 1 phần tử ở trong list, ngược lại trả về false
		if (number2.contains(10)) {
			System.out.println("Co");
		} else {
			System.out.println("Khong co");
		}
		
		//retainAll: xóa phần từ không thuộc number ra khỏi number2 
		number2.retainAll(numbers);
		System.out.println("Sau retainAll: " + number2);
		
		//indexOf: trả về vị trí đầu tiên của phần tử
		number2.add(3);
		System.out.println("Vi tri dau tien cua phan tu 3: " + number2.indexOf(3));
		//lastIndexOf: trả về vị trí cuối cùng của phần tử
		System.out.println("Vi tri cuoi cung cua phan tu 3: " + number2.lastIndexOf(3));
		
		//size(): đọ dài của mảng
		for (int i = 0; i < number2.size(); i++) {
			System.out.println(number2.get(i) + " ");
		}
		
		//set: cập nhật lại giá trị
		number2.set(2, 10);
		System.out.println("Sau khi set: " + number2);
		
		//clear: xóa các phần tử trong list
		number2.clear();
		System.out.println("Sau khi clear: " + number2);
	}
}
