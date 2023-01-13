package KienThuc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class streamAPI {
	public static void main(String[] args) {
		// thao tac streanm voi cac kieu du lieu nguyen thuy
		IntStream.range(1, 5). //range: phuong thuc sinh ra cac phan tu co gtri tu 1 den 5
			forEach(i -> System.out.println(i + " ")); //hoat dong dau cuoi
		
		LongStream.
			of(1, 2, 3, 4). //bao gom cac gtri
			filter(i -> i>1).
			forEach(i -> System.out.println(i + " "));
		
		DoubleStream.
			of(1.3, 2.3, 4.3, 5.3).
			forEach(i -> System.out.println(i + " "));
		
		//tao Stream voi mang Array
		String[] languages = {"Java", "C#", "C++"};
		//tao Stream
		Stream<String> stringStream = Arrays.stream(languages);
//		long cnt = stringStream.count();
//		System.out.println(cnt);
		stringStream.forEach(i -> System.out.println(i + " "));
			
		//khi ma minh khai bao dinh nghia co san nhung gtri trong stream
		// thi minh co the in ra du lieu do tren kieu khac
		Stream<String> stream = Stream.of("Java", "C#", "C++", "JavaScript");
		
		//chuyen tu Stream sang List
		List<String> str = stream.collect(Collectors.toList());
		str.forEach(i -> System.out.println(i + " "));
		
		//cac phuong thuc:
		//filter(): loai bo phan tu dua tren tieu chi nhat dinh, trong () la 1 bieu thuc lambda
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.println(i + ""));
		
		//skip(), limit()
		//skip(n): bo qua n phan tu dau tien cua List ma minh muon thao tac
		//limit(n): gioi han so phan tu cua liat neu n <= so phan tu cua list 
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		list1.stream().skip(1).limit(2).forEach(i -> System.out.println(i + " "));
		
		//map(): ánh xạ
		list1.stream().map(i -> i*2).forEach(i -> System.out.println(i + " ")); // 2 4 6 8 10
		
		//sorted(): sap xep tang dan
		list1.stream().sorted().forEach(i -> System.out.println(i + " "));
		
		//sap xep giam dan:
		list1.stream().sorted((a, b) -> b - a).forEach(i -> System.out.println(i + " "));
	}
}
