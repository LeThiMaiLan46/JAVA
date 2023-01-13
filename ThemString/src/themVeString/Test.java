package themVeString;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("Geeks"); // khai bao new String du gtri giong nhau nhung duoc luu vao 2 o nho co dia chi khac nha
		String s2 = new String("Geeks");
		String s3 = "Geeks"; //khai bao duoc luu vao String bool nen giong nha
		String s4 = "Geeks";
		
		//so sanh 2 kieu khai bao
		System.out.println(s1 == s3);      //false
		System.out.println(s1.equals(s3)); //true
		
		//so sanh cung kieu
		System.out.println(s1 == s2);       //do khac dia chi o nho nen false
		System.out.println(s1.equals(s2)); //cung gtri nen true
		
		System.out.println(s3 == s4);        //true
		System.out.println(s3.equals(s4));  //true
	}
}
