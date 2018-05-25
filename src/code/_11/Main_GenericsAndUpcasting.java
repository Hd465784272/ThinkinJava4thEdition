package code._11;

import java.util.ArrayList;
/*
 * 向上转型应用于泛型
 */
public class Main_GenericsAndUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new AppleType1());
		apples.add(new AppleType2());
		apples.add(new AppleType3());
		apples.add(new AppleType4());
		for (Apple apple : apples) {
			System.out.println(apple);
			//结果输出调用了Object的tostring方法，打印类名和hashcode()产生的散列码
		}
	}

}
