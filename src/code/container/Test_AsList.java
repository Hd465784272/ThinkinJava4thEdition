package code.container;

import java.util.Arrays;
import java.util.List;

public class Test_AsList {
/*
 * http://www.cnblogs.com/tina-smile/p/5056174.html
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1, 2, 3, 4};
		List list = Arrays.asList(a);
		System.out.println(list.size());
		//变量a当作一个参数传递，所以编译器会认为传递一个参数
		//基本类型是不能作为泛型的参数
		
		Integer[] aIntegers = {1,2,3,4};
		List list2 = Arrays.asList(aIntegers);
		System.out.println(list2.size());
		
		//通过Arrays.asList(T ... a) 方法初始化List 容器，该容器的长度是不可改变的。所以如果你要是想在你的容器中添加或者删除元素的话，
		//还是使用 LinkedList () 【快插入 ，快删除】 或者 ArrayList() 【快查询】。
	}

}

