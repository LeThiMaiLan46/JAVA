package TrenLop;

public class LambdaExpression {
	//interface: co the khai bao nhieu method abstract
	//functional interface: chi duoc khoi tao duy nhat 1 method abstract(truu tuong)
	@FunctionalInterface //khai bao day la 1 functional interface, do ddos chi khai bao duoc 1 method abstract
	interface Hello {
		//method abstract
		public String sayHelllo(String hello);
		default void test() {
			System.out.println("hello");
		}
		static void test2() {
			System.out.println("Xin chao");
		}
	}
	
	@FunctionalInterface
	interface Goodbye {
		void goodbye();
	}
	
	public static void main(String[] args) {
		//toan tu mui ten(->)
		//truoc mui ten la danh sach tham so
		//sau mui ten la noi dung thuc thi
		// (int a, int b) -> {do sonething};
		
		//lambda la 1 ham an danh, co tinh chat nhu 1 ham bth
		// -> dung de lien ket danh sach bien voi noi dung thuc thi
		
		//co the khai bao kieu du lieu cua tham so hoac khong
		Hello s = (String name) -> {
			return "Hello " + name;
		};
		//Hello s1 = (name) -> "Hello " + name;
		
		Goodbye goodbye = () -> {
			System.out.println("Say goodbye");
		};
		System.out.println(s.sayHelllo("moi nguoi"));
	}
}
