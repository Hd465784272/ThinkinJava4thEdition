package code.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddGroups {
	public static void main(String args[]){
		Collection<Integer> collection = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5));
		//用 Arrays.asList()为 Collection 构造器产生输入	
		Integer[] moreInts = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		//collection.addAll 接受另一个 Collection 对象作为参数
		Collections.addAll(collection, 11, 12, 13, 14,15);
		Collections.addAll(collection, moreInts);
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		//通过Arrays.asList(T ... a) 方法初始化List 容器，该容器的长度是不可改变的。
		list.set(1, 99);//修改一个元素
		//list.add(21);
		//
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(0, 0);
		list2.add(1, 1);
		list2.add(1, 5);
		//不是覆盖。自己尝试下
		
		System.out.println(collection);
		System.out.println(list);
		System.out.println(list2);
		
	}
}

