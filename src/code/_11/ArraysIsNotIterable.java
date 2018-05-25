package code._11;

import java.util.Arrays;
import java.util.List;

public class ArraysIsNotIterable {
	static<T> void test(Iterable<T> it){
		for(T t : it){
			System.out.println(t);
		}
	}
	public static void main(String[] args){
		List<String> strings = Arrays.asList("Larry", "Moe", "Curly");
//		test(strings);
		String[] strings2 = {"Can","I","Help","You","?"};
		//test(strings2);
		//说明不存在任何从数组到iterator的自动转换，你必须手动转换
		
		//如何从数组转换为iterable 呢 ？
		
		for(String s:strings2){
			strings.add(s);
			System.out.println(s);
		}
	}
}
