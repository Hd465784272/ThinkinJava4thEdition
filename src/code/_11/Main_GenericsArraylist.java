package code._11;

import java.util.ArrayList;
/*
 * 			ArrayList
 */
public class Main_GenericsArraylist {
	public static void main(String args[]){
		@SuppressWarnings("unchecked")
		ArrayList alist =new ArrayList();
		for(int i = 0;i < 3; i++){
			alist.add(new Apple());
		}
		alist.add(new Orange());
		for(int i = 0;i < alist.size(); i++){
			((Apple)alist.get(i)).id();
		}
		System.out.println(alist.toString());
	}
}
/*tip:
1、一个类没有显示的声明继承自那个类，那么它自动地集成自object。
2、ArrayList的add()方法将apple和orange对象加入容器，
	无论编辑期还是执行期间都不会有问题。当你使用ArrayList的get方法时，
	你得到的只是object引用，所以必须将其壮行为Apple。当你试图将orange
	对象转型为Apple时，就会报异常形式的错误了。
*/