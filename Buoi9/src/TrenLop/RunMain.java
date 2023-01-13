package TrenLop;

import java.util.Scanner;

public class RunMain {
	static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//tinh da hinh: 1 doi tuong thi se co nhieu hinh the
		//su dung kieu du lieu cus lop cha de tham chieu den doi tuong cua lop con
				
		//tinh da hinh co 2 loai: da hinh luc complie time(ghi de phuong thuc - override) hoac da hinh luc runtime(instanceof)
		//ghi de phuong thuc la 1 vi du cua tinh da hinh khi complile
		Animal animal = new Animal();
		animal.eat();
		//chi co the override voi phuong thuc, 0 the override thuoc tinh
		Animal dog1 =new Dog();
		dog1.eat();
		System.out.println(dog1.k);
		
		Dog dog2 = new Dog();
		dog2.eat();
		System.out.println(dog2.k);
		
		Animal cat1 = new Cat();
		cat1.eat();
		
		//tu khoa "instanceof": dung de kiem tra kieu du lieu cua doi tuong co phai la kieu du lieu do hay khong(true hoac false)
		Integer c = 10;
		System.out.println(c instanceof Integer);
	}
	
	public static void input(Animal animal) {
		System.out.println("Nhap tuoi:");
		animal.setAge(sc.nextInt());
		
		//su dung da hinh
		if (animal instanceof Dog) {
			//ep kieu cho animal thanh kieu Dog
			Dog d = (Dog) animal;
			System.out.println("Nhap ten:");
			d.setName(sc.nextLine());
			sc.nextLine();
			System.out.println("Name: " + d.getName());
		}
		if (animal instanceof Cat) {
			//ep kieu cho animal thanh kieu Cat
			Cat c = (Cat) animal;
			System.out.println("Nhap ten:");
			c.setName(sc.nextLine());
			sc.nextLine();
			System.out.println("Name: " + c.getName());
		}
	}
	
	public static void output(Animal animal) {
		
	}

}
