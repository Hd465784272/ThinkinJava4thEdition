package code.container;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * 为IteratableClass编写两个适配器方法
 */
public class MultiIterableClass extends IteratableClass{

	//反向遍历
	public Iterable<String> reversed(){
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					int current = words.length - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[current--];
					}
				};
			}
		};
		
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				List<String> list = new ArrayList<String>(
						Arrays.asList(words));
				//根据输出结果显示,shuffle()方法只是打乱了引用，而没有影响数据。
				Collections.shuffle(list ,new Random(47));
				return list.iterator();
			}
		};
		
	}
	public static void main(String args[]){
		MultiIterableClass multiIterableClass = new MultiIterableClass();
		//正序
		for (String s : multiIterableClass) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//倒序
		for (String s : multiIterableClass.reversed()) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//打乱，正向遍历
		for (String s :  multiIterableClass.randomized()) {
			System.out.print(s+" ");
		}
	}
}
